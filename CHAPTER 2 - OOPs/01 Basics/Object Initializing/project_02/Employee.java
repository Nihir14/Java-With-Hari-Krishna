package project_02;

public class Employee {

    int eno;
    String ename;
    double salary;
    String dept;

    void setEno(int eno) {
        this.eno = eno;
    }

    int getEno() {
        return eno;
    }

    void setEname(String eno) {
        this.ename = eno;
    }

    String getEname() {
        return ename;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }

    void setDept(String dept) {
        this.dept = dept;
    }

    String getDept() {
        return dept;
    }

    void display() {
        System.out.println(eno);
        System.out.println(ename);
        System.out.println(salary);
        System.out.println(dept);

    }
}
