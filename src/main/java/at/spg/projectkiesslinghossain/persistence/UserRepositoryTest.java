package at.spg.projectkiesslinghossain.persistence;

import at.spg.projectkiesslinghossain.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testDelete() {
        /*User newUser = new User(7, "testUser", "hashedPassword", "test@example.com", "Test", "User",
                LocalDate.now(), "profile.jpg", "1234567890", "Test Address");

        User result = userRepository.save(newUser);

        userRepository.deleteById(result.getUserId());

        User deletedUser = userRepository.findById(result.getUserId()).orElse(null);
        Assertions.assertNull(deletedUser);*/
    }


}
