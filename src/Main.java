import Model.Lot;
import Model.Floor;
import Model.Vehicle;
import Model.Enum.VehicleType;
import Service.SingletonService;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
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

        practiceJavaStream();
        javaUtilFunctions();
    }

    private static void practiceJavaStream() {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Andrew","Abel","Abel","Anthony", "Abraham", "Ava", "Aiden", "Aaron");


        String filteredNames=names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .distinct()
                .limit(6)
                .skip(2)
                //.collect(Collectors.toList());
                //.anyMatch(name -> name.equals("ALICE"));
                //.count();
                //.forEach(name -> System.out.println(name));
                .reduce("", (name1, name2) -> name1 + ", " + name2);

        System.out.println(filteredNames); // Output: [ALICE]

    }

    @FunctionalInterface
    interface Greeting {
        void sayHello(String name);  // only one abstract method
    }
    public static void javaUtilFunctions() {

        Predicate<String> startsWithA = s -> s.startsWith("A"); // predicate returns boolean
        Function<String, Integer> length = String::length; // function that takes a input and returns its output
        Consumer<String> printer = System.out::println; // consumer that takes a standard function
        Supplier<String> greeting = () -> "Hi, there!"; // supplier returns some value; opposite of consumer
        BinaryOperator<Integer> multiply = (a, b) -> a * b; // Takes two inputs of the same type and returns a result of the same type
        Greeting greetingLambda = name -> System.out.println("Hello, " + name); // custom functional interface
        greetingLambda.sayHello("Functional Interface"); // Using the custom functional interface


        System.out.println(startsWithA.test("Alice"));      // true
        System.out.println(length.apply("Hello"));          // 5
        printer.accept("Tarun here");                       // Tarun here
        System.out.println(greeting.get());                 // Hi, there!
        System.out.println(multiply.apply(4, 5));           // 20
    }
}