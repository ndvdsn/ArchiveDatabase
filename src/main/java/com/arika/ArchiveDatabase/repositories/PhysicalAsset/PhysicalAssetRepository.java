package com.arika.ArchiveDatabase.repositories.PhysicalAsset;

import com.arika.ArchiveDatabase.models.PhysicalAsset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.arika.ArchiveDatabase.projections.EmbedInfoInPhysicalAsset;

@RepositoryRestResource(excerptProjection = EmbedInfoInPhysicalAsset.class)
public interface PhysicalAssetRepository extends JpaRepository<PhysicalAsset, Long>, PhysicalAssetRepositoryCustom {
}
