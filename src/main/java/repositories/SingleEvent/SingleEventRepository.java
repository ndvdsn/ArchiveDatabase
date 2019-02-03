package repositories.SingleEvent;

import models.SingleEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import projections.EmbedInfoInSingleEvent;

@RepositoryRestResource(excerptProjection = EmbedInfoInSingleEvent.class)
public interface SingleEventRepository extends JpaRepository<SingleEvent, Long>, SingleEventRepositoryCustom {
}
