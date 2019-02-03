package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class SingleEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name = "date")
    private int date;

    @Column(name = "location")
    private String location;

    @Column(name = "venue")
    private String venue;

    @JsonIgnoreProperties("singleEvents")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "artists_singleEvents",
            joinColumns = {@JoinColumn(name = "singleEvent_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="artist_id", nullable = false, updatable = false)}
    )
    private List<Artist> artists;

    @ManyToOne
    @JoinColumn(name="multiEvent_id", nullable=false)
    private MultiEvent multiEvent;


    public SingleEvent(String title, int date, String location, String venue, MultiEvent multiEvent){

        this.title = title;
        this.date = date;
        this.location = location;
        this.venue = venue;
        this.artists = new ArrayList<Artist>();
        this.multiEvent = multiEvent;



    }

    public SingleEvent(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public MultiEvent getMultiEvent() {
        return multiEvent;
    }

    public void setMultiEvent(MultiEvent multiEvent) {
        this.multiEvent = multiEvent;
    }
}
