package com.example.demo.bicycle.controller;

import com.example.demo.Bicycle;

import java.util.Scanner;

public class BicyclesController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bicycle bicysle = new Bicycle();

        System.out.println("기어가 몇단이니?");
        bicysle.setGear(scanner.nextInt());
        System.out.println("페달이 어느 꺼니?");
        bicysle.setPedal(scanner.next());
        System.out.println("스피드가 몇이니?");
        bicysle.setSpeed(scanner.nextInt());

        System.out.printf(bicysle.toString());

    }
}