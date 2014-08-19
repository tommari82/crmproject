package org.tmsoft.crmproject.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by tomasmrianek on 19.08.14.
 */
@Entity
@Table(name = "TASK", schema = "CRMPROJECT", catalog = "CRMPROJECT")
public class TaskEntity implements Serializable {
	private static final long serialVersionUID = -2251731227498793712L;
	private int id;
	private String taskCode;
	private String taskName;
	private String taskStatus;
	private Timestamp taskDevStart;
	private Timestamp taskDevEnd;
	private Timestamp taskTestStart;
	private Timestamp taskTestEnd;
	private Timestamp taskAnalStart;
	private Timestamp taskAnalEnd;
	private Integer idTest;
	private String devDescription;
	private String analDescription;
	private String testDescription;
	private ProjectEntity projectEntity;
	private UsersEntity developer;
	private UsersEntity analyst;
	private UsersEntity tester;


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROJECTSQ")
	@SequenceGenerator(name = "PROJECTSQ", sequenceName = "crmproject.sq_task", initialValue = 1, schema = "crmproject", allocationSize = 1)

	@Column(name = "ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "TASK_CODE")
	public String getTaskCode() {
		return taskCode;
	}

	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

	@Basic
	@Column(name = "TASK_NAME")
	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@Basic
	@Column(name = "TASK_STATUS")
	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	@Basic
	@Column(name = "TASK_DEV_START")
	public Timestamp getTaskDevStart() {
		return taskDevStart;
	}

	public void setTaskDevStart(Timestamp taskDevStart) {
		this.taskDevStart = taskDevStart;
	}

	@Basic
	@Column(name = "TASK_DEV_END")
	public Timestamp getTaskDevEnd() {
		return taskDevEnd;
	}

	public void setTaskDevEnd(Timestamp taskDevEnd) {
		this.taskDevEnd = taskDevEnd;
	}

	@Basic
	@Column(name = "TASK_TEST_START")
	public Timestamp getTaskTestStart() {
		return taskTestStart;
	}

	public void setTaskTestStart(Timestamp taskTestStart) {
		this.taskTestStart = taskTestStart;
	}

	@Basic
	@Column(name = "TASK_TEST_END")
	public Timestamp getTaskTestEnd() {
		return taskTestEnd;
	}

	public void setTaskTestEnd(Timestamp taskTestEnd) {
		this.taskTestEnd = taskTestEnd;
	}

	@Basic
	@Column(name = "TASK_ANAL_START")
	public Timestamp getTaskAnalStart() {
		return taskAnalStart;
	}

	public void setTaskAnalStart(Timestamp taskAnalStart) {
		this.taskAnalStart = taskAnalStart;
	}

	@Basic
	@Column(name = "TASK_ANAL_END")
	public Timestamp getTaskAnalEnd() {
		return taskAnalEnd;
	}

	public void setTaskAnalEnd(Timestamp taskAnalEnd) {
		this.taskAnalEnd = taskAnalEnd;
	}

	@Basic
	@Column(name = "ID_TEST")
	public Integer getIdTest() {
		return idTest;
	}

	public void setIdTest(Integer idTest) {
		this.idTest = idTest;
	}

	@Basic
	@Column(name = "DEV_DESCRIPTION")
	public String getDevDescription() {
		return devDescription;
	}

	public void setDevDescription(String devDescription) {
		this.devDescription = devDescription;
	}

	@Basic
	@Column(name = "ANAL_DESCRIPTION")
	public String getAnalDescription() {
		return analDescription;
	}

	public void setAnalDescription(String analDescription) {
		this.analDescription = analDescription;
	}

	@Basic
	@Column(name = "TEST_DESCRIPTION")
	public String getTestDescription() {
		return testDescription;
	}

	public void setTestDescription(String testDescription) {
		this.testDescription = testDescription;
	}

	@ManyToOne
	@JoinColumn(name = "id_project", nullable = false)
	public ProjectEntity getProjectEntity() {
		return projectEntity;
	}

	public void setProjectEntity(ProjectEntity projectEntity) {
		this.projectEntity = projectEntity;
	}

	@ManyToOne
	@JoinColumn(name = "id_dev", nullable = false)
	public UsersEntity getDeveloper() {
		return developer;
	}

	public void setDeveloper(UsersEntity developer) {
		this.developer = developer;
	}

	@ManyToOne
	@JoinColumn(name = "id_anal", nullable = false)
	public UsersEntity getAnalyst() {
		return analyst;
	}

	public void setAnalyst(UsersEntity analyst) {
		this.analyst = analyst;
	}

	@ManyToOne
	@JoinColumn(name = "id_test", nullable = false)
	public UsersEntity getTester() {
		return tester;
	}

	public void setTester(UsersEntity tester) {
		this.tester = tester;
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
		TaskEntity rhs = (TaskEntity) obj;
		return new EqualsBuilder()
				.append(this.id, rhs.id)
				.append(this.taskCode, rhs.taskCode)
				.append(this.taskName, rhs.taskName)
				.append(this.taskStatus, rhs.taskStatus)
				.append(this.taskDevStart, rhs.taskDevStart)
				.append(this.taskDevEnd, rhs.taskDevEnd)
				.append(this.taskTestStart, rhs.taskTestStart)
				.append(this.taskTestEnd, rhs.taskTestEnd)
				.append(this.taskAnalStart, rhs.taskAnalStart)
				.append(this.taskAnalEnd, rhs.taskAnalEnd)
				.append(this.idTest, rhs.idTest)
				.append(this.devDescription, rhs.devDescription)
				.append(this.analDescription, rhs.analDescription)
				.append(this.testDescription, rhs.testDescription)
				.append(this.projectEntity, rhs.projectEntity)
				.append(this.developer, rhs.developer)
				.append(this.analyst, rhs.analyst)
				.append(this.tester, rhs.tester)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(id)
				.append(taskCode)
				.append(taskName)
				.append(taskStatus)
				.append(taskDevStart)
				.append(taskDevEnd)
				.append(taskTestStart)
				.append(taskTestEnd)
				.append(taskAnalStart)
				.append(taskAnalEnd)
				.append(idTest)
				.append(devDescription)
				.append(analDescription)
				.append(testDescription)
				.append(projectEntity)
				.append(developer)
				.append(analyst)
				.append(tester)
				.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("taskCode", taskCode)
				.append("taskName", taskName)
				.append("taskStatus", taskStatus)
				.append("taskDevStart", taskDevStart)
				.append("taskDevEnd", taskDevEnd)
				.append("taskTestStart", taskTestStart)
				.append("taskTestEnd", taskTestEnd)
				.append("taskAnalStart", taskAnalStart)
				.append("taskAnalEnd", taskAnalEnd)
				.append("idTest", idTest)
				.append("devDescription", devDescription)
				.append("analDescription", analDescription)
				.append("testDescription", testDescription)
				.append("projectEntity", projectEntity)
				.append("developer", developer)
				.append("analyst", analyst)
				.append("tester", tester)
				.toString();
	}
}
