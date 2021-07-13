package com.example.demo.Dog.domain;
//state (name, color, breed, hungry)
//behavior (barking, fetching, wagging tail).
import java.util.Scanner;
import lombok.Data;

@Data
public class DogDTO {
    private String name;
    private String color;
    private String breed;
    //속성은 감추고 기능은 오픈한다.
    // 정보의 은닉화


    @Override
    public String toString() {
        return String.format("이름은 %s 색깔은 %s 품종은 %s인 강아지가 " , name,color,breed);
    }
}

