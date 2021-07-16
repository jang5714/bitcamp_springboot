package com.example.demo.himart.controller;

import com.example.demo.BankAccount.domain.BankAccountDTO;
import com.example.demo.BankAccount.service.BankAccountImpl;
import com.example.demo.BankAccount.service.BankAccountService;
import com.example.demo.himart.servics.HimartServiceImpl;
import com.example.demo.himart.servics.HimartServics;
import com.example.demo.utill.service.LambdaUtils;

import java.util.List;
import java.util.Scanner;

public class HimartController extends LambdaUtils {
    private HimartServics himartServics;
    public HimartController() {
        himartServics = new HimartServiceImpl();
        }
    public void main() {
        Scanner scanner = new Scanner(System.in);
        BankAccountDTO bankAccount = null; //재활용
        while (true) {
            System.out.println("[0]종료 [1]스마트폰 [2]  [3] \n");
            switch (scanner.next()) {
                case "0": return;
                case "1":
                    phonMain((scanner));
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;


            }

        }

    }
    public void phonMain (Scanner scanner){
        while (true){
            print.accept("[Menu] 0-종료 1-집전화 2-휴대폰 3-아이폰 4-갤럭시");
            switch (scanner.next()){
                case "0":return;
                case "1":break;
                case "2":break;
                case "3":break;
                case "4":break;
            }
        }
    }
}
