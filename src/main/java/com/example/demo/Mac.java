package com.example.demo;

import java.util.Scanner;

public class Mac {
    @Override
    public String toString() {
        String str = "내꺼야";
        return str;
    }

    String color;
    int size;
    int memory;
    boolean power;

    Mac(){
        color = "실버";
        size = 13;
        memory = 512;
        power = false;
    }

    Mac(String s){
        color = s;
        size = 13;
        memory = 512;
        power = false;

    }
//-----------------------------------------------------


    public void colortype(){
        System.out.println("색상이 무엇이니?");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        if (s.equals ("실버") ){
            System.out.println("실버네용");
        }
        else {
            System.out.println("아닌데용");
        }

    }

    public void sizein (int a){
        System.out.println(a + "인치 입니다.");
    }

    public void setMemory (int b){
        System.out.println(b + "G 입니다");
    }




}
