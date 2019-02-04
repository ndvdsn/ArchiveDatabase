package projections;

import models.Artist;
import models.MultiEvent;
import models.SingleEvent;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.List;

@Projection(name = "embedInfoInSingleEvent", types = SingleEvent.class)
public interface EmbedInfoInSingleEvent {
    Long getId();
    String getTitle();
    Date getDate();
    String getLocation();
    String getVenue();
    List<Artist> getArtists();
    MultiEvent getMultiEvent();
}
