package com.example.demo.bicycle.controller;

import com.example.demo.BankAccount.service.BankAccountImpl;
import com.example.demo.BankAccount.service.BankAccountService;
import com.example.demo.bicycle.domain.BicycleDTO;

import java.util.Scanner;

public class BicyclesController {

    private BankAccountService bankAccountService;
    private Scanner scanner;
    private BicycleDTO bicycleDTO;

    public BicyclesController(){
        this.bankAccountService = new BankAccountImpl();
        this.scanner = new Scanner(System.in);
        this.bicycleDTO = new BicycleDTO();
    }

    public void Bicyslescontroller (){
        System.out.println("기어가 몇단이니?");
        bicycleDTO.setGear(scanner.nextInt());
        System.out.println("페달이 어느 꺼니?");
        bicycleDTO.setPedal(scanner.next());
        System.out.println("스피드가 몇이니?");
        bicycleDTO.setSpeed(scanner.nextInt());

        System.out.printf(bicycleDTO.toString());

    }
}
