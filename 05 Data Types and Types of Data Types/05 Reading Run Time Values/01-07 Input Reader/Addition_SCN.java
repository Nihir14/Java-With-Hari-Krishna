
import java.util.Scanner;

class Addition_SCN {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();

        int c = a + b;
        System.err.println("Result : " + c);
    }
}