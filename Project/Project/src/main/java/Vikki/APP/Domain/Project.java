package Vikki.APP.Domain;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Project {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@NotBlank(message="project name is required")
	private String projeactName;
	@NotBlank(message="project identifier required")
	@Size(min=4,max=5 , message="please use 4 to 5 character")
	@Column(updatable=false , unique=true)
	private String projectIdetifier;
	@NotBlank(message="project description required")
	private String description ;
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date startDate;
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date endDate;
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date createDate;
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date updateDate;
	
	public Project() {

	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getProjeactName() {
		return projeactName;
	}

	public void setProjeactName(String projeactName) {
		this.projeactName = projeactName;
	}

	public String getProjectIdetifier() {
		return projectIdetifier;
	}

	public void setProjectIdetifier(String projectIdetifier) {
		this.projectIdetifier = projectIdetifier;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@PrePersist
	protected void onCreate() {
	this.createDate=new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updateDate= new Date();
	}
	
	
}
