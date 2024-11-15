package project_03;

public class BankAccount {
    String bankName;
    long accNum;
    boolean active;

    void setBankName(String bankName) {
        this.bankName = bankName;
    }

    String getBankName() {
        return bankName;
    }

    void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    long getAccNum() {
        return accNum;
    }

    void setActive(boolean active) {
        this.active = active;
    }

    boolean isActive() {
        return active;
    }

    void display () {
        System.out.println(bankName);
        System.out.println(accNum);
        System.out.println(active);
    }

}
