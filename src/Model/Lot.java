package Model;

public class Lot {
    private String lotNumber;
    private String description;
    private String location;
    private String status;

    public Lot(String lotNumber, String description, String location, String status) {
        this.lotNumber = lotNumber;
        this.description = description;
        this.location = location;
        this.status = status;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
