
package bankproject;

import java.util.Scanner;

public class BankAccount {
    static String bankName;
    static String branchName;
    static String ifsc;
    String accHName;
    double balance;
    long accNumber;

    void storingValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Holder Name : ");
        accHName = sc.nextLine();
        System.out.println("Enter Account Number : ");
        accNumber = sc.nextLong();
        System.out.println("Enter balance : ");
        balance = sc.nextDouble();
    }

    void readAndDisplay() {
        System.out.println("Bank Name : "+ bankName);
        System.out.println("Branch Name : "+ branchName);
        System.out.println("Ifsc Code : "+ ifsc);
        System.out.println("Account Holder Name : "+ accHName);
        System.out.println("Account Number : "+ accNumber);
        System.out.println("balance : "+ balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Your new balance is : "+ balance);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Your new balance is : "+ balance);
    }

    void currentBalance() {
        System.out.println("Your balance is "+ balance);
    }
}


