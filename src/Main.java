import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
StudentsData data=new StudentsData();
data.enteringStudentsData();
data.gettingStudentsData();

        BankData bankData=new BankData();
        bankData.userDetails();
        bankData.selection();

        VehicleSelection vehicleSelection=new VehicleSelection();
        vehicleSelection.select();







    }
}