package com.example.demo.BankAccount.controller;

import com.example.demo.BankAccount.domain.PiggybankDTO;
import com.example.demo.BankAccount.service.PiggyBankImpl;
import com.example.demo.BankAccount.service.PiggybankService;
import com.example.demo.utill.service.LambdaUtils;

import java.util.Scanner;

public class PiggyBankController extends LambdaUtils {
    public static void main(String[] args) {
        PiggybankService piggybankService = new PiggyBankImpl();
        PiggybankDTO piggybankDTO = new PiggybankDTO();
        Scanner scanner = new Scanner(System.in);

        while (true){
            print.accept("[메뉴] 0-exit 1-입금 2-출금 3-확인");
            switch (scanner.next()){
                case "0": return;
                case "1":
                    print.accept("입금할 금액: ");
                    piggybankDTO.setMoney(scanner.nextInt());
                    piggybankService.disits(piggybankDTO);
                    print.accept(piggybankDTO.toString());
                    break;
                case "2":
                    print.accept("출금할 금액: ");
                    piggybankDTO.setMoney(scanner.nextInt());
                    piggybankService.withdraw(piggybankDTO);
                    break;
                case "3":
                    print.accept("잔액은? ");
                    piggybankService.findPiggybank(piggybankDTO);
                    break;
            }
        }

    }
}
