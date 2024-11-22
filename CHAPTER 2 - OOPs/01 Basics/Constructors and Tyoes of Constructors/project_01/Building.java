package project_01;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter length of the room : ");
        double l = scn.nextDouble();

        System.out.println("Enter breadth of the room : ");
        double b = scn.nextDouble();

        Room r1 = new Room(l,b);

        r1.display();

        System.out.println("Area of the room : "+r1.area());

        System.out.println("Parameter of the room : "+r1.parameter());

//        Modification of Values.

        System.out.println();

        System.out.println("Enter new length of the room : ");
        l = scn.nextDouble();

        System.out.println("Enter new breadth of the room : ");
        b = scn.nextDouble();

        r1.setL(l);
        r1.setB(b);

        r1.display();

        System.out.println("Area of the room : "+r1.area());

        System.out.println("Parameter of the room : "+r1.parameter());

    }
}
