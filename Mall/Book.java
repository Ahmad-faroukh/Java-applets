package Archive.Mall;

public abstract class Book extends Product implements BookIF {
    private String publisher;
    private int yearPublished;

    public Book(double regularPrice, String name, int quantity, String publisher, int yearPublished) {
        super(regularPrice, name, quantity);
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }

    @Override
    public String getPublisher() {
        return publisher;
    }

    @Override
    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}