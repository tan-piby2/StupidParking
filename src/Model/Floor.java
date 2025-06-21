package Model;

import java.util.LinkedList;
import java.util.Map;

public class Floor {
    private String floorNumber;
    private String description;
    private Lot lot;
    private String status;
    private final LinkedList<Vehicle> vehicles;
    private final int limit;

    public Floor(String floorNumber, String description, Lot location, String status, int limit) {
        this.floorNumber = floorNumber;
        this.description = description;
        this.lot = location;
        this.status = status;
        this.vehicles = new LinkedList<>();
        this.limit = limit;
    }
    public Floor(String floorNumber, String description, Lot location, String status) {
        this(floorNumber, description, location, status, 10); // Default limit to 10 if not provided
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Lot getLocation() {
        return lot;
    }

    public void setLocation(Lot lot) {
        this.lot = lot;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LinkedList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }
}
