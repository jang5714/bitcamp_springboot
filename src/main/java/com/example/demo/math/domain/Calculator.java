package com.example.demo.math.domain;

import java.util.Scanner;
public class Calculator {
    private int num1;
    private int num2;

    public void setNum1(int num1){
        this.num1 = num1;
    }
    public int getNum1(){
        return this.num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public int getNum2(){
        return this.num2;
    }

    @Override
    public String toString() {
        return String.format("%d + %d = %d", num1, num2, num1+num2);
    }
}
