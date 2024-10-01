
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class College {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Student s1 = new Student();
        
        System.out.println("Enter Serial Number : ");
        s1.sno = Integer.parseInt(br.readLine());

        System.out.println("Enter Student Name : ");
        s1.sname = br.readLine();

        System.out.println("Enter Course Name : ");
        s1.course = br.readLine();

        System.out.println("Enter Fee Amount : ");
        s1.fee = Double.parseDouble(br.readLine());

        System.out.println("Enter Email Id : ");
        s1.email = br.readLine();

        System.out.println("Enter Mobile Number : ");
        s1.mobNo = Long.parseLong(br.readLine());

        System.out.println("Enter Gender : ");
        s1.gender = br.readLine().charAt(0);

        System.out.println("Enter Studying Status : ");
        s1.studying = Boolean.parseBoolean(br.readLine());

        System.out.println("Serial Number : \t\t\t" + s1.sno);

        System.out.println("Student Name : \t\t\t" + s1.sname);
        
        System.out.println("Course Name : \t\t\t" + s1.course);
        
        System.out.println("Fee Amount : \t\t\t" + s1.fee);
        
        System.out.println("Email Id : \t\t\t" + s1.email);
        
        System.out.println("Mobile Number : \t\t\t" + s1.mobNo);
        
        System.out.println("Gender : \t\t\t" + s1.gender);
        
        System.out.println("Studying Status : \t\t\t" + s1.studying);        

    }    
}