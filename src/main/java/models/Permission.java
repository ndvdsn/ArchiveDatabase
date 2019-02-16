package models;


// a permission object has the following relations:
//it belongs to an artist or is created by an artist. it relates to or points at a document (is passed into a document object

// it has the following properties
//

public class Permission {

    private Long id;

    private boolean downloadable;

    private boolean streamable;

    private boolean permissionGiven;

    private String rights;

    private String rightsHolder;

    private String permissionNotes;

    private String dateContacted;

    private Artist artist;

    public Permission(Long id, boolean downloadable, boolean streamable, boolean permissionGiven, String rights, String rightsHolder, String permissionNotes, String dateContacted, Artist artist) {
        this.id = id;
        this.downloadable = downloadable;
        this.streamable = streamable;
        this.permissionGiven = permissionGiven;
        this.rights = rights;
        this.rightsHolder = rightsHolder;
        this.permissionNotes = permissionNotes;
        this.dateContacted = dateContacted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isDownloadable() {
        return downloadable;
    }

    public void setDownloadable(boolean downloadable) {
        this.downloadable = downloadable;
    }

    public boolean isStreamable() {
        return streamable;
    }

    public void setStreamable(boolean streamable) {
        this.streamable = streamable;
    }

    public boolean isPermissionGiven() {
        return permissionGiven;
    }

    public void setPermissionGiven(boolean permissionGiven) {
        this.permissionGiven = permissionGiven;
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }

    public String getRightsHolder() {
        return rightsHolder;
    }

    public void setRightsHolder(String rightsHolder) {
        this.rightsHolder = rightsHolder;
    }

    public String getPermissionNotes() {
        return permissionNotes;
    }

    public void setPermissionNotes(String permissionNotes) {
        this.permissionNotes = permissionNotes;
    }

    public String getDateContacted() {
        return dateContacted;
    }

    public void setDateContacted(String dateContacted) {
        this.dateContacted = dateContacted;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}

