package midbreak;

import java.util.ArrayList;

public class Users {

    private String name;
    private String email;
    private String password;
    public ArrayList< Contact > contacts;

    public Users(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        contacts = new ArrayList<Contact>();
    }
//
//    public void addContact(int number, String name) {
//        Contact contact = new Contact(name, number);
//        contacts.add(contact);
//
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


public Boolean addContact(Contact contact) {
    if (findPosition(contact) >= 0) {
        System.out.println("Contact already is phone");
        return false;
    } else {
        contacts.add(contact);
    }

    return true;
}

    public ArrayList < Contact > getContacts() {
        return contacts;
    }

    public void updateContact(Contact oldContact, Contact newContact) {
        if (findPosition(oldContact) >= 0) {
            contacts.set(findPosition(oldContact), newContact);
        } else {
            System.out.println("Contact does not exist");
        }
    }

    public void removeContact(Contact contact) {
        if (findPosition(contact) >= 0) {
            contacts.remove(findPosition(contact));
        } else {
            System.out.println("No contact");
        }
    }

    public int searchContact(Contact contact) {
        int position = findPosition(contact);
        if (contacts.contains(contact)) {
            System.out.println("Item found at position");
            return position;
        }
        System.out.println("Not found");
        return -1;
    }



    private int findPosition(Contact contact) {
        return this.contacts.indexOf(contact);

    }

    private int findPosition(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login(String email, String password) {
        if(emailValid(email) && passwordValid(password)) {
            return true;
        }
       else {
            System.out.println("Invalid email or password");

            return false;
        }
    }

    public boolean emailValid(String email) {
        return getEmail().equalsIgnoreCase(email);
    }
    public Boolean passwordValid(String password) {
        return getEmail().equals(email);
    }



}
