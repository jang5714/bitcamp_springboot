package com.example.demo.utilServics;

import com.example.demo.utill.service.LambdaUtils;

public class utilServicsImplTest extends LambdaUtils {
    public static void main(String[] args) {
        //int j = 3;
        String result = "";
        for(int i=0; i<4; i++){ //카운트
            result += (int)(Math.random()*10);
        }
        print.accept(result);
    }
}
