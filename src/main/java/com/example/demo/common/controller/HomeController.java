package com.example.demo.common.controller;

import com.example.demo.BankAccount.controller.BankAccountController;
import com.example.demo.Dog.Controller.DogController;
import com.example.demo.bicycle.controller.BicyclesController;
import com.example.demo.himart.controller.HimartController;
import com.example.demo.math.controller.CalculatorController;
import com.example.demo.utill.controller.UtillController;
import com.example.demo.utill.service.LambdaUtils;

import java.util.Scanner;

public class HomeController extends LambdaUtils {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DogController dogController = new DogController();
        CalculatorController calculatorController = new CalculatorController();
        BicyclesController bicyclesController = new BicyclesController();
        BankAccountController bankAccountController = new BankAccountController();
        UtillController utillController = new UtillController();
        HimartController himartController =new HimartController();

        while (true) {
            System.out.println("\n[메뉴] 0.종료 1.유틸 2.수학 3.개 4.자전거 5.Bank 6.하이마트\n");
            switch (scanner.next()) {
                case "0": return;
                case "1": utillController.main();break;
                case "2": calculatorController.main();break;
                case "3": dogController.main();break;
                case "4": bicyclesController.main();break;
                case "5": bankAccountController.main();break;
                case "6": himartController.main();
                }
        }
    }
}
