package com.example.demo.math.sevice;

import com.example.demo.math.domain.CalculatorDTO;

public class Calculatorlmpl implements CalculatorService{
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
}
