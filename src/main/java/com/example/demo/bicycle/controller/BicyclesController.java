package com.example.demo.bicycle.controller;

import com.example.demo.BankAccount.service.BankAccountImpl;
import com.example.demo.BankAccount.service.BankAccountService;
import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServicelmpl;
import com.example.demo.utill.service.LambdaUtils;

import java.util.List;
import java.util.Scanner;

public class BicyclesController extends LambdaUtils {
    private BicycleService bicycleService;

    public BicyclesController() {
        bicycleService = new BicycleServicelmpl();
    }

    public void main(){
        Scanner scanner = new Scanner(System.in);
        BicycleDTO bicycle = null;
        while(true){
            print.accept("\n[메뉴] 0-종료 1-등록 2-목록\n");
            switch (scanner.next()){
                case "0": return;
                case "1":
                    bicycle = new BicycleDTO();
                    print.accept("기어가 몇단 입니까? ");
                    bicycle.setGear(scanner.nextInt());
                    print.accept("페달은 무엇입니까? ");
                    bicycle.setPedal(scanner.next());
                    print.accept("속도는 얼마입니까? ");
                    bicycle.setSpeed(scanner.nextInt());
                    bicycleService.add(bicycle);
                    break;
                case "2":
                    List<? extends BicycleDTO> list = bicycleService.show();
                    for(BicycleDTO b : list){
                        print.accept(b.toString());
                    }
            }

        }
    }
}

