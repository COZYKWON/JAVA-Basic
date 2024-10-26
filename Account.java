package oop1.ex;

public class Account {

    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("***** 입금 *****");
        System.out.println(amount + "원을 입금하였습니다.");
        System.out.println("잔고: " + balance + "원");
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("***** 잔액 부족 *****");
            System.out.println("잔고: " + balance + "원");
        } else {
            balance -= amount;
            System.out.println("***** 출금 *****");
            System.out.println(amount + "원을 출금하였습니다.");
            System.out.println("잔고: " + balance + "원");
        }
    }

    void showBalace() {
        System.out.println("***** 잔고 확인 *****");
        System.out.println("잔고: " + balance + "원");
    }
}
