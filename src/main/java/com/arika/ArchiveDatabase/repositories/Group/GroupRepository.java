package com.arika.ArchiveDatabase.repositories.Group;

import com.arika.ArchiveDatabase.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.arika.ArchiveDatabase.projections.EmbedInfoInGroup;

@RepositoryRestResource(excerptProjection = EmbedInfoInGroup.class)
public interface GroupRepository extends JpaRepository<Group, Long>, GroupRepositoryCustom {
}
