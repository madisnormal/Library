package model;

public class Publication {
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() { return publisher; }

    public String getLinks() { return links; }

    private String title;
    private String author;
    private String publisher;
    private String links;

    public Publication(String title, String author, String publisher, String links){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.links = links;
    }

    public String compareStr(){
        return getTitle() + getAuthor() + getPublisher();
    }

    @Override
    public String toString(){
        return title + ", " + author + ", " + publisher;
    }
}
