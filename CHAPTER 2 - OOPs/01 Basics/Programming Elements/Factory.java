
import java.util.Scanner;

public class Factory {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Bike b1 = new Bike();
        Bike b2 = new Bike();

        b1.bikeName = "Pulsar";
        System.out.println("Bike Model\t = \t"+ b1.bikeName);
    }
}
