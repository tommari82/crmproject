package org.tmsoft.crmproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.tmsoft.crmproject.entity.UsersEntity;

/**
 * Created by tomasmrianek on 19.08.14.
 */
public interface UsersRepository extends JpaRepository<UsersEntity, Long> {

	@Query("select u from UsersEntity u where u.name = :userName and u.passwd = :userPass")
	UsersEntity getUserByNameAndPasswd(@Param("userName") String userName, @Param("userPass") String userPass);
}
