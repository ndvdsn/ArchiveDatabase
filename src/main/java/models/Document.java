package models;

public class Document {

    private Long id;

    private String type; // eg audio or video

    private String fileName;

    private String format; // eg wav/mp3/.mov etc

    private Double fileSize;

    private Double duration;

    private String documentNotes;

    private SingleEvent singleEvent;

    private Artist artist;

//    need to get a comprehensive analysis of the data types etc. might be helpful to build up a hierachy of classes or
//    models where the inheritance hierarchy matches the hierarchy of the documents: source, master, transcoded big, transcoded small etc


    public Document(Long id, String type, String fileName, String format, Double fileSize, Double duration, String documentNotes, SingleEvent singleEvent, Artist artist) {
        this.id = id;
        this.type = type;
        this.fileName = fileName;
        this.format = format;
        this.fileSize = fileSize;
        this.duration = duration;
        this.documentNotes = documentNotes;
        this.singleEvent = singleEvent;
        this.artist = artist;
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

    public SingleEvent getSingleEvent() {
        return singleEvent;
    }

    public void setSingleEvent(SingleEvent singleEvent) {
        this.singleEvent = singleEvent;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
