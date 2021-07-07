package com.example.demo._0706;

import com.example.demo._0706.TV;

public class remocun {
    public static void main(String[] args) {

        TV.display();

        TV lgTv = new TV("LG");
        TV sTv = new TV("samsung");
        TV hTv = new TV("HP", 2048);

        lgTv.add(1,5);

        System.out.println(hTv.getCurrent_channel());
        hTv.setCurrent_channel(87);
        System.out.println(hTv.getCurrent_channel());


        int[] arr = hTv.getChannel();
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
