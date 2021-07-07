package com.example.demo._pratice;

public class Aircon {

    String model_name;  // 모델명
    int [] wind;   // 바람세기
    boolean power; // 전원

    //속성
    Aircon(){
        model_name = "사제";
        power = false;
        wind = new int[5];
        for(int i = 0; i<5; i++ ){
            wind [i] = i + 1;
        }
    }
    Aircon(int a){
        model_name = "사제";
        power = false;
        wind = new int[a];
        for(int i = 0; i<5; i++ ){
            wind [i] = i + 1;
        }
    }

    Aircon(String name){
        model_name = name;
        power = false;
        wind = new int[5];
        for(int i = 0; i<5; i++ ){
            wind [i] = i + 1;
        }
    }

    //메소드

    public void powertype(int a){
        if (a<3){
            System.out.println("바람세기가 약합니다");
        }
        else {
            System.out.println("바람세기가 강합니다");
        }
    }

    public void booleanfinal(boolean a){
        if (a=true){
            System.out.println("전원이 켜져 있습니다. 명령을 내려주세요");
        }
        else {
            System.out.println("전원이 꺼져있습니다. 켜주세요");
        }
    }
}
