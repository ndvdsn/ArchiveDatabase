package models;

import java.util.List;

public class Ensemble {

    private Long id;

    private String name;

    private List<Artist> artists;

    public Ensemble(Long id, String name, List<Artist> artists) {
        this.id = id;
        this.name = name;
        this.artists = artists;
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

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }
}
