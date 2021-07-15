package com.example.demo.math.controller;


import com.example.demo.math.domain.CalculatorDTO;
import com.example.demo.math.sevice.CalculatorService;
import com.example.demo.math.sevice.CalculatorServicelmpl;
import com.example.demo.utill.service.LambdaUtils;

import java.util.Scanner;

public class CalculatorController extends LambdaUtils {

    CalculatorService calculatorService;

    public CalculatorController(){
        calculatorService = new CalculatorServicelmpl();
    }
    public void main(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            print.accept("[메뉴] 0-종료 1-계산기 2-구구단\n");
            switch (scanner.next()){
                case "0": return;
                case "1": calculate(scanner); break;
                case "2": sequence(scanner);break;
            }
        }

    }
    public void calculate(Scanner scanner){
        CalculatorDTO math = new CalculatorDTO();
        print.accept("숫자 1 ");
        math.setNum1(scanner.nextInt());
        print.accept("연산자 ");
        math.setOpcode(scanner.next());
        print.accept("숫자 2 ");
        math.setNum2(scanner.nextInt());
        int result = 0;
        switch (math.getOpcode()){
            case "+": result = calculatorService.add(math);
                break;
            case "-": result = calculatorService.subtract(math);
                break;
            case "*": result = calculatorService.multiple(math);
                break;
            case "/": result = calculatorService.divide(math);
                break;
            case "%": result = calculatorService.remain(math);
                break;
        }
        System.out.printf("\n%d %s %d = %d\n",
                math.getNum1(),
                math.getOpcode(),
                math.getNum2(),
                result);
    }
    public void sequence(Scanner scanner){
        CalculatorDTO numbers = new CalculatorDTO();
        print.accept("수열의 시작값: ");
        numbers.setNum1(scanner.nextInt());
        print.accept("수열의 마지막값: ");
        numbers.setNum2(scanner.nextInt());
        int[] arr = calculatorService.sequence(numbers);
        for(int i = 0; i < arr.length; i++){
            print.accept(arr[i]+"\t");
        }
    }
    public void gugudan(){
        for (int j = 1; j <= 9; j++) {
            for (int i = 2; i < 6; i++) {
                print.accept(i + " * " + j + " = " + i * j + "\t");
            }
            print.accept("\n");
        }
        print.accept("\n");
        for (int j = 1; j <= 9; j++) {
            for (int i = 6; i < 10; i++) {
                print.accept(i + " * " + j + " = " + i * j + "\t");
            }
            print.accept("\n");
        }
    }
}
