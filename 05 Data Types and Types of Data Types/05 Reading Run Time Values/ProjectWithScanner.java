
import java.util.Scanner;

class ProjectWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        
        System.out.print("Enter Serial Number : ");
        s1.sno = sc.nextInt();

        System.out.print("Enter Student Name : ");
        sc.nextLine();
        s1.sname = sc.nextLine();

        System.out.print("Enter Course Name : ");
        s1.course = sc.next();

        System.out.print("Enter Fee Amount : ");
        s1.fee = sc.nextDouble();

        System.out.print("Enter Email Id : ");
        s1.email = sc.next();

        System.out.print("Enter Mobile Number : ");
        s1.mobNo = sc.nextLong();

        System.out.print("Enter Gender : ");
        s1.gender = sc.next().charAt(0);

        System.out.print("Enter Studying Status : ");
        s1.studying = sc.nextBoolean();

        System.out.println("Serial Number : \t\t" + s1.sno);

        System.out.println("Student Name : \t\t\t" + s1.sname);
        
        System.out.println("Course Name : \t\t\t" + s1.course);
        
        System.out.println("Fee Amount : \t\t\t" + s1.fee);
        
        System.out.println("Email Id : \t\t\t" + s1.email);
        
        System.out.println("Mobile Number : \t\t" + s1.mobNo);
        
        System.out.println("Gender : \t\t\t" + s1.gender);
        
        System.out.println("Studying Status : \t\t" + s1.studying);        

    }    
}