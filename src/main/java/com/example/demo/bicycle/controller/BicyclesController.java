package com.example.demo.bicycle.controller;

import com.example.demo.BankAccount.service.BankAccountImpl;
import com.example.demo.BankAccount.service.BankAccountService;
import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServicelmpl;

import java.util.List;
import java.util.Scanner;

public class BicyclesController {
    private BicycleService bicycleService;

    public BicyclesController() {
        bicycleService = new BicycleServicelmpl();
    }
    public void add(BicycleDTO bicycle) {
        bicycleService.add(bicycle);
    }
    public int counts() {
        return bicycleService.count();
    }
    public void show() {
        System.out.println("자전거의 개수 : "+ bicycleService.count());
        System.out.print(bicycleService.show());
    }
    public void changingGear() {

    }
    public void changingPedalcadence() {

    }
    public void applyingBrakes() {

    }

}

