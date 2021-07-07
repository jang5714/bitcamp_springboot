package com.example.demo;

import java.util.Scanner;
class Bicysle {
    private int gear;
    private String pedal;
    private int speed;

    public void setGear(int gear){
        this.gear = gear;
    }
    public int getGear(){
        return this.gear;
    }
    public void setPedal(String pedal){
        this.pedal = pedal;
    }
    public String getPedal(){
        return this.pedal;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return this.speed;
    }

    @Override
    public String toString() {
        return String.format("기어 : %d단 \n페달 : %s\n스피드 : %dkm",gear,pedal,speed);
    }
}

public class BicyclesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bicysle bicysle = new Bicysle();

        System.out.println("기어가 몇단이니?");
        bicysle.setGear(scanner.nextInt());
        System.out.println("페달이 어느 꺼니?");
        bicysle.setPedal(scanner.next());
        System.out.println("스피드가 몇이니?");
        bicysle.setSpeed(scanner.nextInt());

        System.out.printf(bicysle.toString());

    }
}
