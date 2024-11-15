package project_03;

public class Test_03 {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.setBankName("HDFC");
        b1.setAccNum(545678976);
//        b1.setActive(true);
        b1.setActive(false);
        System.out.println(b1.isActive()? "Active." : "Deactive.");

//        if (b1.isActive()) {
//            System.out.println("Active.");
//        }
//        else {
//            System.out.println("Deactive.");
//        }

//        if (b1.isActive() == true) {
//            System.out.println("Account is in active status.");
//        }
//        else
//            System.out.println("Account is in de-active status.");

//        b1.setActive(false);
//
//        if (b1.isActive() == true) {
//            System.out.println("Account is in active status.");
//        }
//        else
//            System.out.println("Account is in de-active status.");
    }
}
