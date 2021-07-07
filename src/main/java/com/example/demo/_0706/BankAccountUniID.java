package com.example.demo._0706;

public class BankAccountUniID {
    String accNumber; // 계좌 번호
    String ssNumber;  // 주민 번호
    int acount = 0;   // 예금 잔액


    public BankAccountUniID (String a, String b, int num){ //초기화
        accNumber = a;
        ssNumber = b;
        acount = num;
    }

    public int deposit(int amount) { // 입금을 담당하는 메소드
        acount+= amount;
        return acount;
    }

    public int withdraw(int amount) { //출금을 담당하는 메소드
        acount -= amount;
        return acount;
    }

    public int checkMyBalance() {  // 예금 조회를 담당하는 메소드
        System.out.println("계좌번호 : " + accNumber);
        System.out.println("주민번호 : " + ssNumber);
        System.out.println("잔액 : " + acount+ '\n');
        return acount;
    }


}
