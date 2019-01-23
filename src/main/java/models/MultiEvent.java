package models;

public class MultiEvent {

    private Long id;

    private String multiEventName;

    private int year;


    public MultiEvent(String name, int year){
        this.multiEventName = multiEventName;
        this.year = year;
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
