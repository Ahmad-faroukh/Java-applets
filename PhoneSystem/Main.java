package Archive.PhoneSystem;

public class Main {

    public static void main(String[] args) {
        Person perosn1 = new Person("Ahmad",984576414);
        Person person2 = new Person("Mohammed",988421231);
        Person person3 = new Person("Hassan",966332545);

        Contact contact1 = new Contact(perosn1,972593684);
        Contact contact2 = new Contact(person2,972594714);
        Contact contact3 = new Contact(person3,972565147);

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact(contact1);
        phoneBook.addContact(contact2);
        phoneBook.removeContact(contact3);

        System.out.println(phoneBook);

        phoneBook.findContact("Ahmad");
        phoneBook.findContact(984576414);

    }
}