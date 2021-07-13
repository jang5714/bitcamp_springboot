package com.example.demo.BankAccount.controller;

import com.example.demo.BankAccount.domain.BankAccountDTO;
import com.example.demo.BankAccount.service.BankAccountImpl;
import com.example.demo.BankAccount.service.BankAccountService;

import java.util.List;
import java.util.Scanner;

public class BankAccountController {
    private BankAccountService bankAccountService;

    public BankAccountController() {
        bankAccountService = new BankAccountImpl();
    }

    public void add(BankAccountDTO bankAccount) {
        bankAccountService.add(bankAccount);
    }


    public int count() {
        return bankAccountService.count();
    }

    public void show() {
        System.out.println("계좌의 개수는 :" + bankAccountService.count());
        System.out.println(bankAccountService.show());
    }

    public void createAccount(BankAccountDTO bankAccountDTO) {
        bankAccountService.createAccount(bankAccountDTO);
    }

    public int finadBalance(BankAccountDTO bankAccount) {
        return bankAccountService.finadBalance(bankAccount);
    }

    public int deposit(BankAccountDTO bankAccount) {
        return bankAccountService.deposit(bankAccount);
    }

    public int withdraw(BankAccountDTO bankAccount) {
        return bankAccountService.withdraw(bankAccount);
    }

    public void dropAccount(BankAccountDTO bankAccount) {

    }
}
    //
//        public void BankAccountController02() {
//
//
//
//                }
//            }


