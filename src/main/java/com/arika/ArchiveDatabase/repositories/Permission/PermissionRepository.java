package com.arika.ArchiveDatabase.repositories.Permission;

import com.arika.ArchiveDatabase.models.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Long>, PermissionRepositoryCustom{
}
