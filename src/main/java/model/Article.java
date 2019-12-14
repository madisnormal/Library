package model;

public class Article implements Publication{

    private String title;
    private String author;
    private String publisher;
    private String links;
    private String type;

    public Article(String title, String author, String publisher, String links, String type) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.links = links;
        this.type = type;
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

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", links='" + links + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
