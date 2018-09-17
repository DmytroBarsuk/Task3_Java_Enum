package com.epam.dmytro_barsuk.java.task4_junit_tdd.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCalculator {

    public int add() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int literal;
        int sum =0;
        while ((literal=reader.read()) != ' '){
            sum += literal;
        }
        return sum;
    }

}
