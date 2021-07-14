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
    public void main() {
        Scanner scanner = new Scanner(System.in);
        BankAccountDTO bankAccount = null;
        while (true) {
            System.out.println("[0]종료 [1]계좌생성 [2]잔액 확인 [3] 계좌목록");
            switch (scanner.next()) {
                case "0": return;
                case "1":
                    bankAccount = new BankAccountDTO();
                    System.out.println("이름 :");
                    bankAccount.setName(scanner.next());
                    bankAccountService.createAccount(bankAccount);
                    break;
                case "2":
                    System.out.println("개설된 계좌 수:" +bankAccountService.count());
                    System.out.println(bankAccountService.findall());
                    break;
                case "3":
                    for(String s: bankAccountService.findAllAccountNumber()){
                        System.out.println(s + "\n");
                    }
                    break;
            }

        }
    }
}


