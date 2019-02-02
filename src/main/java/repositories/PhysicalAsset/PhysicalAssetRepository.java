package repositories.PhysicalAsset;

import models.PhysicalAsset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhysicalAssetRepository extends JpaRepository<PhysicalAsset, Long>, PhysicalAssetRepositoryCustom {
}
