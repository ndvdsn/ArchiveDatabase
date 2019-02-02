package repositories.Artist;

import models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface ArtistRepository extends JpaRepository<Artist, Long>, ArtistRepositoryCustom {
}
