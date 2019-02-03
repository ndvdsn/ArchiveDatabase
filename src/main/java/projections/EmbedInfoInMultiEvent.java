package projections;

import models.MultiEvent;
import models.SingleEvent;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedInfoInMultiEvent", types = MultiEvent.class)
public interface EmbedInfoInMultiEvent {
    Long getId();
    String getMultiEventName();
    int getYear();
    List<SingleEvent> getSingleEvents();
}
