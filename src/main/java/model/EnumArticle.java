package model;

public enum EnumArticle {
    ARTICLE1("abc", "Carolyn Wilke", "LOL publishing", "What is life? : the physical aspect of the living cell"),
    ARTICLE2("zxc", "Rose Charon Cassidy", "Soviet publishing", "-") ,
    ARTICLE3("qwerty", "Tommy Angelo", "Lost Heaven", "abc") ,
    ARTICLE4("asdf", "Chosen One", "Kyiv super mega pub.", "The art of computer programming,zxc");

    private String title;
    private String author;
    private String publisher;
    private String links;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getLinks() {
        return links;
    }

    EnumArticle(String title, String author, String publisher, String links) {
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.links=links;
    }
    @Override
    public String toString() {
        return  title +
                ", " + author +
                ", " + publisher +
                ".";
    }

}
