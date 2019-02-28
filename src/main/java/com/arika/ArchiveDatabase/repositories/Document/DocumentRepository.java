package com.arika.ArchiveDatabase.repositories.Document;

import com.arika.ArchiveDatabase.models.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.arika.ArchiveDatabase.projections.EmbedInfoInDocument;

@RepositoryRestResource(excerptProjection = EmbedInfoInDocument.class)
public interface DocumentRepository extends JpaRepository<Document, Long>, DocumentRepositoryCustom {
}
