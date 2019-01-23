package models;

import java.util.List;

public class SingleEvent {

    private Long id;

    private String title;

    private int date;

    private String location;

    private String venue;

    private List<Artist> artists;


    public SingleEvent(String title, int date, String location, String venue){

        this.title = title;
        this.date = date;
        this.location = location;
        this.venue = venue;
        this.artists = new ArrayList<>();



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
}
