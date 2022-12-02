import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactList {
    double contactNumber;
    String name;

    public double getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(double contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContactList(double contactNumber, String name) {
        this.contactNumber = contactNumber;
        this.name = name;
    }


}

class PhoneBook{
    public static void main(String[] args){
        ArrayList<ContactList> contacts=new ArrayList<>();
        ContactList c1=new ContactList(515672,"reddy");
        ContactList c2=new ContactList(515671,"meghana");
        ContactList c3=new ContactList(515670,"prashanti");
        ContactList c4=new ContactList(515673,"supraja");
        contacts.add(c1);
        contacts.add(c2);
        contacts.add(c3);
        contacts.add(c4);
        for(ContactList c:contacts){
            System.out.println("name is:"+c.name+" "+"contact Number is:"+" "+c.contactNumber);
        }
        System.out.println("" +
                "" +
                "");
        System.out.println("-----------after adding contact number--------");//adding contact number
        contacts.add(4,new ContactList(515674,"bhavana"));
        for(ContactList c:contacts){
            System.out.println("name is:"+c.name+" "+"contact Number is:"+" "+c.contactNumber);
        }
        System.out.println("" +
                "" +
                "" +
                "");
        System.out.println("After removing contact number");
        contacts.remove(3);
        for(ContactList c:contacts) {
            System.out.println("name is:" + c.name + " " + "contact Number is:" + " " + c.contactNumber);
        }
        System.out.println("enter number to view contact");
        Scanner s=new Scanner(System.in);
        double d=s.nextDouble();
        for(ContactList i:contacts){
        if(i.getContactNumber() == d){
        System.out.println(" contact is there");

    }
        else{
            System.out.println(" have no contact");
        }
        
}}}
    //Simulate a PhoneBook application
// where you can add Contacts, update a contact, delete a contact ,
      //  view all contacts and also view a contact based on contact number.






