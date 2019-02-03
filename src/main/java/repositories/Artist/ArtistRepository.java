package repositories.Artist;

import models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import projections.EmbedInfoInArtist;

@RepositoryRestResource(excerptProjection = EmbedInfoInArtist.class)
public interface ArtistRepository extends JpaRepository<Artist, Long>, ArtistRepositoryCustom {
}
