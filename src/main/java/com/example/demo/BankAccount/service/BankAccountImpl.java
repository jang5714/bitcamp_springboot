package com.example.demo.BankAccount.service;

import com.example.demo.BankAccount.domain.BankAccountDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankAccountImpl implements BankAccountService{
     private BankAccountDTO bankAccount;
     private Random rand;
     private List<BankAccountDTO> bankAccounts;

     public BankAccountImpl(){
         this.bankAccount = new BankAccountDTO();
         rand = new Random();
         bankAccounts = new ArrayList<>();
     }

    @Override
    public void add(BankAccountDTO bankAccount) {
        bankAccounts.add(bankAccount);
    }

    @Override
    public int count() {
        return bankAccounts.size();
    }

    @Override
    public List<BankAccountDTO> show() {
        return bankAccounts;
    }

    @Override
    public void createAccount(BankAccountDTO bankAccount) {
        int randomNuber = rand.nextInt(10000);
        int randomNuber2 = rand.nextInt(10000);
        int randomNuber3 = rand.nextInt(10000);
        bankAccount.setAccountNumber(String.format("%s - %s -%s",randomNuber,randomNuber2,randomNuber3));//생성한다고 눌러야만 생성이 된다.
        bankAccount.setName(bankAccount.getName());

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
