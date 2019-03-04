package oop;

public class Account {
    private String accountNumber;
    private int balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        String result = "잔액 : " + this.balance +
                "(계좌번호 = " + this.accountNumber + ")";
        return result;
    }
}


