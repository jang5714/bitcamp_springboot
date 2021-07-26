package com.example.demo.BankAccount.service;

import com.example.demo.BankAccount.domain.PiggybankDTO;

public interface PiggybankService {

    void disits (PiggybankDTO money);
    void withdraw (PiggybankDTO money);
    PiggybankDTO findPiggybank (PiggybankDTO money);


}
