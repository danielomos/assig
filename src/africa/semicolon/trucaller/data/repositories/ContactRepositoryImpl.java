package africa.semicolon.trucaller.data.repositories;

import africa.semicolon.trucaller.data.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactRepositoryImpl implements ContactRepository{
    private int counter;
    private List<Contact> contacts = new ArrayList<Contact>();
//    @Override
//    public Contact save(Contact contact) {
//        for (Contact c : contacts){
//            if (c.getId() == contact.getId()) {
//
//                contacts.add(contact);
//            }
//
//        }
//        counter++;
//        contact.setId(counter);
//
//        contacts.add(contact);
//
//        return contact;
//    }
@Override
public Contact save(Contact contact) {
   if (contact.getId() == 0) {
       counter++;
       contact.setId(counter);
       contacts.add(contact);
   }
   else {
     Contact oldcontact = findById(contact.getId());
     contact.setId(oldcontact.getId());
     contacts.remove(oldcontact);
     contacts.add(contact);

   }
   return contact;
}


    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public void delete(Contact contact) {
//        counter--;
//        contact.setId(counter);
            contacts.remove(contact);

        }


    @Override
    public void delete(int id) {
      Contact findcontact = findById(id);
                contacts.remove(findcontact);




    }

    @Override
    public Contact findById(int id) {
       for (Contact contact : contacts) {
           if (contact.getId() == id) {
               return contact;
           }
        }
        return null;
    }

    @Override
    public List<Contact> findByFirstName(String firstName) {
    ArrayList<Contact> contactWithFirstName = new ArrayList<Contact>();
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName))  {
                contactWithFirstName.add(contact);
                return contactWithFirstName;
            }
        }
        return null;
    }



    @Override
    public List<Contact> findByLastName(String lastName) {
        ArrayList<Contact> contactWithLastName = new ArrayList<Contact>();
        for (Contact contact : contacts) {
            if (contact.getLastName().equals(lastName))  {
                contactWithLastName.add(contact);
                return contactWithLastName;
            }
        }
        return null;
    }



    @Override
    public List<Contact> findAll() {
        return null;
    }
    public int count(){
        return contacts.size();
    }

}
