package projections;

import models.PhysicalAsset;
import models.SingleEvent;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedInfoInPhysicalAsset", types = PhysicalAsset.class)
public interface EmbedInfoInPhysicalAsset {

    Long getId();
    String getType();
    String getFormat();
    String getDescription();
    String getItemNumber();
    String getNotes();
    String getLocation();
    List<SingleEvent> getSingleEvents();
}
