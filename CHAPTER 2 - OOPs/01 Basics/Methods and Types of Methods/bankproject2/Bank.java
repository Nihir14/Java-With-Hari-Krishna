package bankproject2;

import java.util.Scanner;

public class Bank {
    private static int count=1;
    BankAccount openAccount() {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.println("Enter the details of Account No : "+count);

        System.out.println();

        System.out.println("Enter accHName : ");
        acc.accHName = sc.nextLine();
        System.out.println("Enter accNumber : ");
        acc.accNumber = sc.nextLong();
        System.out.println("Enter balance : ");
        acc.balance = sc.nextDouble();

        System.out.println("Account No "+ count++ + " created successfully");

        System.out.println();

        return acc;
    }

    void displayAccount(BankAccount acc) {

        System.out.println(acc.accHName);
        System.out.println(acc.accNumber);
        System.out.println(acc.balance);

    }


}
