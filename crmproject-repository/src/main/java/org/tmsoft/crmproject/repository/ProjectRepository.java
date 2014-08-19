package org.tmsoft.crmproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tmsoft.crmproject.entity.ProjectEntity;

/**
 * Created by tomasmrianek on 19.08.14.
 */
public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
}
