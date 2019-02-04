package projections;

import models.Artist;
import models.Group;
import models.SingleEvent;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedInfoInArtist", types = Artist.class)
public interface EmbedInfoInArtist {
    Long getId();
    String getName();
    String getCountry();
    Group getGroup();
    List<SingleEvent> getSingleEvents();
}
