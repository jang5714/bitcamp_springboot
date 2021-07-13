package com.example.demo.math.sevice;

import com.example.demo.math.domain.CalculatorDTO;

public class CalculatorServicelmpl implements CalculatorService{

    @Override
    public int add(CalculatorDTO calculator) { //더하기
        return calculator.getNum1() + calculator.getNum2();
    }

    @Override
    public int subtract(CalculatorDTO calculator) { //빼기
        return calculator.getNum1()-calculator.getNum2();
    }

    @Override
    public int multiple(CalculatorDTO calculator) { //곱하기
        return calculator.getNum1() * calculator.getNum2();
    }

    @Override
    public int divide(CalculatorDTO calculator) { //나누기
        return calculator.getNum1()/calculator.getNum2();
    }

    @Override
    public int remain(CalculatorDTO calculator) { //나머지
        return calculator.getNum1()%calculator.getNum2();
    }

    @Override
    public int[] sequence(CalculatorDTO calculator) {
        int count = calculator.getNum2()-calculator.getNum1() +1;
        int[] arr = new int[count];
        int i = 0;
        for (int j = calculator.getNum1();j<=calculator.getNum2(); j++){
            arr[i] = j;
            i++;
        }
        return arr;
    }


}
