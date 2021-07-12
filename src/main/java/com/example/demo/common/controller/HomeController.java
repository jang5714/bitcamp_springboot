package com.example.demo.common.controller;

import com.example.demo.BankAccount.controller.BankAccountController;
import com.example.demo.Dog.Controller.DogController;
import com.example.demo.bicycle.controller.BicyclesController;
import com.example.demo.math.controller.CalculatorController;
import com.example.demo.utill.controller.UtillController;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorController calculatorController = new CalculatorController();
        DogController dogController = new DogController();
        BicyclesController bicyclesController = new BicyclesController();
        UtillController utillController=new UtillController();
        BankAccountController bankAccountController = new BankAccountController();

        while (true){
            System.out.println("\n[메뉴] 0.종료 1.계산기 2.수열 3.Dog 4.bicycle 5.오늘날짜 6.Bank");
            switch (scanner.next()){
                case "0" : return;
                case "1" : calculatorController.calculate();break;
                case "2" : calculatorController.sequence();break;
                case "3" : dogController.DogController();break;
                case "4" : bicyclesController.Bicyslescontroller();break;
                case "5" : utillController.todayAndCurrentTime();break;
                case "6" : bankAccountController.BankAccountController02();break;
            }
        }
    }
}
