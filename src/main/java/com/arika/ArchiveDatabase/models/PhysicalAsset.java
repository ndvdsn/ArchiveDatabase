package com.arika.ArchiveDatabase.models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "physicalAssets")

// an asset is a physical item in the archive. Not a digital archive item. Those come under documents.
public class PhysicalAsset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "format")
    private String format;

    @Column(name = "description")
    private String description;

    @Column(name = "itemNumber")
    private String itemNumber;

    @Column(name = "notes")
    private String notes;

    @Column(name = "location")
    private String location;

    @Column(name="documents")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "physicalAsset", fetch = FetchType.LAZY)
    private List<Document> documents;


    @Column(name="artists")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(joinColumns = {@JoinColumn(name = "physicalAsset_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "artist_id", nullable = false, updatable = false)}
    )
    private List<Artist> artists;

    @ManyToOne
    @JoinColumn(name="singleEvent_id", nullable = false)
    private SingleEvent singleEvent;

    public PhysicalAsset(String type, String format, String description, String itemNumber, String notes, String location, SingleEvent singleEvent) {
        this.type = type;
        this.format = format;
        this.description = description;
        this.itemNumber = itemNumber;
        this.notes = notes;
        this.location = location;
        this.documents = new ArrayList<Document>();
        this.artists = new ArrayList<Artist>();
        this.singleEvent = singleEvent;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public SingleEvent getSingleEvent() {
        return singleEvent;
    }

    public void setSingleEvent(SingleEvent singleEvent) {
        this.singleEvent = singleEvent;
    }
}
