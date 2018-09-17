package com.epam.dmytro_barsuk.java.task4_junit_tdd.task1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private static Calculator calculator;
    private final int OPERATOR_A = 4;
    private final int OPERATOR_B = 2;

    @Before
    public void setUp() throws Exception {
       calculator = new Calculator(1);
    }

    @Test
    public void addTwoNumbers() throws Exception {
        Assert.assertEquals("Addition error!", 6,calculator.operations.get('+').calculate(OPERATOR_A,OPERATOR_B));
    }

    @Test
    public void subtractTwoNumbers() throws Exception {
        Assert.assertEquals("Subtraction error!", 2, calculator.operations.get('-').calculate(OPERATOR_A,OPERATOR_B));
    }

    @Test
    public void multiplyTwoNumbers() throws Exception{
        Assert.assertEquals("Multiply error!", 8, calculator.operations.get('*').calculate(OPERATOR_A,OPERATOR_B));
    }

    @Test
    public void divideTwoNumbers() throws Exception {
        Assert.assertEquals("Division error!", 2, calculator.operations.get('/').calculate(OPERATOR_A,OPERATOR_B));
    }

    @Test(expected = Exception.class)
    public void divideByZero() throws Exception {
        calculator.operations.get('/').calculate(OPERATOR_A, 0);
    }

    @Test(expected = Exception.class)
    public void chooseOperator() throws Exception {
        char operation = 't';
        calculator.operations.get(operation).calculate(OPERATOR_A,OPERATOR_B);
    }

    @After
    public void tearDown() throws Exception {
        calculator = null;
    }


}