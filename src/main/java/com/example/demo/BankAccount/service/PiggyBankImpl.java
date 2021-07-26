package com.example.demo.BankAccount.service;

import com.example.demo.BankAccount.domain.PiggybankDTO;

public class PiggyBankImpl implements PiggybankService{


    @Override
    public void disits(PiggybankDTO piggybank) {
        piggybank.setBlance(piggybank.getBlance() + piggybank.getMoney());
    }

    @Override
    public void withdraw(PiggybankDTO piggybank) {
        piggybank.setBlance(piggybank.getBlance()-piggybank.getMoney());
        if (piggybank.getBlance() < 0){
            System.out.println("잔액이 없습니다.");;
        }
    }

    @Override
    public PiggybankDTO findPiggybank(PiggybankDTO piggybank) {
        System.out.println(piggybank.getBlance());
        return piggybank;
    }
}
