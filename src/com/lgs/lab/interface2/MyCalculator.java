package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
    int num1;
    int num2;
    int result;

public MyCalculator (int num1,int num2) {
    this.num1=num1;
    this.num2=num2;
}

    @Override
    public void Devide() {
        result = num1 / num2;
        System.out.println("Операція ділення = " +result);
    }

    @Override
    public void Minus() {
        result = num1 - num2;
        System.out.println("Операція віднімання = " +result);
    }

    @Override
    public void Plus() {
        result = num1 + num2;
        System.out.println("Операція додавання = " +result);
    }

    @Override
    public void Multiplay() {
        result = num1 * num2;
        System.out.println("Операція множення = " +result);
    }


    @Override
    public void Numerable() {

    }
}
