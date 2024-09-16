import java.util.Scanner;

public class ReadNumName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter SNum : ");
        int sno = sc.nextInt();
        sc.nextLine();

        System.err.print("Enter Your Name : ");
        String name = sc.nextLine();

        System.out.println("\nYour Serial Number is : " + sno);
        System.out.println("Your Name is : " + name);
    }
}
