package com.example.demo.BankAccount.service;

import com.example.demo.BankAccount.domain.BankAccountDTO;
import com.example.demo.utill.service.LambdaUtils;
import com.example.demo.utill.service.UtillService;
import com.example.demo.utill.service.UtillServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BankAccountImpl extends LambdaUtils implements BankAccountService {
    @Override
    public BankAccountDTO findAcountByAcountNumber(String accountNumber) {
        BankAccountDTO account = null;
        for(BankAccountDTO a: bankAccounts){
            if(a.getAccountNumber().equals(accountNumber)){
                account = a;
                break;
            }
        }
        return account;
    }

    private final BankAccountDTO bankAccount;
    private final List<BankAccountDTO> bankAccounts;

     public BankAccountImpl(){
         bankAccount = new BankAccountDTO();
         bankAccounts = new ArrayList<>();
     }

    @Override
    public String count() {
        return string.apply(bankAccounts.size());
    }

    @Override
    public List<? extends BankAccountDTO> findall() {
        return bankAccounts;
    }

    @Override
    public void createAccount(BankAccountDTO bankAccount) {
        UtillService utillService = new UtillServiceImpl();
        String accountNumber = utillService.randumNumbers(4,false) +"-"+
                utillService.randumNumbers(4,true)+"-"+
                utillService.randumNumbers(4,true);
        bankAccount.setAccountNumber(accountNumber);
        bankAccount.setBalance("0");
        bankAccount.setDate(utillService.todayAndCurrentTime());
        bankAccount.setInterset("0.01");
        bankAccounts.add(bankAccount);
    }

    @Override
    public String[] findAllAccountNumber() {
        int count = strToInt.apply(count());
        String[] accountNumbers = new String[count];
        for(int i=0; i < count; i++){
            accountNumbers[i] = bankAccounts.get(i).getAccountNumber();
        }
        return accountNumbers;
    }

    @Override
    public String finadBalance(String bankAccount) {
         String balance = "";
       for(BankAccountDTO a: bankAccounts){
           balance = a.getAccountNumber().equals(bankAccount)? a.getBalance(): "0";
            break;
       }
       return balance;
    }

    @Override
    public void deposit(BankAccountDTO bankAccount) {
         for (BankAccountDTO b : bankAccounts){ //
             if(bankAccount.getAccountNumber().equals(b.getAccountNumber())){
                int balance = strToInt.apply(b.getBalance());
                b.setBalance(string.apply((balance) + strToInt.apply(bankAccount.getMoney())));
                print.accept("입금 후 정보 :" + b);
                 break;
             }else {
                 print.accept("해당 계좌가 존재하지 않습니다.");
             }
         }
    }

    @Override
    public void withdraw(BankAccountDTO bankAccount) {
         for(BankAccountDTO b : bankAccounts){
             if(bankAccount.getAccountNumber().equals(b.getAccountNumber())){
                 int balance = strToInt.apply(b.getBalance());
                 b.setBalance(string.apply((balance - strToInt.apply(bankAccount.getMoney()))));
                 print.accept("출금 후 정보 :" + b);
                 break;
             }else {
                 print.accept("해단 계좌가 존해하지 않슴니다");
             }
         }

    }

    @Override
    public void dropAccount(BankAccountDTO bankAccount) {

    }



}
