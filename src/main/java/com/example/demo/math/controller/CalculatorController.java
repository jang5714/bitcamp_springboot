package com.example.demo.math.controller;


import com.example.demo.math.domain.Calculator;

import java.util.Scanner;

class CalculatorController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//갹체
        Calculator calculator = new Calculator();
        System.out.println("숫자 1 ?");
        calculator.setNum1(scanner.nextInt());
        System.out.println("숫자 2 ?");
        calculator.setNum2(scanner.nextInt());
        System.out.printf(calculator.toString());
    }
}
