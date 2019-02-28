package com.arika.ArchiveDatabase.repositories.SingleEvent;

import com.arika.ArchiveDatabase.models.SingleEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.arika.ArchiveDatabase.projections.EmbedInfoInSingleEvent;

@RepositoryRestResource(excerptProjection = EmbedInfoInSingleEvent.class)
public interface SingleEventRepository extends JpaRepository<SingleEvent, Long>, SingleEventRepositoryCustom {
}
