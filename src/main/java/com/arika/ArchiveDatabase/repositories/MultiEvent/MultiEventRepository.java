package com.arika.ArchiveDatabase.repositories.MultiEvent;

import com.arika.ArchiveDatabase.models.MultiEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.arika.ArchiveDatabase.projections.EmbedInfoInMultiEvent;

@RepositoryRestResource(excerptProjection = EmbedInfoInMultiEvent.class)
public interface MultiEventRepository extends JpaRepository<MultiEvent, Long>, MultiEventRepositoryCustom {
}
