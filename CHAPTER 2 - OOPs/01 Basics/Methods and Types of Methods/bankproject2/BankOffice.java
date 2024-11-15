package bankproject2;

public class BankOffice {
    public static void main(String[] args) {

        Bank hdfc = new Bank();

        BankAccount acc1 = hdfc.openAccount();
        BankAccount acc2 = hdfc.openAccount();
        BankAccount acc3 = hdfc.openAccount();

        hdfc.displayAccount(acc1);
        hdfc.displayAccount(acc2);
        hdfc.displayAccount(acc3);
    }
}
