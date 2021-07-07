package com.example.demo.math.domain;

public class Gugu {


    public static void test() {
        for (int i = 1; i < 10; i++) { // 몇까지 곱할거냐
                for (int j = 1; j < 10; j++) { // 몇단?
                    System.out.print(j + " X " + i + " = " + i * j + '\t');
                }
                System.out.println();
            }
        }

    public static void Rank(){
        int i = 0;
        switch (i) {
            case 90:
                System.out.println("A학점 입니다");
                break;
            case 80:
                System.out.println("B학점 입니다");
                break;
            case 70:
                System.out.println("C학점 입니다");
                break;
            case 60:
                System.out.println("C+학점 입니다");
                break;
            default :
                System.out.println("D학점 입니다");
                break;
        }
    }



}









