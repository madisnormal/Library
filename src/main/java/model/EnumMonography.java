package model;

public enum EnumMonography {
    MONOGRAPHY1("The principles of quantum mechanics", "Paul Dirac", "Clarendon Press", "The collected papers of Albert Einstein,What is life? : the physical aspect of the living cell"),
    MONOGRAPHY2("The art of computer programming", "Donald Knuth", "Addison-Wesley", "-") ,
    MONOGRAPHY3("The collected papers of Albert Einstein", "Albert Einstein", "EPP", "-") ,
    MONOGRAPHY4("What is life? : the physical aspect of the living cell", "Erwin Schrödinger", "Trinity College", "The collected papers of Albert Einstein");

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

    private String title;
    private String author;
    private String publisher;
    private String links;

    EnumMonography(String title, String author, String publisher, String links) {
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
