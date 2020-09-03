/**
 * 
 */
package Vikki.APP.repositery;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Vikki.APP.Domain.Project;

/**
 * @author vsundesha
 *
 */
@Repository
public interface ProjectCrudRepository extends CrudRepository<Project, Long>{
	@Override
	Iterable<Project> findAllById(Iterable<Long> ids) ;
}
