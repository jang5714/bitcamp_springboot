package com.example.demo.common.controller;

import com.example.demo.BankAccount.controller.BankAccountController;
import com.example.demo.BankAccount.domain.BankAccountDTO;
import com.example.demo.Dog.Controller.DogController;
import com.example.demo.Dog.domain.DogDTO;
import com.example.demo.Dog.service.DogService;
import com.example.demo.Dog.service.DogServiceimpl;
import com.example.demo.bicycle.controller.BicyclesController;
import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.math.controller.CalculatorController;
import com.example.demo.utill.controller.UtillController;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogController dogController = new DogController();
        BicyclesController bicyclesController = new BicyclesController();
        BankAccountController bankAccountController = new BankAccountController();
        while (true) {
            System.out.println("\n[메뉴] 0.종료 1.계산기 2.수열 3.Dog 3.1 개목록 4.bicycle 4.1. 자전거목록 5.오늘날짜 6.Bank");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    new CalculatorController().calculate();
                    break;
                case "2":
                    new CalculatorController().sequence();
                    break;
                case "3":
                    DogDTO dog = new DogDTO();
                    System.out.println("이름이 무엇입니까");
                    dog.setName(scanner.next());
                    System.out.println("색깔은 무엇입니까");
                    dog.setColor(scanner.next());
                    System.out.println("품종은 무엇입니까");
                    dog.setBreed(scanner.next());
                    dogController.add(dog);
                    break;
                case "3.1":
                    dogController.show();
                    break;
                case "4":
                    BicycleDTO bicycleDTO = new BicycleDTO();
                    System.out.println("기어가 몇단이니?");
                    bicycleDTO.setGear(scanner.nextInt());
                    System.out.println("페달이 어느 꺼니?");
                    bicycleDTO.setPedal(scanner.next());
                    System.out.println("스피드가 몇이니?");
                    bicycleDTO.setSpeed(scanner.nextInt());
                    bicyclesController.add(bicycleDTO);
                    break;
                case "4.1":
                    bicyclesController.show();
                    break;
                case "5":
                    new UtillController().todayAndCurrentTime();
                    break;
                case "6":
                    new BankAccountController().main();

                }
        }
    }
}
