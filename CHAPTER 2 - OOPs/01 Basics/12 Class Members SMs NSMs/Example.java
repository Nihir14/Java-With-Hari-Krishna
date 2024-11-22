public class Example {

    int x = m1();

    int m1() {
        System.out.println("NSV1");
        return 10;
    }

    {
        System.out.println("NSB1");
    }

    Example() {
        System.out.println("NPC");
    }

    Example(String s) {
        System.out.println("SPC");
    }

    {
        System.out.println("NSB2");
    }

    int y = m2();

    int m2() {
        System.out.println("NSM2");
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("MM start");

        Example e1 = new Example();
        Example e2 = new Example("HK");

        System.out.println("MM end");
    }

    int z = m3();

    int m3() {
        System.out.println("NSM3");
        return 30;
    }

    {
        System.out.println("NSB3");
    }

    void m4() {
        System.out.println("NSM4");
    }
}