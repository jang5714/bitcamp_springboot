package com.example.demo.utill.controller;

import com.example.demo.utill.domain.UtillDTO;
import com.example.demo.utill.service.UtillImpl;
import com.example.demo.utill.service.UtillService;

import java.time.LocalDate;

public class UtillController {
        private UtillService utillService;

        public UtillController(){
            this.utillService = new UtillImpl();

        }

        public void todayAndCurrentTime(){
            System.out.println(utillService.todayAndCurrentTime());
        }
}
