package com.example.demo.utill.service;

import com.example.demo.utill.domain.UtillDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public interface UtillService {
    LocalDate nowtoday();
    LocalTime now();
    String todayAndCurrentTime();
    String randumNumbers(int digits, boolean allowZeroValue);


}
