package project_02;

public class Test_02 {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.setEno(101);
        e1.setEname("Nishy");
        e1.setSalary(26345);
        e1.setDept("CSE");

        e1.display();

        double sal = e1.getSalary();
        sal += sal*20/100;

        e1.setSalary(sal);

        System.out.println(e1.getSalary());
    }
}
