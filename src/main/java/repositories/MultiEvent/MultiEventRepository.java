package repositories.MultiEvent;

import models.MultiEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import projections.EmbedInfoInMultiEvent;

@RepositoryRestResource(excerptProjection = EmbedInfoInMultiEvent.class)
public interface MultiEventRepository extends JpaRepository<MultiEvent, Long>, MultiEventRepositoryCustom {
}
