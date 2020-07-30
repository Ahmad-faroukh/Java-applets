package Archive.Mall;

public class ChildrenBook extends Book {
    private int age;

    public ChildrenBook(double regularPrice, String name, int quantity, String publisher, int yearPublished, int age) {
        super(regularPrice, name, quantity, publisher, yearPublished);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setYearpublished() {

    }

    @Override
    public double computeSalePrice(double sale) {
        return getRegularPrice() - sale * getRegularPrice();
    }

    @Override
    public String toString() {
        return getId()+". Children book : " + getName() + " : " + getRegularPrice() + "$ : " + getQuantity() + " : Publisher "
                + getPublisher() + " : " + " Year  "+getYearPublished()+" : Age "+getAge();
    }
}