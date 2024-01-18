package at.spg.projectkiesslinghossain.allClasses;

import at.spg.projectkiesslinghossain.enumClasses.ProductCondition;

import java.time.LocalDate;

public class ProductListing extends Listing  {

    public ProductListing(int listingId, String title, ProductCondition productCondition, String manufacturer, String description, double price, LocalDate creationDate, User owner, boolean isActive, String location) {
        super(listingId, title, description, price, creationDate, isActive, location,owner);
        this.manufacturer= manufacturer;
        this.condition= String.valueOf(productCondition.toString());

    }
    private String productName;
    private String condition;
    private String manufacturer;


    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
