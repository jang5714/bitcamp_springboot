package com.example.demo.BankAccount.domain;

import lombok.Data;

@Data
public class BankAccountDTO {
    public static final String BANK_NAME  = "비트은행"; // 은행종류
    private String name; // 이름
    private String accountNumber;  // 계좌번호
    private String money;//전약
    private String date; //날짜
    private String interset; //이자
    private String balance;


    @Override
    public String toString() {
        return BANK_NAME + " : "+
                "예금주='" + name + '\'' +
                ", 계좌번호='" + accountNumber + '\'' +
                ", 잔고=" + balance +
                ", 거래일자='" + date + '\'' +
                ", 이자율=" + interset +"\n";
    }
}
