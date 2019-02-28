package com.arika.ArchiveDatabase.repositories.Artist;

import com.arika.ArchiveDatabase.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.arika.ArchiveDatabase.projections.EmbedInfoInArtist;

@RepositoryRestResource(excerptProjection = EmbedInfoInArtist.class)
public interface ArtistRepository extends JpaRepository<Artist, Long>, ArtistRepositoryCustom {
}
