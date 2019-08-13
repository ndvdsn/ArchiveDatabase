package com.arika.ArchiveDatabase.projections;

import com.arika.ArchiveDatabase.models.Artist;
import com.arika.ArchiveDatabase.models.Document;
import com.arika.ArchiveDatabase.models.PhysicalAsset;
import com.arika.ArchiveDatabase.models.SingleEvent;
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
    List <Document> getDocuments();
    List <Artist> getArtists();
    SingleEvent getSingleEvent();
}
