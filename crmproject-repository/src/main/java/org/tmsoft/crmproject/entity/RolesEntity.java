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
@Table(name = "ROLES", schema = "CRMPROJECT", catalog = "CRMPROJECT")
public class RolesEntity implements Serializable {
	private static final long serialVersionUID = 1529457228616140079L;
	private Long id;
	private String code;
	private String name;
	private List<UsersRolesEntity> usersRolesEntities;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROLESSQ")
	@SequenceGenerator(name = "ROLESSQ", sequenceName = "crmproject.sq_roless", initialValue = 1, schema = "crmproject", allocationSize = 1)

	@Column(name = "ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Basic
	@Column(name = "CODE")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Basic
	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy = "usersEntity")
	public List<UsersRolesEntity> getUsersRolesEntities() {
		return usersRolesEntities;
	}

	public void setUsersRolesEntities(List<UsersRolesEntity> usersRolesEntities) {
		this.usersRolesEntities = usersRolesEntities;
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
		RolesEntity rhs = (RolesEntity) obj;
		return new EqualsBuilder()
				.append(this.id, rhs.id)
				.append(this.code, rhs.code)
				.append(this.name, rhs.name)
				.append(this.usersRolesEntities, rhs.usersRolesEntities)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(id)
				.append(code)
				.append(name)
				.append(usersRolesEntities)
				.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("code", code)
				.append("name", name)
				.append("usersRolesEntities", usersRolesEntities)
				.toString();
	}
}
