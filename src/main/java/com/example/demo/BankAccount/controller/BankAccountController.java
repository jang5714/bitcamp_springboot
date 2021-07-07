package com.example.demo.BankAccount.controller;

import com.example.demo.BankAccount.domain.BankAccount;

import java.util.Scanner;

public class BankAccountController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();

        System.out.println("계좌 번호는 :");
        bankAccount.setAccNumber(scanner.next());
        System.out.println("주민 번호는 :");
        bankAccount.setSsNumber(scanner.next());
        System.out.println("얼마를 넣으시겟습니가?");
        bankAccount.setAmount(scanner.nextInt());
        bankAccount.deposit(bankAccount.getAmount());
        System.out.println("얼마를 빼시겟습니까?");
        bankAccount.setAmount(scanner.nextInt());
        bankAccount.withdraw(bankAccount.getAmount());

        System.out.println(bankAccount.toString());


    }
}
