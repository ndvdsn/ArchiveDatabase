package models;

public class Asset {

    private String type;

    private String format;

    private String description;

    private String itemNumber;

    private String notes;

    public Asset(String type, String format, String description, String itemNumber, String notes) {
        this.type = type;
        this.format = format;
        this.description = description;
        this.itemNumber = itemNumber;
        this.notes = notes;
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
}
