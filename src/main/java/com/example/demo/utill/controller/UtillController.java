package com.example.demo.utill.controller;

import com.example.demo.utill.service.UtillServiceImpl;
import com.example.demo.utill.service.UtillService;

public class UtillController {
        private UtillService utillService;

        public UtillController(){
            this.utillService = new UtillServiceImpl();

        }

        public void todayAndCurrentTime(){
            System.out.println(utillService.todayAndCurrentTime());
        }
}
