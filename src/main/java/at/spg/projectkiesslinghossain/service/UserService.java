package at.spg.projectkiesslinghossain.service;

import at.spg.projectkiesslinghossain.domain.User;
import at.spg.projectkiesslinghossain.persistence.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

}
