package com.example.demo.BankAccount.controller;

import com.example.demo.BankAccount.domain.BankAccountDTO;
import com.example.demo.BankAccount.service.BankAccountImpl;
import com.example.demo.BankAccount.service.BankAccountService;

import java.util.Scanner;

public class BankAccountController {
    private Scanner scanner;
    private BankAccountService bankAccountService;
    private BankAccountDTO bankAccount;

    public BankAccountController(){
        this.scanner = new Scanner(System.in);
        this.bankAccountService = new BankAccountImpl();
        this.bankAccount = new BankAccountDTO();
    }

        public void BankAccountController02() {
            while (true){
                System.out.println("[0]종료 [1]계좌생성 [2]입금 [3]출금");
                switch (scanner.next()){
                    case "0": return;
                    case "1":  System.out.println("게좌를 생성할려면 이름을 일력하세요 :");
                        bankAccount.setName(scanner.next());
                        bankAccountService.createAccount(bankAccount);
                        System.out.println("생성된 계좌 : " + bankAccount.getAccountNumber());
                        break;
                    case "2": System.out.println("입금 하실 금액을 입력하십쇼");
                        bankAccount.setMoney(scanner.nextInt());
                        bankAccountService.deposit(bankAccount);
                        System.out.println("잔액은 " +bankAccount.getBalance());
                        break;
                    case "3":System.out.println("출금 하실 금액을 입력하십쇼");
                        bankAccount.setMoney(scanner.nextInt());
                        bankAccountService.withdraw(bankAccount);
                        System.out.println("잔액은 " + bankAccount.getBalance());
                        break;
                }
            }








        }
    }

