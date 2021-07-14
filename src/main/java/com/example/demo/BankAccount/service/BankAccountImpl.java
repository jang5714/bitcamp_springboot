package com.example.demo.BankAccount.service;

import com.example.demo.BankAccount.domain.BankAccountDTO;
import com.example.demo.utill.service.UtillService;
import com.example.demo.utill.service.UtillServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BankAccountImpl implements BankAccountService{

     private BankAccountDTO bankAccount;
     private List<BankAccountDTO> bankAccounts;

     public BankAccountImpl(){
         this.bankAccount = new BankAccountDTO();
         bankAccounts = new ArrayList<>();
     }

    @Override
    public int count() {
        return bankAccounts.size();
    }

    @Override
    public List<?> findall() {
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
         String[] accountNumber = new String[count()];
         for(int i =0; i < count();i++){
             accountNumber[i] = bankAccounts.get(i).getAccountNumber();
         }
        return accountNumber;
    }



    @Override
    public int finadBalance(BankAccountDTO bankAccount) {
        return bankAccount.getBalance();
    }

    @Override
    public int deposit(BankAccountDTO bankAccount) {
        bankAccount.setBalance(bankAccount.getBalance() + bankAccount.getMoney());
        return bankAccount.getBalance();
    }

    @Override
    public int withdraw(BankAccountDTO bankAccount) {
        bankAccount.setBalance(bankAccount.getBalance() - bankAccount.getMoney());
        return bankAccount.getBalance();
    }

    @Override
    public void dropAccount(BankAccountDTO bankAccount) {

    }



}
