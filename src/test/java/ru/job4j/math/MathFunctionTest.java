package ru.job4j.math;

import org.junit.Assert;
import org.junit.Test;

public class MathFunctionTest {
    @Test
    public void sum() {
        double first = 3;
        double second = 2;
        double expected = 5;
        double eps = 0.0001;
        double out = MathFunction.sum(first, second);
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void multiply() {
        double first = 3;
        double second = 2;
        double expected = 6;
        double eps = 0.0001;
        double out = MathFunction.multiply(first, second);
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void difference() {
        double first = 3;
        double second = 2;
        double expected = 1;
        double eps = 0.0001;
        double out = MathFunction.difference(first, second);
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void division() {
        double first = 3;
        double second = 2;
        double expected = 1.5;
        double eps = 0.0001;
        double out = MathFunction.division(first, second);
        Assert.assertEquals(expected, out, eps);
    }
}