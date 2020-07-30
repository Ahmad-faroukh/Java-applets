package Archive.MyShop;

public class ChildrenBook extends Book {
    private int age ;

    public ChildrenBook(double price, String name, String publisher, int yearPublished, int age) {
        super(price, name, publisher, yearPublished);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
