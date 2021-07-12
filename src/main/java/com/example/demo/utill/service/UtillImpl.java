package com.example.demo.utill.service;

import com.example.demo.utill.domain.UtillDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class UtillImpl implements UtillService {

        private UtillDTO utillDTO;

        public UtillImpl(){
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
    }
