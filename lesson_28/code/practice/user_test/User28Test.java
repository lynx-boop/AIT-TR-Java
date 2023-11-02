package practice.user_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.User;

import static org.junit.jupiter.api.Assertions.*;

class User28Test {
    User28 user;
    final String email = "peter@gmail.com"; //переменная статическая (immutable)
    final String password = "12345Az!";
    @BeforeEach
    void setUp() {
        user = new User28(email, password);
    }

    @Test
    void testCorrectEmail() {
        user.setEmail("peter@yahoo.com"); //устанавливаем новый эмейл и тестируем его корректность
        assertEquals("peter@yahoo.com", user.getEmail());
    }

    @Test
    void withoutAt() {
        user.setEmail("peter.yahoo.com");
        assertEquals(email, user.getEmail());
    }
}