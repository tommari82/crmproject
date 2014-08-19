package org.tmsoft.crmproject.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by tomasmrianek on 19.08.14.
 */
@Entity
@Table(name = "USERS_ROLES", schema = "CRMPROJECT", catalog = "CRMPROJECT")
public class UsersRolesEntity implements Serializable {
	private static final long serialVersionUID = 631557304275414480L;
	private Long id;
	private UsersEntity usersEntity;
	private RolesEntity rolesEntity;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERSROLESSQ")
	@SequenceGenerator(name = "USERSROLESSQ", sequenceName = "crmproject.sq_users_roles", initialValue = 1, schema = "crmproject", allocationSize = 1)
	@Column(name = "ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name = "id_users", nullable = false)
	public UsersEntity getUsersEntity() {
		return usersEntity;
	}

	public void setUsersEntity(UsersEntity usersEntity) {
		this.usersEntity = usersEntity;
	}

	@ManyToOne
	@JoinColumn(name = "id_roles", nullable = false)
	public RolesEntity getRolesEntity() {
		return rolesEntity;
	}

	public void setRolesEntity(RolesEntity rolesEntity) {
		this.rolesEntity = rolesEntity;
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
		UsersRolesEntity rhs = (UsersRolesEntity) obj;
		return new EqualsBuilder()
				.append(this.id, rhs.id)
				.append(this.usersEntity, rhs.usersEntity)
				.append(this.rolesEntity, rhs.rolesEntity)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(id)
				.append(usersEntity)
				.append(rolesEntity)
				.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("usersEntity", usersEntity)
				.append("rolesEntity", rolesEntity)
				.toString();
	}
}
