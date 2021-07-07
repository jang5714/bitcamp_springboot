package com.example.demo.Dog.domain;
//state (name, color, breed, hungry)
//behavior (barking, fetching, wagging tail).
import java.util.Scanner;


public class Dog {
    private String name;
    private String color;
    private String breed;
    private String hungry;
    //속성은 감추고 기능은 오픈한다.
    // 정보의 은닉화
    public void setName(String name){
        this.name = name;
    }
    public String getName (){
        return this.name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setHungry(String hungry){
        this.hungry = hungry;
    }
    public String getHungry(){
        return this.hungry;
    }

    @Override
    public String toString() {
        return String.format("이름은 : %s \n색깔은 : %s \n품종은 : %s \n배고프니 : %s", name,color,breed,hungry);
    }
}

