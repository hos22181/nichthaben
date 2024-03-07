package at.spg.projectkiesslinghossain.presentation.api;

import at.spg.projectkiesslinghossain.domain.User;
import at.spg.projectkiesslinghossain.service.UserService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private final String USER_API_URL = "http://localhost:8080/user";

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/users")
    public HttpEntity<List<User>> getUsers() {
        List<User> users = userService.getUsers();
        return (users.isEmpty())
                ? ResponseEntity.noContent().build()
                : ResponseEntity.ok(users);
    }

    @GetMapping("/api/user")
    public String getUser() {
        List<User> users = new RestTemplate().exchange(USER_API_URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {}).getBody();

        if (users != null) {
            User user_id_7 = users.stream().filter(user -> user.getUserId() == 21).findFirst().orElse(null);
            return (user_id_7 != null) ? user_id_7.getFirstName() : "Benutzer mit ID 7 nicht gefunden";
        } else {
            return "Benutzerliste nicht verfügbar";
        }
    }
}
