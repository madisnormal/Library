package model;

public class Monography implements Publication{

    private String title;
    private String author;
    private String publisher;
    private String links;
    private String pages;

    public Monography(String title, String author, String publisher, String links, String pages) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.links = links;
        this.pages = pages;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getPublisher() {
        return publisher;
    }

    @Override
    public String getLinks() {
        return links;
    }

    @Override
    public String compareStr(){
        return getTitle() + getAuthor() + getPublisher();
    }

    public String getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Monography{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", links='" + links + '\'' +
                ", pages='" + pages + '\'' +
                '}';
    }
}
