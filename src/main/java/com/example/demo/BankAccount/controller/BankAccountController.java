package com.example.demo.BankAccount.controller;

import com.example.demo.BankAccount.domain.BankAccountDTO;
import com.example.demo.BankAccount.service.BankAccountImpl;
import com.example.demo.BankAccount.service.BankAccountService;
import com.example.demo.utill.service.LambdaUtils;

import java.util.List;
import java.util.Scanner;

public class BankAccountController extends LambdaUtils {
    private BankAccountService bankAccountService;
    public BankAccountController() {
        bankAccountService = new BankAccountImpl();
    }
    public void main() {
        Scanner scanner = new Scanner(System.in);
        BankAccountDTO bankAccount = null; //재활용
        while (true) {
            System.out.println("[0]종료 [1]계좌생성 [2] 계좌목록 [3] 계좌번호목록 [4] 입금 [5] 출금");
            switch (scanner.next()) {
                case "0": return;
                case "1":
                    bankAccount = new BankAccountDTO();
                    print.accept("이름 :");
                    bankAccount.setName(scanner.next());
                    bankAccountService.createAccount(bankAccount);
                    break;
                case "2":
                    print.accept("개설된 계좌 수:" +bankAccountService.count()+"\n");
                    List<? extends BankAccountDTO> list = bankAccountService.findall();
                    for(BankAccountDTO a: list){
                        print.accept(a.toString());
                    }
                    break;
                case "3":
                    for(String s: bankAccountService.findAllAccountNumber()){
                        print.accept(s + "\n");
                    }
                    break;
                case "4":
                    print.accept("잔고 조회할 계좌번호 : ");
                    bankAccountService.findAcountByAcountNumber(scanner.next());
                    break;

                case "5":
                    print.accept("입금 할 계좌번호 : ");
                    bankAccount = new BankAccountDTO();
                    bankAccount.setAccountNumber(scanner.next());
                    print.accept("입금액 : ");
                    bankAccount.setMoney(scanner.next());
                    bankAccountService.deposit(bankAccount);
                    break;
                case "6":
                    print.accept("출금 할 계좌번호 : ");
                    bankAccount = new BankAccountDTO();
                    bankAccount.setAccountNumber(scanner.next());
                    print.accept("출금액 : ");
                    bankAccount.setMoney(scanner.next());
                    bankAccountService.withdraw(bankAccount);
                    break;

            }

        }
    }
}


