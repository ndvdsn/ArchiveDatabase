package repositories.Document;

import models.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import projections.EmbedInfoInDocument;

@RepositoryRestResource(excerptProjection = EmbedInfoInDocument.class)
public interface DocumentRepository extends JpaRepository<Document, Long>, DocumentRepositoryCustom {
}
