package oop;

import java.lang.String;

public class AccountExample {
    public static void main(String[] args) {

        Account a = new Account("4649", 15920);
        Account b = new Account("  4649", 20000);

        System.out.println(a);

        if(a.getAccountNumber().trim().equals(b.getAccountNumber().trim())) {
            System.out.println("aa계좌와 bb계좌는 같은 것이다");
        }
        else{
            System.out.println("aa계좌와 bb계좌는 다른 것이다");
        }
    }
}
