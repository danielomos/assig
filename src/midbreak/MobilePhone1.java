//
//package midbreak;
//
//import java.util.ArrayList;
//
//
//class MobilePhone1 {
// private ArrayList<Users> numbers = new ArrayList<Integer>();
//
//    public MobilePhone1(int mynumber) {
//        this.mynumber = mynumber;
//        this.contacts = new ArrayList < Contact > ();
//    }
//    public MobilePhone1()
//    {
//
//    }
//
//    public Boolean addContact(Contact contact) {
//        if (findPosition(contact) >= 0) {
//            System.out.println("Contact already is phone");
//            return false;
//        } else {
//            contacts.add(contact);
//        }
//
//        return true;
//    }
//
//    public ArrayList < Contact > getContacts() {
//        return contacts;
//    }
//
//    public void updateContact(Contact oldContact, Contact newContact) {
//        if (findPosition(oldContact) >= 0) {
//            contacts.set(findPosition(oldContact), newContact);
//        } else {
//            System.out.println("Contact does not exist");
//        }
//    }
//
//    public void removeContact(Contact contact) {
//        if (findPosition(contact) >= 0) {
//            contacts.remove(findPosition(contact));
//        } else {
//            System.out.println("No contact");
//        }
//    }
//
//    public int searchContact(Contact contact) {
//        int position = findPosition(contact);
//        if (contacts.contains(contact)) {
//            System.out.println("Item found at position");
//            return position;
//        }
//        System.out.println("Not found");
//        return -1;
//    }
//
//
//
//    private int findPosition(Contact contact) {
//        return this.contacts.indexOf(contact);
//
//    }
//
//    private int findPosition(String name) {
//        for (int i = 0; i < contacts.size(); i++) {
//            Contact contact = this.contacts.get(i);
//            if (contact.getName().equals(name)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//
//}
//
