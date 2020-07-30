package Archive.PhoneSystem;

import java.util.ArrayList;

public class PhoneBook {

    ArrayList<Contact> Contacts = new ArrayList<Contact>();

    public void addContact(Contact contact){
        this.Contacts.add(contact);
    }

    public void removeContact(Contact contact){
        this.Contacts.add(contact);
    }

    public void findContact(String name){
        for(Contact x : Contacts){
            if(x.getName().equals(name)){
                System.out.println(name + " Was found in your contacts");
                break;
            }else{
                System.out.println(name + " Was not found in your contacts");
                break;
            }
        }
    }

    public void findContact(int id){
        for(Contact x : Contacts){
            if(x.getId()==id){
                System.out.println(id + " Was found in your contacts");
                break;
            }else{
                System.out.println(id + " Was not found in your contacts");
                break;
            }
        }
    }

    @Override
    public String toString() {
        System.out.println("Contacts :-");
        for(Contact x : Contacts){
            System.out.println(x);
        }
        return ".";
    }
}