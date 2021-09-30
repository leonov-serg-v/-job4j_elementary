package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalc0Then1() {
        int n = 0;
        int result = Factorial.calc(n);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalc1Then1() {
        int n = 1;
        int result = Factorial.calc(n);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalc2Then2() {
        int n = 2;
        int result = Factorial.calc(n);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalc5Then120() {
        int n = 5;
        int result = Factorial.calc(n);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

}