package com.arika.ArchiveDatabase.projections;

import com.arika.ArchiveDatabase.models.MultiEvent;
import com.arika.ArchiveDatabase.models.SingleEvent;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedInfoInMultiEvent", types = MultiEvent.class)
public interface EmbedInfoInMultiEvent {
    Long getId();
    String getMultiEventName();
    int getYear();
    List<SingleEvent> getSingleEvents();
}
