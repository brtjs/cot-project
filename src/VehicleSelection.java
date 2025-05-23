import java.util.Scanner;

public class VehicleSelection {

    Scanner sc=new Scanner(System.in);
    public void select() {
        System.out.println("Welcome to vehicle rental");
        System.out.println("Enter 1 to rent a bike");
        System.out.println("Enter 2 to rent a car");

        int select = sc.nextInt();
        Vehicle vehicle = null;

        if (select == 2) {
            vehicle = new Car();
        } else if (select == 1) {
            vehicle = new Bike();
        } else {
            System.out.println("Invalid selection");

        }

        vehicle.displayInfo();

    }

}
