package com.arika.ArchiveDatabase.projections;

import com.arika.ArchiveDatabase.models.Artist;
import com.arika.ArchiveDatabase.models.Permission;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;


@Projection(name = "embedInfoInDocument", types = Permission.class)

public interface EmbedInfoInPermission {

    Long getId();
    boolean getDownloadable();
    boolean getStreamable();
    boolean getPermissionGiven();
    String getRights();
    String getRightsHolder();
    String getPermissioNotes();
    String getDateContacted();
    List<Artist> getArtists();


}
