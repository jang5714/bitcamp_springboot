package com.example.demo._pratice;

import java.util.Scanner;

public class Rank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요 : ");
        int num1 = scanner.nextInt(); //점수 입력

        String grade = "";
        switch (num1/10){
            case 10:
            case 9:
                grade ="A";
                break;
            case 8:
                grade ="B";
                break;
            case 7:
                grade ="C";
                break;
            case 6:
                grade ="D";
                break;
            default:
                grade ="E";
                break;
        }
        System.out.println("당신은"+ grade +"학점 입니다.");

    }
}
