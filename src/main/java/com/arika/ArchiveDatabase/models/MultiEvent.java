package com.arika.ArchiveDatabase.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class MultiEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "multiEventName")
    private String multiEventName;

    @Column(name = "year")
    private int year;

    @JsonIgnoreProperties("raids")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "multiEvent", fetch = FetchType.LAZY)
    private List<SingleEvent> events;


    public MultiEvent(String name, int year){
        this.multiEventName = multiEventName;
        this.year = year;
        this.events = new ArrayList<SingleEvent>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMultiEventName() {
        return multiEventName;
    }

    public void setMultiEventName(String multiEventName) {
        this.multiEventName = multiEventName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<SingleEvent> getEvents() {
        return events;
    }

    public void setEvents(List<SingleEvent> events) {
        this.events = events;
    }
}
