package at.spg.projectkiesslinghossain.domain;

import java.time.LocalDate;

public class PropertyListing extends Listing  {

    public PropertyListing(int listingId, String title, String description, double price, LocalDate creationDate, boolean isActive, String location, PropertyType type, double area, int rooms, String address, int buildYear, User owner) {
        super(listingId, title, description, price, creationDate, isActive, location, owner);
        this.area=area;
        this.buildYear=buildYear;
        this.address=address;
        this.rooms=rooms;
        this.type= PropertyType.valueOf(String.valueOf(type.toString()));
    }
    //extends Listing
    private PropertyType type;
    private double area;
    private int rooms;

    private String address;
    private int buildYear;

    public PropertyType getType() {
        return type;
    }

    public void setType(PropertyType type) {
        this.type = type;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }


}
