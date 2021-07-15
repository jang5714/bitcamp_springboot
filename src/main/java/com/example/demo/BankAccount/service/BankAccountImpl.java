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

public class BankAccountImpl extends LambdaUtils implements BankAccountService{

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
        String accountNumber = utillService.randumNumbers(4,false) +"="+
                utillService.randumNumbers(4,true)+"-"+
                utillService.randumNumbers(4,true);
        bankAccount.setAccountNumber(accountNumber);
        bankAccounts.add(bankAccount);
    }

    @Override
    public String[] findAllAccountNumber() {
         int count = strToInt.apply(count());
         String[] accountNumber = new String[count];
         for(int i =0; i < count;i++){
             accountNumber[i] = bankAccounts.get(i).getAccountNumber();
         }
        return accountNumber;
    }

    @Override
    public String finadBalance(BankAccountDTO bankAccount) {
        return bankAccount.getBalance();
    }

    @Override
    public String deposit(BankAccountDTO bankAccount) {
         int restmoney = strToInt.apply(bankAccount.getMoney());
        this.bankAccount.setMoney(restmoney + bankAccount.getMoney());
        return bankAccount.getBalance();
    }

    @Override
    public String withdraw(BankAccountDTO bankAccount) {
       return "";
    }

    @Override
    public void dropAccount(BankAccountDTO bankAccount) {

    }



}
