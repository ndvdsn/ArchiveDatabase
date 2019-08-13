package com.arika.ArchiveDatabase.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "artists")

public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    @JsonIgnoreProperties("artists")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "groups_artists",
            joinColumns = {@JoinColumn(name = "artist_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "group_id", nullable = false, updatable = false)}
    )
    private List<Group> groups;


    @JsonIgnoreProperties("artists")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "singleEvents_artists",
            joinColumns = {@JoinColumn(name = "artist_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "singleEvent_id", nullable = false, updatable = false)}
            )
    private List<SingleEvent> singleEvents;

    public Artist(String name, String country){
        this.name = name;
        this.country = country;
        this.groups = new ArrayList<Group>();
        this.singleEvents = new ArrayList<SingleEvent>();
    }

    public Artist(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public void addGroup(Group group){ this.groups.add(group);}

    public List<SingleEvent> getSingleEvents() {
        return singleEvents;
    }

    public void setSingleEvents(List<SingleEvent> singleEvents) {
        this.singleEvents = singleEvents;
    }

    public void addSingleEvent(SingleEvent singleEvent){
        this.singleEvents.add(singleEvent);
    }

}
