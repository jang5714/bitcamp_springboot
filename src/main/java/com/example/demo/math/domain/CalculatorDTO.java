package com.example.demo.math.domain;

public class CalculatorDTO {
    private int num1;
    private int num2;
    private String opcate;

    public void setNum1(int num1){
        this.num1 = num1;
    }
    public int getNum1(){
        return num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public int getNum2() {
        return num2;
    }
    public String getOpcode() {
        return opcate;
    }
    public void setOpcode(String opcate) {
        this.opcate = opcate;
    }
    @Override
    public String toString() {
        return String.format("%d + %d = %d", num1, num2, num1 + num2);
    }
}
