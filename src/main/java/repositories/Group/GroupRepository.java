package repositories.Group;

import models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import projections.EmbedInfoInGroup;

@RepositoryRestResource(excerptProjection = EmbedInfoInGroup.class)
public interface GroupRepository extends JpaRepository<Group, Long>, GroupRepositoryCustom {
}
