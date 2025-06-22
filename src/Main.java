import Model.Lot;
import Model.Floor;
import Model.Vehicle;
import Model.Enum.VehicleType;
import Service.SingletonService;

public class Main {
    public static void main(String[] args) {
        // Initialize the singleton service
        SingletonService singletonService1 = SingletonService.getInstance();

        // create parking lot
        Lot lot = new Lot("L001", "Main Parking Lot", "123 Main St", "Open");
        System.out.println("Lot created: " + lot.getDescription());

        // create a floor in the parking lot
        Floor floor = new Floor("F001", "First Floor", lot, "Open");
        System.out.println("Floor created: " + floor.getDescription());

        // add a vehicle to the floor
        Vehicle vehicle = new Vehicle("V001", VehicleType.SEDAN.getType());
        floor.addVehicle(vehicle);

        floor.getVehicles().forEach(v ->
            System.out.println("Vehicle added: " + v.getVehicleNumber() + ", Type: " + v.getVehicleType())
        );
        SingletonService singletonService2 = SingletonService.getInstance();
    }
}