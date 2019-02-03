package projections;

import models.Artist;
import models.Document;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedInfoInDocument", types = Document.class)
public interface EmbedInfoInDocument {
    Long getId();
    String getType();
    String getFileName();
    String getFormat();
    Double getFileSize();
    Double getDuration();
    String getDocumentNotes();
    String getHierarchy();
    String getSingleEventName();
    List<Artist> getArtists();
}
