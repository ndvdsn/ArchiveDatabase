package projections;

import models.Artist;
import models.Group;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedInfoInGroup", types = Group.class)
public interface EmbedInfoInGroup {

    Long getId();
    String getName();
    List<Artist> getArtists();
}
