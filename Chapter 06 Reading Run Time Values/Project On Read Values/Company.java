
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Company {

    public static void main(String[] args) throws IOException {

        Console cns = System.console();

        System.out.print("Enter username : ");
        String username = cns.readLine();

        System.out.print("Enter password : ");
        String password = new String(cns.readPassword());

        if (username.equals("NTJ") && password.equals("Nami1224@@@@")) {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            Scanner scn = new Scanner(System.in);

            Employee e1 = new Employee();

            e1.eno = Integer.parseInt(args[0]);
            e1.ename = args[1];

            System.out.print("Enter Your Salary : ");
            e1.salary = Double.parseDouble(br.readLine());

            System.out.print("Enter Your Department Name : ");
            e1.department = br.readLine();

            System.out.print("Enter Your Mobile Number : ");
            e1.mobile = scn.nextDouble();

            System.out.print("Enter Your email : ");
            scn.nextLine();
            e1.email = scn.nextLine();

            e1.gender = System.getProperty("gender").charAt(0);
            e1.workingStatus = Boolean.parseBoolean(System.getProperty("workingStatus"));

            System.out.println("eno : \t\t" + e1.eno);

            System.out.println("ename : \t\t" + e1.ename);

            System.out.println("dept : \t\t" + e1.department);

            System.out.println("salary : \t\t" + e1.salary);

            System.out.println("mobno : \t\t" + e1.mobile);

            System.out.println("email : \t\t" + e1.email);

            System.out.println("gender : \t\t" + e1.gender);

            System.out.println("work : \t\t" + e1.workingStatus);
        }
    }
}
