package voidnonvoidmethods;

public class Test {
    public static void main(String[] args) {

        College.m1();

        Student s3 = College.m2();

        System.out.println(s3.sno);
        System.out.println(s3.sname);
        System.out.println(s3.srollno);

    }
}
