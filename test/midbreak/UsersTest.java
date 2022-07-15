package midbreak;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsersTest {
    Users user;
    @BeforeEach
    void setUp() {
        user = new Users("daniel", "Dan@gmail", "12345");
    }
    @Test
    public void userIsCreated() {
        assertNotNull(user);
    }
    @Test
    public void userHasContactList() {

        assertEquals(0,user.getContacts().size());
    }
    @Test
    public void userCanAddContact() {
        Contact contact = new Contact("Ja", "08152290374");
        user.addContact(contact);
        assertEquals(1,user.getContacts().size());
    }
    @Test
    public void userCanUpdateContact() {
        Contact contact = new Contact("Ja", "08152290374");
        user.addContact(contact);
        Contact newContact = new Contact("great", "08152290374");
        user.updateContact(contact,newContact);
        assertEquals("great", user.contacts.get(0).getName());

    }
    @Test
    public void userCanRemoveContact() {
        Contact contact = new Contact("Ja", "08152290374");
        user.addContact(contact);
        user.removeContact(contact);
        assertEquals(0,user.getContacts().size());

    }
    @Test
    public void userCanSarchThroughContactList() {
        Contact contact = new Contact("Ja", "08152290374");
        user.addContact(contact);
        Contact newContact = new Contact("great", "0811111111");
        user.addContact(newContact);

        assertEquals(1,user.searchContact(newContact));
    }
    @Test
    public void userEmailCanbeValidated() {
        assertTrue(user.emailValid("dan@gmail"));
    }

    @Test
    public void userPasswordCanbeValidated() {
        assertTrue(user.passwordValid("12345"));
    }
}