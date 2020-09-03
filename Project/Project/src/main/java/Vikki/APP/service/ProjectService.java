package Vikki.APP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Vikki.APP.Domain.Project;
import Vikki.APP.repositery.ProjectCrudRepository;

@Service
public class ProjectService {
	@Autowired
	private ProjectCrudRepository projectCrudRepository;
	
	public Project saveOrUpdateProject(Project project)
	{
		return projectCrudRepository.save(project);
		
	}

}
