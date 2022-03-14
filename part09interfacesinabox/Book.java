public class Book implements Packable {
    private String author;
    private String book;
    private Double weight;

    public Book (String author, String book, double weight) {
        this.author = author;
        this.book = book;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.book;
    }
}
