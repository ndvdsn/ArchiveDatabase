package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnoreProperties("singleEvents")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "ensemble", fetch = FetchType.LAZY)
    private List<Artist> artists;

    public Group(Long id, String name, List<Artist> artists) {
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
