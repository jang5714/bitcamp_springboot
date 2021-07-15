package com.example.demo.utill.controller;

import com.example.demo.utill.service.LambdaUtils;
import com.example.demo.utill.service.UtillServiceImpl;
import com.example.demo.utill.service.UtillService;

import java.util.Scanner;

public class UtillController extends LambdaUtils {
        private UtillService utillService;

        public UtillController(){
            this.utillService = new UtillServiceImpl();
        }
        public void main(){
            Scanner scanner = new Scanner(System.in);
            while (true){
                print.accept("[메뉴] 0-종료 1-현재 날짜, 시간\n");
                switch (scanner.next()){
                    case "0": return;
                    case "1": print.accept(utillService.todayAndCurrentTime());
                }
            }
        }
}
