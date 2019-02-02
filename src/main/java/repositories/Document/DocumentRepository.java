package repositories.Document;

import models.Document;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DocumentRepository extends JpaRepository<Document, Long>, DocumentRepositoryCustom {
}
