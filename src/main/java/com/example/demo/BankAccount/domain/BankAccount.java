package com.example.demo.BankAccount.domain;

public class BankAccount {
    private String accNumber; // 계좌 번호
    private String ssNumber;  // 주민 번호
    private int balance;   // 통장
    private int amount; //입금

    public void setAccNumber(String accNumber){
        this.accNumber = accNumber;
    }
    public String getAccNumber(){
        return this.accNumber;
    }
    public void setSsNumber(String ssNumber){
        this.ssNumber = ssNumber;
    }
    public String getSsNumber(){
        return this.ssNumber;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public int getAmount(){
        return this.amount;
    }

    public int deposit(int amount){ //입금
        balance += amount;
        return balance;
    }
    public int withdraw(int amount){ //출금
        balance -= amount;
        return balance;
    }

    @Override
    public String toString() {
        return String.format("계좌번호 : %s\n주민번호 : %s\n통장잔액 : %d",accNumber ,ssNumber,balance);
    }
}
