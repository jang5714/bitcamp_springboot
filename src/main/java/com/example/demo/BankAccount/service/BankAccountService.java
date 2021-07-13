package com.example.demo.BankAccount.service;

import com.example.demo.BankAccount.domain.BankAccountDTO;

import java.util.List;
/*
은행이름은 상수로 정한다.
금액, 계좌번호, 은행이름을 입력한 후 입금한 후 잔액을 확인한다. pp
금액, 계좌번호, 은행이름을 입력한 후 출금한 후 잔액을 확인한다. pp
금액, 계좌번호, 은행이름을 입력한 후 잔액을 확인하면 잔액이 보인다. pp
이름을 입력하면 계좌가 생성된다. 단 계좌번호는 ****-****-****이고 랜덤값이다. pp
이름, 계좌번호을 입력한 후 계좌를 해지한다.
 */

public interface BankAccountService {
    void add(BankAccountDTO bankAccount); //계좌 갯수 추가
    int count (); //개좌 개수
    List<BankAccountDTO> show (); //계좌 컬렉션 추가
    void createAccount(BankAccountDTO bankAccountDTO);
    int finadBalance(BankAccountDTO bankAccountDTO);
    int deposit(BankAccountDTO bankAccountDTO);
    int withdraw(BankAccountDTO bankAccountDTO);
    void dropAccount(BankAccountDTO bankAccountDTO);

}