package org.tmsoft.crmproject.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by tomasmrianek on 19.08.14.
 */
@Entity
@Table(name = "USERS", schema = "CRMPROJECT", catalog = "CRMPROJECT")
public class UsersEntity implements Serializable {
	private static final long serialVersionUID = 3389813438124367414L;
	private Long id;
	private String name;
	private String passwd;
	private List<UsersRolesEntity> usersRolesEntities;
	private List<TaskEntity> developer;
	private List<TaskEntity> analyst;
	private List<TaskEntity> tester;


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERSSQ")
	@SequenceGenerator(name = "USERSSQ", sequenceName = "crmproject.sq_users", initialValue = 1, schema = "crmproject", allocationSize = 1)
	@Column(name = "ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Basic
	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "PASSWD")
	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@OneToMany(mappedBy = "usersEntity")
	public List<UsersRolesEntity> getUsersRolesEntities() {
		return usersRolesEntities;
	}

	public void setUsersRolesEntities(List<UsersRolesEntity> usersRolesEntities) {
		this.usersRolesEntities = usersRolesEntities;
	}

	@OneToMany(mappedBy = "developer")
	public List<TaskEntity> getDeveloper() {
		return developer;
	}

	public void setDeveloper(List<TaskEntity> developer) {
		this.developer = developer;
	}

	@OneToMany(mappedBy = "analyst")
	public List<TaskEntity> getAnalyst() {
		return analyst;
	}

	public void setAnalyst(List<TaskEntity> analyst) {
		this.analyst = analyst;
	}

	@OneToMany(mappedBy = "tester")
	public List<TaskEntity> getTester() {
		return tester;
	}

	public void setTester(List<TaskEntity> tester) {
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
		UsersEntity rhs = (UsersEntity) obj;
		return new EqualsBuilder()
				.append(this.id, rhs.id)
				.append(this.name, rhs.name)
				.append(this.passwd, rhs.passwd)
				.append(this.usersRolesEntities, rhs.usersRolesEntities)
				.append(this.developer, rhs.developer)
				.append(this.analyst, rhs.analyst)
				.append(this.tester, rhs.tester)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(id)
				.append(name)
				.append(passwd)
				.append(usersRolesEntities)
				.append(developer)
				.append(analyst)
				.append(tester)
				.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("name", name)
				.append("passwd", passwd)
				.append("usersRolesEntities", usersRolesEntities)
				.append("developer", developer)
				.append("analyst", analyst)
				.append("tester", tester)
				.toString();
	}
}
