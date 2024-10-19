public class Test01 {
    public static void main(String[] args) {

        A.a = 10;
        A a1 = new A();
        a1.x = 12;
        A a2 = new A();
        a2.x = 14;

        A.m1();
        a1.m1();
        a2.m1();
        a1.m2();
        a2.m2();

    }
}
