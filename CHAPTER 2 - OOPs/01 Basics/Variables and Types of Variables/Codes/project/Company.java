package Codes.project;

public class Company {
    public static void main(String[] args) {

        //         static variables

        Laptop.brand = "MI";
        Employee.company = "XYZ";

        Employee e = new Employee();
        e.eno = 12;
        e.ename = "Prakash";
        e.sal = 7822230;
        e.dept =new String[]{"Computer","Hindi"};

        e.addr = new Address();
        e.addr.streetno = 76;
        e.addr.city = "Bhopal";

        e.laptop = new Laptop();
        e.laptop.prcsr = "intel i7";
        e.laptop.ramCap = "16GB";
        e.laptop.romCap = "1TB";

        System.out.println("eno : "+e.eno);
        System.out.println("ename : "+e.ename);
        System.out.println("salary : "+e.sal);
        System.out.println("e1.dept : "+e.dept);
        System.out.println("department : "+e.dept[0]+" "+e.dept[1]);
        System.out.println("laptop : "+e.laptop);
        System.out.println("laptop : "+ e.laptop.brand);
        System.out.println("company : "+e.addr);
        System.out.println("e : "+e);
        System.out.println("company : "+Employee.company);


    }
}
