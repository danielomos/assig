package africa.semicolon.trucaller.data.repositories;

import africa.semicolon.trucaller.data.models.Contact;

import java.util.List;

public interface ContactRepository {
    Contact save(Contact contact);
    void delete(Contact contact);
    void delete(int id);
    Contact findById(int id);
    List<Contact> findByFirstName(String firstName);
    List<Contact> findByLastName( String lastName);
    List<Contact> findAll();

}
