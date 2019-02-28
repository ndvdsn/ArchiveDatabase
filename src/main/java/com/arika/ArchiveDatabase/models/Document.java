package com.arika.ArchiveDatabase.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "documents")

public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type; // eg audio or video

    @Column(name = "fileName")
    private String fileName;

    @Column(name = "format")
    private String format; // eg wav/mp3/.mov etc

    @Column(name = "fileSize")
    private Double fileSize;

    @Column(name = "duration")
    private Double duration;

    @Column(name = "documentNotes", nullable = true)
    private String documentNotes;

    @Column(name = "hierarchy")
    private String hierarchy;

    @JsonIgnoreProperties("singleEvents")
    @ManyToOne
    @JoinColumn(name = "singleEvent_id", nullable = false)
    private SingleEvent singleEvent;

    @JsonIgnoreProperties("documents")
    @ManyToOne
    @JoinColumn(name = "physicalAsset_id", nullable = true)
    private PhysicalAsset physicalAsset;


    @JsonIgnoreProperties("documents")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "document_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "artist_id", nullable = false, updatable = false)}
    )

    private List<Artist> artists;


    @JsonIgnoreProperties("documents")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "document_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "permission_id", nullable = false, updatable = false)}
    )

    private List<Permission> permissions;

//    need to get a comprehensive analysis of the data types etc. might be helpful to build up a hierachy of classes or
//    com.arika.ArchiveDatabase.models where the inheritance hierarchy matches the hierarchy of the documents: source, master, transcoded big, transcoded small etc


    public Document(String type, String fileName, String format, Double fileSize, Double duration, String documentNotes, String hierarchy, SingleEvent singleEvent) {
        this.id = id;
        this.type = type;
        this.fileName = fileName;
        this.format = format;
        this.fileSize = fileSize;
        this.duration = duration;
        this.documentNotes = documentNotes;
        this.hierarchy = hierarchy;
        this.singleEvent = singleEvent;
        this.artists = new ArrayList<Artist>();
        this.permissions = new ArrayList<Permission>();
    }

    public Document(){

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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Double getFileSize() {
        return fileSize;
    }

    public void setFileSize(Double fileSize) {
        this.fileSize = fileSize;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getDocumentNotes() {
        return documentNotes;
    }

    public void setDocumentNotes(String documentNotes) {
        this.documentNotes = documentNotes;
    }

    public String getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(String hierarchy) {
        this.hierarchy = hierarchy;
    }

    public SingleEvent getSingleEvent() {
        return singleEvent;
    }

    public void setSingleEvent(SingleEvent singleEvent) {
        this.singleEvent = singleEvent;
    }

    public PhysicalAsset getPhysicalAsset() {
        return physicalAsset;
    }

    public void setPhysicalAsset(PhysicalAsset physicalAsset) {
        this.physicalAsset = physicalAsset;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
