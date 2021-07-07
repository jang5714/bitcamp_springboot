package com.example.demo._pratice;

public class star {
    public static void main(String[] args) {

        for(int i =1; i<=5; i++){ //줄갯수
            for (int k =1; k<=(5-i); k++){ //공백수
                System.out.print(" ");
            }
            for (int j =1; j<=(i*2-1);j++){ //별갯수
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
