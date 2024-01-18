package at.spg.projectkiesslinghossain.controllerClasses;

import at.spg.projectkiesslinghossain.allClasses.Listing;
import at.spg.projectkiesslinghossain.enumClasses.ProductCondition;
import at.spg.projectkiesslinghossain.enumClasses.VehicleCondition;
import at.spg.projectkiesslinghossain.allClasses.ProductListing;
import at.spg.projectkiesslinghossain.allClasses.PropertyListing;
import at.spg.projectkiesslinghossain.enumClasses.PropertyType;
import at.spg.projectkiesslinghossain.allClasses.User;
import at.spg.projectkiesslinghossain.allClasses.VehicleListing;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ListingController {

    @GetMapping("/listing")
    public List<Listing> getRandomListings() {
        List<Listing> listings = new ArrayList<>();

        listings.add(new PropertyListing(2, "4-Zimmer Wohnung im 12. Bezirk ", "Wunderschöne Wohnung im 12. Bezirk mit 3 Schlafzimmer, gute Lage, renoviert usw bla bla",
                400_000, LocalDate.now(), true, "St. Pöllten", PropertyType.APARTMENT,100,4,"Meidlinger Hauptstraße 23, 1120 Wien",1977, new User()));

        listings.add(new ProductListing(1,"iPhone 12 Pro", ProductCondition.NEW,"Apple" ,"neues iphone, sehr gute qualität, sehr gut, 128 gb speicher und so...",
                300 ,LocalDate.now(),new User(),true,"vienna"));

        listings.add(new VehicleListing(1,"Mercedes AMG","Audi","AMG",2020,120, VehicleCondition.NEW_LIKE,
                "Electric", "ein sehr neues und gutes auto, wenig gefahren und ja elektrisch und so und ja bei frage melden und ja ka ",60_000,LocalDate.now(), findUserId3(),true,"vienna"));

        return listings;
    }


    public User findUserId3() {
        List<User> users = new RestTemplate().exchange("http://localhost:8080/user", HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {}).getBody();

        if (users != null) {
            User searchedUser = users.stream().filter(user -> user.getUserId() == 3).findFirst().orElse(null);
            if (searchedUser != null) {
                return searchedUser;
            } else {
                throw new RuntimeException("Benutzer mit ID 3 nicht gefunden");
            }
        } else {
            throw new RuntimeException("Benutzerliste nicht verfügbar");
        }
    }


}
