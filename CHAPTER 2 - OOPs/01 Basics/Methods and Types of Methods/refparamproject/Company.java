package refparamproject;

public class Company {
    void display (Employee e) {
        System.out.println(e.eno);
        System.out.println(e.ename);
        System.out.println(e.department);
        System.out.println(e.companyname);
        System.out.println(e.salary);
    }
    void salary (Employee e) {
        System.out.println(e.salary);
    }
    void hype (Employee e) {
        e.salary += (e.salary*20)/100;
    }


}
