package midbreak;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MobilePhoneApplicationTest {
    MobilePhoneApplication app;

    @BeforeEach
    void setUp() {
        app = new MobilePhoneApplication();
    }

    @Test
    void phoneApplicationisCreated() {
        assertNotNull(app);
    }

    @Test
    void userCanResgiter() {
        Users user = new Users("Danie", "08152290374","12345");
        app.addUser(user);
        assertNotNull(app.getUserList());

    }

    @Test
    void addUser() {

    }
}