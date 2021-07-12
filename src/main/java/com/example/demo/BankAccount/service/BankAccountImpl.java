package com.example.demo.BankAccount.service;

import com.example.demo.BankAccount.domain.BankAccountDTO;

import java.util.Random;

public class BankAccountImpl implements BankAccountService{
    private BankAccountDTO bankAccountDTO;
    private Random rand;

    @Override
    public void createAccount(BankAccountDTO bankAccountDTO) {
        this.bankAccountDTO = new BankAccountDTO();
        this.rand = new Random();
        int randomNuber = rand.nextInt(10000);
        int randomNuber2 = rand.nextInt(10000);
        int randomNuber3 = rand.nextInt(10000);
        bankAccountDTO.setAccountNumber(String.format("%s - %s -%s",randomNuber,randomNuber2,randomNuber3));//생성한다고 눌러야만 생성이 된다.
        bankAccountDTO.setName(bankAccountDTO.getName());

    }

    @Override
    public int findBalance(BankAccountDTO bankAccountDTO) {
        return bankAccountDTO.getMoney();
    }

    @Override
    public int deposit(BankAccountDTO bankAccountDTO) {
        bankAccountDTO.setBalance(bankAccountDTO.getBalance() + bankAccountDTO.getMoney());
        return bankAccountDTO.getBalance();
    }

    @Override
    public int withdraw(BankAccountDTO bankAccountDTO) {
        bankAccountDTO.setBalance(bankAccountDTO.getBalance() - bankAccountDTO.getMoney());
        return bankAccountDTO.getBalance();
    }

    @Override
    public void dropAccount(BankAccountDTO bankAccountDTO) {

    }



}
