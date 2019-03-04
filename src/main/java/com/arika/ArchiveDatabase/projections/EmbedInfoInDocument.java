package com.arika.ArchiveDatabase.projections;

import com.arika.ArchiveDatabase.models.Artist;
import com.arika.ArchiveDatabase.models.Document;
import com.arika.ArchiveDatabase.models.Permission;
import com.arika.ArchiveDatabase.models.SingleEvent;
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
    SingleEvent getSingleEvent();
    List<Artist> getArtists();
    List<Permission> getPermissions();
}
