package com.example.demo.first;

import java.util.Scanner;
class Calkulator {
    private int num1;
    private int num2;

    public void setNum1(int num1){
        this.num1 = num1;
    }
    public int getNum1(){
        return this.num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public int getNum2(){
        return this.num2;
    }

}

public class CalkulatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//갹체
        System.out.println("숫자 1 ?");

        // = 기준으로 new가 있어야 한다
        Calkulator.set
        System.out.println("숫자 2 ?");
        int num2 = scanner.nextInt();
        int num3 = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, num3); //% 변수란 뜻이다.
        // f는 포맷이라 뜻이다
    }
}


