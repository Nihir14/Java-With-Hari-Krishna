package bankproject;

public class Test02 {
    public static void main(String[] args) {
        BankAccount.bankName = "Punjab";
        BankAccount.branchName = "Chandigarh";
        BankAccount.ifsc = "PN38455";

        BankAccount b1 = new BankAccount();

        b1.storingValues();
        b1.readAndDisplay();

        b1.deposit(5000);
        b1.currentBalance();

    }
}