package org.tmsoft.crmproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tmsoft.crmproject.entity.UsersEntity;

/**
 * Created by tomasmrianek on 19.08.14.
 */
public interface UsersRepository extends JpaRepository<UsersEntity, Long> {
}
