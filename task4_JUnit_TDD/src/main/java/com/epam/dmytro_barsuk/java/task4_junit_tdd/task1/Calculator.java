package com.epam.dmytro_barsuk.java.task4_junit_tdd.task1;

import com.epam.dmytro_barsuk.java.task4_junit_tdd.task1.operations.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.InputMismatchException;

import static java.lang.Integer.parseInt;

/**
 * The type Calculator.
 */
public class Calculator {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    HashMap<Character, Calculable> operations;
    private int operatorA;
    private int operatorB;

    public Calculator() throws IOException {
        operations = new HashMap<>();
        operations.put('+', new Addition());
        operations.put('-', new Subtraction());
        operations.put('*', new Multiply());
        operations.put('/', new Division());

        System.out.print("Insert operator A: ");
        operatorA = parseInt(reader.readLine());
        System.out.print("Insert operator B: ");
        operatorB = parseInt(reader.readLine());
    }
    public Calculator(int i){
        operations = new HashMap<>();
        operations.put('+', new Addition());
        operations.put('-', new Subtraction());
        operations.put('*', new Multiply());
        operations.put('/', new Division());
    }


    public int calculate() throws Exception {
        char operation = takeChoiceOfOperations();
        if (operations.containsKey(operation)) {
            return operations.get(operation).calculate(operatorA, operatorB);
        } else {
            throw new Exception("Invalid operation! ( Use +, -, *, / )");
        }
    }

    public void startApplication() {
        try {
            System.out.println("Result is "+ calculate());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private char takeChoiceOfOperations() throws IOException {
        System.out.println("What operation do you want to use?");
        return reader.readLine().charAt(0);
    }

}
