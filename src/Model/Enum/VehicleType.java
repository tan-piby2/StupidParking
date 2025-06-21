package Model.Enum;

public enum VehicleType {
    MOTORCYCLE("Motorcycle"),
    SCOOTER("Scooter"),
    SEDAN("Sedan"),
    Hatchback("Hatchback"),
    SUV("SUV");

    private final String type;

    VehicleType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }
}
