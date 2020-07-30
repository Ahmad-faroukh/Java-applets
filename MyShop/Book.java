package Archive.MyShop;

public class Book extends Product {
    private String publisher ;
    private int YearPublished ;

    public Book(double price, String name, String publisher, int yearPublished) {
        super(price, name);
        this.publisher = publisher;
        YearPublished = yearPublished;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublished() {
        return YearPublished;
    }

    public void setYearPublished(int yearPublished) {
        YearPublished = yearPublished;
    }
}
