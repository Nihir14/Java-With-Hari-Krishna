package project_01;

public class Room {

    private double l;
    private double b;

    Room(double l, double b) {
        this.l = l;
        this.b = b;
    }

    void setL(double l) {
        this.l = l;
    }

    double getL() {
        return l;
    }

    void setB(double b) {
        this.b = b;
    }

    double getB() {
        return b;
    }

    void display() {
        System.out.println("Length of the room : l = "+l);
        System.out.println("Breadth of te room : b = "+b);
    }

    double area() {
        return l*b;
    }

    double parameter() {
        return 2*(l+b);
    }
}
