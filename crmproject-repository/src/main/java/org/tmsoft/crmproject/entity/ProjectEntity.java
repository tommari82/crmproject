package org.tmsoft.crmproject.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by tomasmrianek on 19.08.14.
 */
@Entity
@Table(name = "PROJECT", schema = "CRMPROJECT", catalog = "CRMPROJECT")
public class ProjectEntity implements Serializable {

	private static final long serialVersionUID = -3395332076329407332L;
	private Long id;
	private String projectName;
	private String projectCode;
	private String projectStatus;
	private Timestamp projectStart;
	private Timestamp projectEnd;
	private String projectDescription;
	private List<TaskEntity> taskEntities;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROJECTSQ")
	@SequenceGenerator(name = "PROJECTSQ", sequenceName = "crmproject.sq_project", initialValue = 1, schema = "crmproject", allocationSize = 1)
	@Column(name = "ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Basic
	@Column(name = "PROJECT_NAME")
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Basic
	@Column(name = "PROJECT_CODE")
	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	@Basic
	@Column(name = "PROJECT_STATUS")
	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	@Basic
	@Column(name = "PROJECT_START")
	public Timestamp getProjectStart() {
		return projectStart;
	}

	public void setProjectStart(Timestamp projectStart) {
		this.projectStart = projectStart;
	}

	@Basic
	@Column(name = "PROJECT_END")
	public Timestamp getProjectEnd() {
		return projectEnd;
	}

	public void setProjectEnd(Timestamp projectEnd) {
		this.projectEnd = projectEnd;
	}

	@Basic
	@Column(name = "PROJECT_DESCRIPTION")
	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	@OneToMany(mappedBy = "projectEntity")
	public List<TaskEntity> getTaskEntities() {
		return taskEntities;
	}

	public void setTaskEntities(List<TaskEntity> taskEntities) {
		this.taskEntities = taskEntities;
	}


	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}
		ProjectEntity rhs = (ProjectEntity) obj;
		return new EqualsBuilder()
				.append(this.id, rhs.id)
				.append(this.projectName, rhs.projectName)
				.append(this.projectCode, rhs.projectCode)
				.append(this.projectStatus, rhs.projectStatus)
				.append(this.projectStart, rhs.projectStart)
				.append(this.projectEnd, rhs.projectEnd)
				.append(this.projectDescription, rhs.projectDescription)
				.append(this.taskEntities, rhs.taskEntities)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(id)
				.append(projectName)
				.append(projectCode)
				.append(projectStatus)
				.append(projectStart)
				.append(projectEnd)
				.append(projectDescription)
				.append(taskEntities)
				.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("projectName", projectName)
				.append("projectCode", projectCode)
				.append("projectStatus", projectStatus)
				.append("projectStart", projectStart)
				.append("projectEnd", projectEnd)
				.append("projectDescription", projectDescription)
				.append("taskEntities", taskEntities)
				.toString();
	}
}
