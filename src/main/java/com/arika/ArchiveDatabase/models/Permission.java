package com.arika.ArchiveDatabase.models;


// a permission object has the following relations:
//it belongs to an artist or is created by an artist. it relates to or points at a document (is passed into a document object

// it has the following properties
//


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
@Table(name = "permissions")

public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="downloadable")
    private String downloadable;

    @Column(name="streamable")
    private String streamable;

    @Column(name="permissionGiven")
    private String permissionGiven;

    @Column(name="rights")
    private String rights;

    @Column(name="rightsHolder")
    private String rightsHolder;

    @Column(name="permissionNotes")
    private String permissionNotes;

    @Column(name="dateContacted")
    private String dateContacted;


    @ManyToOne
    @JoinColumn(name="artist_id", nullable=false)
    private Artist artist;

    public Permission(String downloadable, String streamable, String permissionGiven, String rights, String rightsHolder, String permissionNotes, String dateContacted, Artist artist) {

        this.downloadable = downloadable;
        this.streamable = streamable;
        this.permissionGiven = permissionGiven;
        this.rights = rights;
        this.rightsHolder = rightsHolder;
        this.permissionNotes = permissionNotes;
        this.dateContacted = dateContacted;
        this.artist = artist;
    }

    public Permission(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDownloadable() {
        return downloadable;
    }

    public void setDownloadable(String downloadable) {
        this.downloadable = downloadable;
    }

    public String getStreamable() {
        return streamable;
    }

    public void setStreamable(String streamable) {
        this.streamable = streamable;
    }

    public String getPermissionGiven() {
        return permissionGiven;
    }

    public void setPermissionGiven(String permissionGiven) {
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

