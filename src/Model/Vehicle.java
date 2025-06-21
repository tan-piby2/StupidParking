package Model;

import Model.Enum.VehicleType;
public class Vehicle {
    private String vehicleNumber;
    private String vehicleType;

    public Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        try {
            VehicleType.valueOf(vehicleType.toUpperCase());
            this.vehicleType = vehicleType;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid vehicle type: " + vehicleType);
        }
    }

}
