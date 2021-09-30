package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumByEven0To0Then0() {
        int start = 0;
        int finish = 0;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenSumByEven0To1Then0() {
        int start = 0;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenSumByEven1To5Then0() {
        int start = 1;
        int finish = 5;
        int result = Counter.sumByEven(start, finish);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenSumByEven5To1Then0() {
        int start = 5;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        Assert.assertEquals(result, expected);
    }

}