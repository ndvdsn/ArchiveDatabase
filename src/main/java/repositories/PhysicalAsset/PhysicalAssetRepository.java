package repositories.PhysicalAsset;

import models.PhysicalAsset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import projections.EmbedInfoInPhysicalAsset;

@RepositoryRestResource(excerptProjection = EmbedInfoInPhysicalAsset.class)
public interface PhysicalAssetRepository extends JpaRepository<PhysicalAsset, Long>, PhysicalAssetRepositoryCustom {
}
