package at.spg.projectkiesslinghossain.repositories;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId; // primary key

    private String username;
    private String hashedPassword;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDate registrationDate;
    private String profileImageUrl;
    private String phoneNumber;
    private String address;

    public UserEntity(int userId, String username, String hashedPassword, String email, String firstName, String lastName, LocalDate registrationDate, String profileImageUrl, String phoneNumber, String address) {
        this.userId=(userId);
        this.username=(username);
        this.hashedPassword=(hashedPassword);
        this.email=(email);
        this.firstName=(firstName);
        this.lastName=(lastName);
        this.registrationDate=(registrationDate);
        this.profileImageUrl=(profileImageUrl);
        this.phoneNumber=(phoneNumber);
        this.address=(address);
    }

    public UserEntity() {
        this.username = "fedexchiesa";
        this.address = "Fede Chiesa";
        this.email = "chiesa@juventus.com";
        this.firstName = "Federico";
        this.lastName = "Chiesa";
        this.hashedPassword = generateHashedPassword();
        this.phoneNumber = "123_123_123";
        this.registrationDate = LocalDate.now();
        this.profileImageUrl = "https://www.gettyimages.at/detail/nachrichtenfoto/federico-chiesa-of-italy-celebrates-after-scoring-nachrichtenfoto/1327339767";
    }

    // Getters and setters...

    private String generateHashedPassword() {
        return "dummyHashedPassword";
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
