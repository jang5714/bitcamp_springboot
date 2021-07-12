package com.example.demo.utill.domain;

import lombok.Data;
import org.springframework.cglib.core.Local;

import javax.annotation.sql.DataSourceDefinition;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class UtillDTO {
    private LocalDate today;
    private LocalTime currentTime;

}
