package com.example.demo.utilServics;

public class utilServicsImplTest {
    public static void main(String[] args) {
        //int j = 3;
        String result = "";
        for(int i=0; i<4; i++){ //카운트
            result += (int)(Math.random()*10);
        }
        System.out.println(result);
    }
}
