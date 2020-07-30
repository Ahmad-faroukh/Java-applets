package Archive.PhoneSystem;

public class Contact extends Person {

    Person person ;
    private long number ;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Contact(Person person, long number1) {
        super(person.getName(),person.getId());
        this.person = person;
        this.number = number1;

    }
    @Override
    public String toString(){
        return "Name : " +this.person.getName() +"\nID : "+this.person.getId()+"\nPhone Number : " +this.getNumber();
    }
}