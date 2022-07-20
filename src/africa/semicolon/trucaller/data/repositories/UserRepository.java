package africa.semicolon.trucaller.data.repositories;

import africa.semicolon.trucaller.data.models.User;

import java.util.List;

public interface UserRepository {
    User addUser(User user);
    void delete(User user);
    void delete(int id);
    User findById(int id);
    User findByUsername(String username);
    List<User> findAll();

}
