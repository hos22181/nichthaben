package at.spg.projectkiesslinghossain.repositories;

import at.spg.projectkiesslinghossain.repositories.UserEntity;
import at.spg.projectkiesslinghossain.repositories.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testDelete() {
        UserEntity newUser = new UserEntity(7, "testUser", "hashedPassword", "test@example.com", "Test", "User",
                LocalDate.now(), "profile.jpg", "1234567890", "Test Address");

        UserEntity result = userRepository.save(newUser);

        userRepository.deleteById(result.getUserId());

        UserEntity deletedUser = userRepository.findById(result.getUserId()).orElse(null);
        Assertions.assertNull(deletedUser);
    }


}
