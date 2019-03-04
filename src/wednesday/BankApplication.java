package wednesday;

import java.util.Scanner;

public class BankApplication {

    private static Account2[] accountArray = new Account2[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            System.out.println("-------------------------------------------------------");
            System.out.println("1. 계좌생성  |  2.계좌목록  | 3.예금  | 4.출금  | 5.종료 ");
            System.out.println("--------------------------------------------------------");
            System.out.println("선택 >  ");

            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void deposit() {
        System.out.println("----------");
        System.out.println("예 금");
        System.out.println("----------");

        System.out.print("계좌번호 : ");
        String ano = scanner.next();
        System.out.print("예금액 : ");
        int balance = scanner.nextInt();

        if (findAccount(ano) != null) {
            findAccount(ano).setBalance(findAccount(ano).getBalance() + balance);
            System.out.println("결과 :  예금이 성공하였습니다.");
        } else {
            System.out.println("맞는 계좌번호가 없습니다.");
        }

    }

    private static void accountList() {
        System.out.println("----------");
        System.out.println("계좌목록");
        System.out.println("----------");

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                System.out.println(accountArray[i].toString());
            }
        }
    }

    private static void createAccount() {
        System.out.println("----------");
        System.out.println("계좌생성");
        System.out.println("----------");

        System.out.print("계좌번호 : ");
        String ano = scanner.next();

        System.out.print("계좌주 : ");
        String owner = scanner.next();

        System.out.print("초기입금액 : ");
        int balance = scanner.nextInt();

        Account2 newMember = new Account2(ano, owner, balance);
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                System.out.println("결과: 계좌가 생성되었습니다.");
                accountArray[i] = newMember;
//                System.out.println(accountArray[i].toString());
                break;
            }
        }
    }

    private static void withdraw() {
        System.out.println("----------");
        System.out.println("출 금");
        System.out.println("----------");

        System.out.println("계좌번호 : ");
        String ano = scanner.next();
        System.out.println("출금액 : ");
        int balance = scanner.nextInt();

        if (findAccount(ano) != null && findAccount(ano).getBalance() >= balance) {
            findAccount(ano).setBalance(findAccount(ano).getBalance() - balance);
            System.out.println("결과 :  출금이 성공되었습니다.");
        } else {
            System.out.println("맞는 계좌번호가 없거나 잔금이 부족합니다.");
        }
    }


    private static Account2 findAccount(String ano) {
        Account2 account = null;
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                if (accountArray[i].getAno().equals(ano)) {
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;
    }

}
