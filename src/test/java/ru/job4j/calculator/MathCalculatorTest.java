package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class MathCalculatorTest {
    @Test
    public void sumAndMultiply() {
        double first = 3;
        double second = 2;
        double expected = 11;
        double eps = 0.0001;
        double out = MathCalculator.sumAndMultiply(first, second);
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void sumAndDifferenceAndDivision() {
        double first = 3;
        double second = 2;
        double expected = 2.5;
        double eps = 0.0001;
        double out = MathCalculator.sumAndDifferenceAndDivision(first, second);
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void sumAndDifferenceAndDivisionAndSumAndMultiply() {
        double first = 3;
        double second = 2;
        double expected = 13.5;
        double eps = 0.0001;
        double out = MathCalculator.sumAndDifferenceAndDivisionAndSumAndMultiply(first, second);
        Assert.assertEquals(expected, out, eps);
    }
}