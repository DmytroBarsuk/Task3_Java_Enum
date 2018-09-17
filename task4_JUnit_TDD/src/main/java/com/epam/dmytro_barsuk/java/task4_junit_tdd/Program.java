package com.epam.dmytro_barsuk.java.task4_junit_tdd;

import com.epam.dmytro_barsuk.java.task4_junit_tdd.task1.Calculator;
import com.epam.dmytro_barsuk.java.task4_junit_tdd.task2.StringCalculator;

public class Program {
    public static void main(String[] args) throws Exception {
/*        Calculator calculator = new Calculator();
        calculator.startApplication();*/

        StringCalculator calculator = new StringCalculator();
        calculator.add();
    }
}
