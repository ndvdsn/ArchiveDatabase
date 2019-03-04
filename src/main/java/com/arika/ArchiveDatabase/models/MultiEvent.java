package com.arika.ArchiveDatabase.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "multiEvents")

public class MultiEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "multiEventName")
    private String multiEventName;

    @Column(name = "year")
    private int year;


    public MultiEvent(String name, int year){
        this.multiEventName = multiEventName;
        this.year = year;
    }

    public MultiEvent(){

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


}
