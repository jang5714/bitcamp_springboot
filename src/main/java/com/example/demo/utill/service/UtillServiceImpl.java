package com.example.demo.utill.service;

import com.example.demo.utill.domain.UtillDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class UtillServiceImpl implements UtillService {

        private UtillDTO utillDTO;

        public UtillServiceImpl(){
        this.utillDTO = new UtillDTO();
    }

        @Override
        public LocalDate nowtoday() {
            utillDTO.setToday(LocalDate.now());
            return utillDTO.getToday();
        }

        @Override
        public LocalTime now() {
        utillDTO.setCurrentTime(LocalTime.now());
        return utillDTO.getCurrentTime();
        }

        @Override
        public String todayAndCurrentTime() {
            return String.format("%s %s", nowtoday(), now());

        }

    @Override
    public String randumNumbers(int digits, boolean allowZeroValue) {
        String first = "" ,result = "";
        first += allowZeroValue ? ((int)(Math.random()*10)) : ((int)(Math.random()*9+1));
        for(int i=0; i<digits; i++){ //카운트
            result += (int)(Math.random()*10);
        }
        return result;
    }
}
