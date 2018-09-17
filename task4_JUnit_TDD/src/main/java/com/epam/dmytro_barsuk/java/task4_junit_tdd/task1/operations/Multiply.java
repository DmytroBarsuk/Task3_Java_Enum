package com.epam.dmytro_barsuk.java.task4_junit_tdd.task1.operations;

import com.epam.dmytro_barsuk.java.task4_junit_tdd.task1.Calculable;

public class Multiply implements Calculable {

    @Override
    public int calculate(int operatorA, int operatorB) {
        return operatorA * operatorB;
    }
}
