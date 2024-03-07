package at.spg.projectkiesslinghossain.domain;

import java.time.LocalDate;

public class VehicleListing extends Listing {

    public VehicleListing(int listingId, String title, String manufacturer, String model, int constructionYear, int mileage, VehicleCondition vehicleCondition, String fuelType, String description, double price, LocalDate creationDate, User owner, boolean isActive, String location) {
        super(listingId, title, description, price, creationDate, isActive, location, owner);
        this.constructionYear = constructionYear;
        this.vehicleCondition = VehicleCondition.valueOf(String.valueOf(vehicleCondition.toString()));
        this.manufacturer = manufacturer;
        this.model = model;
        this.mileage = mileage;
        this.fuelType = fuelType;

    }

    private String manufacturer;
    private String model;
    private int constructionYear;
    private int mileage;
    private VehicleCondition vehicleCondition;
    private String fuelType;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public VehicleCondition getCondition() {
        return vehicleCondition;
    }

    public void setVehicleCondition(VehicleCondition vehicleCondition) {
        this.vehicleCondition = vehicleCondition;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }


}
