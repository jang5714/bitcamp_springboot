package com.example.demo;

public class BankAccount00 {
    public static void main(String[] args) {


        final double PI = 3.1513;


        //두개의 인스턴스 생성


        BankAccountUniID yoon = new BankAccountUniID("546-8587-546", "95864-15659", 8000);
        BankAccountUniID park = new BankAccountUniID("518-8499-785", "8846-897564", 3000);

        yoon.deposit(5000);
        park.deposit(3000);

        yoon.withdraw(2000);
        park.withdraw(1000);

        yoon.checkMyBalance();
        park.checkMyBalance();


    }
}
