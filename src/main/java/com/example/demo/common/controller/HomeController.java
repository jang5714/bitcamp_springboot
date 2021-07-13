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

                    while (true) {
                        BankAccountDTO bankAccount = new BankAccountDTO();
                        System.out.println("[0]종료 [1]계좌생성 [2]잔액 확인 [3] 계좌목록");
                        switch (scanner.next()) {
                            case "0":
                                return;
                            case "1":
                                    System.out.println("게좌를 생성할려면 이름을 일력하세요 :");
                                    bankAccount.setName(scanner.next());
                                    bankAccountController.createAccount(bankAccount);
                                    System.out.println("생성된 계좌 : " + bankAccount.getAccountNumber());
                                    bankAccountController.add(bankAccount);
                                    System.out.println("[메뉴] 0. 종료\t1. 입금\t2. 출금\t3. 종료");
                                switch (scanner.next()) {
                                    case "1" :
                                        System.out.println("입금 하실 금액을 입력하십쇼");
                                        bankAccount.setMoney(scanner.nextInt());
                                        bankAccountController.deposit(bankAccount);
                                        System.out.println(bankAccount.getName() + "님의 잔액은 " + bankAccount.getBalance());
                                        break;
                                    case "2" :
                                        System.out.println("출금 하실 금액을 입력하십쇼");
                                        bankAccount.setMoney(scanner.nextInt());
                                        bankAccountController.withdraw(bankAccount);
                                        System.out.println(bankAccount.getName() + "님의 잔액은 " + bankAccount.getBalance());
                                        break;
                                    case "3":
                                        break;
                                }
                                break;
                            case "2":
                                System.out.println("잔액을 확인할려면 이름과 은행 이름을 입력해주세요");
                                System.out.println("이름을 입력 하십쇼");
                                String imsi = scanner.next();
                                System.out.println("은행 이름을 입력 하십쇼");
                                if(imsi == bankAccount.getName()) {
                                    System.out.println(bankAccount.getAccountNumber() + bankAccount.getBalance());
                                }else {
                                    System.out.println("이름이 없습니다.");
                                }
                                break;
                            case "3":
                                bankAccountController.show();
                                break;


                        }
                    }
            }
        }
    }
}