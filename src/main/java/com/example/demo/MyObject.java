package com.example.demo;

import java.util.Scanner;

public class MyObject {
    public static void main(String[] args) {
        System.out.println("숫자 1 ?");
        Scanner scanner = new Scanner(System.in);//갹체
        // = 기준으로 new가 있어야 한다
        int num1 = scanner.nextInt(); //String next 기본값
        System.out.println("숫자 2 ?");
        int num2 = scanner.nextInt();
        int num3 = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, num3); //% 변수란 뜻이다.
        // f는 포맷이라 뜻이다
    }
}


