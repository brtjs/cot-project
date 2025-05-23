//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Hyundai(verna)", "petrol", 3500); //object created for car
        car.displayInformation();//calling method
        Bike bike = new Bike("Yamaha(RX)", "petrol", 1100); //object created for bike
        bike.displayInformation();//calling method
    }
}
