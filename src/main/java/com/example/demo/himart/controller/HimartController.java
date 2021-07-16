package com.example.demo.himart.controller;

import com.example.demo.BankAccount.domain.BankAccountDTO;
import com.example.demo.BankAccount.service.BankAccountImpl;
import com.example.demo.BankAccount.service.BankAccountService;
import com.example.demo.himart.domain.PhoneApp;
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
        PhoneApp phoneApp = null;
        while (true) {
            System.out.println("[0]종료 [1]스마트폰 [2]  [3] \n");
            switch (scanner.next()) {
                case "0": return;
                case "1":
                    phonMain(scanner);
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
    public  void phonMain (Scanner scanner){
        PhoneApp phoneApp = new PhoneApp();
        PhoneApp.Phone phone = null;
        PhoneApp.CelPhone celPhone = null;
        PhoneApp.IPhone iPhone = null;
        PhoneApp.GalaxyNote galaxyNote = null;

        while (true){
            print.accept("[Menu] 0-종료 1-집전화 2-휴대폰 3-아이폰 4-갤럭시");
            switch (scanner.next()){
                case "0":return;
                case "1":
                   phone = phoneApp.new Phone();
                   phone.setKind("집전화");
                   phone.setCompany("LG");
                   phone.setCall("집전화야~");
                   print.accept(phone.toString());
                    break;
                case "2":
                   celPhone = phoneApp.new CelPhone();
                    celPhone.setKind("핸드폰");
                    celPhone.setCompany("LG +");
                    celPhone.setCall("핸드폰이야~");
                    celPhone.setMove("이동주이양");
                    celPhone.isPortable();
                    print.accept(celPhone.toString());
                    break;
                case "3":
                    iPhone = phoneApp.new IPhone();
                    iPhone.setKind(PhoneApp.IPhone.BRAND);
                    iPhone.setCompany("Apple");
                    iPhone.setCall("아이폰이야~");
                    iPhone.setMove("무브주이양");
                    iPhone.setInternet("애플스토어");
                    print.accept(iPhone.toString());
                    break;
                case "4":
                    galaxyNote = phoneApp.new GalaxyNote();
                    galaxyNote.setKind(PhoneApp.GalaxyNote.BRAND);
                    galaxyNote.setCompany("Apple");
                    galaxyNote.setCall("아이폰이야~");
                    galaxyNote.setMove("무브주이양");
                    galaxyNote.setInternet("애플스토어");
                    galaxyNote.setPencil("갤러시 팬이야~");
                    print.accept(galaxyNote.toString());
                    break;
            }
        }
    }
}
