package com.example.demo;

public class BankAccountPO {
    int balance = 0; // 예금 잔액

    public int deposit(int amount) { // 입금을 담당하는 메소드
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) { //출금을 담당하는 메소드
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {  // 예금 조회를 담당하는 메소드
        System.out.println("잔액 : " + balance);
        return balance;
    }
}

