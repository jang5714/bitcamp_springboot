package com.example.demo.BankAccount.controller;

import com.example.demo.BankAccount.domain.BankAccountDTO;

import java.util.Scanner;

public class BankAccountController {
    Scanner scanner = new Scanner(System.in);
    BankAccountDTO bankAccount = new BankAccountDTO();

    public void BankAcoountcontroller(){
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
