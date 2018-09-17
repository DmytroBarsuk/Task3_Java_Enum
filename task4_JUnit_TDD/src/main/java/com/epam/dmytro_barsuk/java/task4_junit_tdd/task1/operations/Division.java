package com.epam.dmytro_barsuk.java.task4_junit_tdd.task1.operations;

import com.epam.dmytro_barsuk.java.task4_junit_tdd.task1.Calculable;

public class Division implements Calculable {

    @Override
    public int calculate(int operatorA, int operatorB) throws Exception {
        if (operatorB != 0) {
            return operatorA / operatorB;
        }
        else{
            throw new Exception("Divide by zero is impossible");
        }
    }
}
