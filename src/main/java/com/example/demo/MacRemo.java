package com.example.demo;

public class MacRemo {


    public static void main(String[] args) {

        Mac mac = new Mac();
        Mac mac1 = new Mac("골드");
        Mac mac2 = new Mac();

        System.out.println(mac1.toString());


        mac.colortype("실버");
        mac.setMemory(512);
        mac.sizein(16);

    }
}
