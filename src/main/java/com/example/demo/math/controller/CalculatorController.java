package com.example.demo.math.controller;


import com.example.demo.math.domain.CalculatorDTO;

import java.util.Scanner;

public class CalculatorController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorDTO calculator = new CalculatorDTO();
        System.out.println("숫자 1 ?");
        calculator.setNum1(scanner.nextInt());
        System.out.println("연산자");
        calculator.setOpcode(scanner.next());
        System.out.println("숫자 2 ?");
        calculator.setNum2(scanner.nextInt());

        int result =  0;
        switch (calculator.getOpcode()){
            case "+" : result = calculator.getNum1()+calculator.getNum2();
            break;
            case "-": result = calculator.getNum1()- calculator.getNum2();
            break;
            case "*": result = calculator.getNum1()* calculator.getNum2();
            break;
            case "/": result = calculator.getNum1()/ calculator.getNum2();
            break;
            case "%": result = calculator.getNum1()% calculator.getNum2();
            break;
        }
        System.out.println(result);
        System.out.println(calculator.toString());
    }
}