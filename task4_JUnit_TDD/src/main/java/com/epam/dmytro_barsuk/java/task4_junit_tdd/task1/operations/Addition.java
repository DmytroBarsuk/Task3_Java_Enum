package com.epam.dmytro_barsuk.java.task4_junit_tdd.task1.operations;


import com.epam.dmytro_barsuk.java.task4_junit_tdd.task1.Calculable;

public class Addition implements Calculable {

    @Override
    public int calculate(int operatorA, int operatorB) {
        return operatorA + operatorB;
    }
}
