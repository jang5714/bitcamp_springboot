package com.example.demo.BankAccount.domain;
import lombok.Data;

@Data
public class PiggybankDTO {

    private String name; //저금통 이름
    private int blance; //저금통
    private int money; //금액


    @Override
    public String toString() {
        return "잔액은 : " + getBlance() + '\n';
    }
}
