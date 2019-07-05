package com.arika.ArchiveDatabase.repositories.Permission;

import com.arika.ArchiveDatabase.models.Permission;
import com.arika.ArchiveDatabase.projections.EmbedInfoInPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedInfoInPermission.class)
public interface PermissionRepository extends JpaRepository<Permission, Long>, PermissionRepositoryCustom{
}
