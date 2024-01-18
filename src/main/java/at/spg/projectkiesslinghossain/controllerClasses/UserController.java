package at.spg.projectkiesslinghossain.controllerClasses;

import at.spg.projectkiesslinghossain.allClasses.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private final String USER_API_URL = "http://localhost:8080/user";

    @GetMapping("/user")
    public List<User> getUser() {
        List<User> userList = new ArrayList<User>();
        User userMessi= new User(3,"pepsi","ronaldoGoat","messi@arg.com","leo","messi", LocalDate.now(),"www.messi.com/get_image/213123412.jpg","+1223123123,","Barcelona");
        User userRonaldo= new User(12,"cristiano","ronaldoGoat","cr7@por.com","cristiano","ronaldo", LocalDate.now(),"www.ronaldo.com/get_image/213123412.jpg","+12312321312312,","portugale");
        User userDybala= new User(21,"dybala","ouihweuhhiuffhuiowef","paulo@arg.com","paulo","dybala", LocalDate.now(),"www.dybala.com/get_image/213123412.jpg","+2423423123,","rom");
        userList.add(new User());
        userList.add(userMessi);
        userList.add(userRonaldo);
        userList.add(userDybala);
        return userList;
    }

    @GetMapping("/findUser")
    public String getUserNameForUser() {
        List<User> users = new RestTemplate().exchange(USER_API_URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {}).getBody();

        if (users != null) {
            User user_id_7 = users.stream().filter(user -> user.getUserId() == 21).findFirst().orElse(null);
            return (user_id_7 != null) ? user_id_7.getFirstName() : "Benutzer mit ID 7 nicht gefunden";
        } else {
            return "Benutzerliste nicht verfügbar";
        }
    }
}
