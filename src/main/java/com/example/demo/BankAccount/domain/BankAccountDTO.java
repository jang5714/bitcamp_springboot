package com.example.demo.BankAccount.domain;

import lombok.Data;

@Data
public class BankAccountDTO {
    private String name; // 이름
    private String accountNumber;  // 계좌번호
    private int money;//전약
    public static final String BANK_NAME  = "비트은행"; // 은행종류
    private String date; //날짜
    private float interset; //이자
    private int balance;

}
