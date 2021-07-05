package com.example.demo;

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

    Mac(String a){
        color = a;
        size = 13;
        memory = 512;
        power = false;

    }
//-----------------------------------------------------


    public void colortype(String a){
        if (a == "실버"){
            System.out.println("실버 색상이 너무 아름다우세용");
        }
        else {
            System.out.println("골드는 좀 구리네요");
        }
    }

    public void sizein (int a){
        System.out.println(a + "인치 입니다.");
    }

    public void setMemory (int b){
        System.out.println(b + "G 입니다");
    }




}
