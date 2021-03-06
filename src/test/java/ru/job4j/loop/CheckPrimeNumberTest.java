package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertTrue(result);
    }

    @Test
    public void when4() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void when1() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void whenCheck1ThenFalse() {
        int n = 1;
        boolean result =  CheckPrimeNumber.check(n);
        boolean expected = false;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCheck2ThenTrue() {
        int n = 2;
        boolean result =  CheckPrimeNumber.check(n);
        boolean expected = true;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCheck4ThenTrue() {
        int n = 4;
        boolean result =  CheckPrimeNumber.check(n);
        boolean expected = false;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCheck5ThenTrue() {
        int n = 5;
        boolean result =  CheckPrimeNumber.check(n);
        boolean expected = true;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCheck12ThenTrue() {
        int n = 12;
        boolean result =  CheckPrimeNumber.check(n);
        boolean expected = false;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCheck13ThenTrue() {
        int n = 13;
        boolean result =  CheckPrimeNumber.check(n);
        boolean expected = true;
        Assert.assertEquals(expected, result);
    }

}