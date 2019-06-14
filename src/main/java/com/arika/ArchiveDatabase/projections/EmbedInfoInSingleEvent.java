package com.arika.ArchiveDatabase.projections;

import com.arika.ArchiveDatabase.models.Artist;
import com.arika.ArchiveDatabase.models.MultiEvent;
import com.arika.ArchiveDatabase.models.SingleEvent;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedInfoInSingleEvent", types = SingleEvent.class)
public interface EmbedInfoInSingleEvent {
    Long getId();
    String getTitle();
    String getDate();
    String getTime();
    String getLocation();
    String getVenue();
    List<Artist> getArtists();
    MultiEvent getMultiEvent();
}
