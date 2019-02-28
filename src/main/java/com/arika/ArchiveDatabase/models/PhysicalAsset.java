package com.arika.ArchiveDatabase.models;

import java.util.ArrayList;
import java.util.List;


// an asset is a physical item in the archive. Not a digital archive item. Those come under documents.
public class PhysicalAsset {

    private String type;

    private String format;

    private String description;

    private String itemNumber;

    private String notes;

    private String location;

    private List<Document> documents;

    private List<Artist> artists;

    private List<SingleEvent> singleEvents;

    public PhysicalAsset(String type, String format, String description, String itemNumber, String notes, String location) {
        this.type = type;
        this.format = format;
        this.description = description;
        this.itemNumber = itemNumber;
        this.notes = notes;
        this.location = location;
        this.documents = new ArrayList<Document>();
        this.artists = new ArrayList<Artist>();
        this.singleEvents = new ArrayList<SingleEvent>();

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public List<SingleEvent> getSingleEvents() {
        return singleEvents;
    }

    public void setSingleEvents(List<SingleEvent> singleEvents) {
        this.singleEvents = singleEvents;
    }
}
