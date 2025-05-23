public class Vehicle {
    String type;
    String model;
    String version;
    int rent;
    Vehicle(String type,String model,String version,int rent) { //parameterized constructor
        this.type=type;
        this.model=model;
        this.version=version;
        this.rent=rent;
        System.out.println("\nConstructor...called when the object is created");
    }
    void displayInformation() { //method to display information
        System.out.println("\tVehicle Information:");
        System.out.println("Type:"+type);
        System.out.println("model:"+model);
        System.out.println("version:"+version);
        System.out.println("rent:"+rent+"per day");
    }
}
class Car extends Vehicle { //inheritance
    Car(String model,String version,int rent) {
        super("car",model,version,rent);
        System.out.println("\nConstructor of car is called.");
    }
    void displayInformation() {
        System.out.println("\tVehicle Information:");
        System.out.println("Type:"+type);
        System.out.println("model:"+model);
        System.out.println("version:"+version);
        System.out.println("rent:"+rent+"per day");
    }

}
class Bike extends Vehicle { //inheritance
    Bike(String model,String version,int rent) {
        super("Bike",model,version,rent);
        System.out.println("\nConstructor of car is called.");
    }
    void displayInformation() {
        System.out.println("\n\tVehicle Information:");
        System.out.println("Type:"+type);
        System.out.println("model:"+model);
        System.out.println("version:"+version);
        System.out.println("rent:"+rent+"per day");
    }
}
