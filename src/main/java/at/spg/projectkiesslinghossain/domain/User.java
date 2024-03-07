package at.spg.projectkiesslinghossain.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User {

    /*public User(){
        this.userId=7;
        this.username="fedexchiesa";
        this.address="Fede Chiesa";
        this.email="chiesa@juventus.com";
        this.firstName="Federico";
        this.lastName="Chiesa";
        this.hashedPassword=generateHashedPassword();
        this.phoneNumber="123_123_123";
        this.registrationDate=LocalDate.now();
        this.profileImageUrl="https://www.gettyimages.at/detail/nachrichtenfoto/federico-chiesa-of-italy-celebrates-after-scoring-nachrichtenfoto/1327339767";
    }*/

    @Id
    protected int userId; //primary key
    public String username;
    protected String hashedPassword;
    protected String email;
    public String firstName;
    public String lastName;

    public LocalDate registrationDate;
    public String profileImageUrl;
    public String phoneNumber;
    public String address;


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