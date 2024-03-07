package at.spg.projectkiesslinghossain.domain;


import jakarta.persistence.Id;

import java.time.LocalDate;

public abstract class Listing {

    public Listing(int listingId, String title, String description, double price, LocalDate creationDate, boolean isActive, String location, User owner) {
        this.listingId = listingId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.creationDate = creationDate;
        this.owner = owner;
        this.isActive = isActive;
        this.location = location;
    }

    @Id
    private int listingId;

    public String title;
    public String description;
    public double price;
    public LocalDate creationDate = LocalDate.now();
    public User owner;
    public boolean isActive;
    public String location;

    public int getListingId() {
        return listingId;
    }

    public void setListingId(int listingId) {
        this.listingId = listingId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
