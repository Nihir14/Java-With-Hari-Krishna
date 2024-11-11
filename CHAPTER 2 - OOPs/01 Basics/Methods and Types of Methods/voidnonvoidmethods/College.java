package voidnonvoidmethods;

public class College {

    static void m1() {
        Student s1 = new Student();
        s1.sno = 12;
        s1.sname = "Nihir";
        s1.srollno = "0126CS211014";
        System.out.println(s1.sno);
        System.out.println(s1.sname);
        System.out.println(s1.srollno);
    }

    static Student m2() {
        Student s2 = new Student();
        s2.sno = 14;
        s2.sname = "Pari";
        s2.srollno = "0126ME211014";
//        System.out.println(s2.sno);
//        System.out.println(s2.sname);
//        System.out.println(s2.srollno);
        return s2;
    }

}
