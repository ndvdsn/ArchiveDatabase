package com.arika.ArchiveDatabase.projections;

import com.arika.ArchiveDatabase.models.Artist;
import com.arika.ArchiveDatabase.models.Permission;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;


@Projection(name = "embedInfoInPermission", types = Permission.class)

public interface EmbedInfoInPermission {

    Long getId();
    String getDownloadable();
    String getStreamable();
    String getPermissionGiven();
    String getRights();
    String getRightsHolder();
    String getPermissionNotes();
    String getDateContacted();
    Artist getArtist();


}

