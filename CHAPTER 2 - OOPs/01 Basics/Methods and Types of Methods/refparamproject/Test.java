package refparamproject;

public class Test {
    public static void main(String[] args) {

        Company c1 = new Company();

        Employee e1 = new Employee();

        e1.eno = 101;
        e1.ename = "Nihir";
        e1.department = "HR";
        e1.companyname = "Amazon";
        e1.salary = 4200000;
        c1.display(e1);
        c1.salary(e1);
        c1.hype(e1);
        c1.display(e1);
    }
}
