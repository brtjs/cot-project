public class Vehicle {
    private String vehicle;
    private  String companyName;
    private String  name;
    private int wheels;
    private String vehicleType;
    private int fuelCapacity;

    public Vehicle(String vehicle, String companyName, String name, int wheels, String vehicleType, int fuelCapacity) {
        this.vehicle = vehicle;
        this.companyName = companyName;
        this.name = name;
        this.wheels = wheels;
        this.vehicleType = vehicleType;
        this.fuelCapacity = fuelCapacity;
    }

    public void displayInfo() {
        System.out.println("Vehicle Type: " + vehicle);
        System.out.println("company name: " + companyName);
        System.out.println("name: " + name);
        System.out.println("Wheels: " + wheels);
        System.out.println("Fuel capacity: " + fuelCapacity);
        System.out.println("vehicle type: " + vehicleType);
    }
    public Vehicle() {
    }
}
