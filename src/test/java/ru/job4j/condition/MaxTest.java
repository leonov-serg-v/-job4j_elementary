package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To2Then10() {
        int left = 10;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax0To0Then0() {
        int left = 0;
        int right = 0;
        int result = Max.max(left, right);
        int expected = 0;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To20To15Then15() {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;
        int result = Max.max(num1, num2, num3);
        int expected = 20;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To20To15To100Then100() {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;
        int num4 = 100;
        int result = Max.max(num1, num2, num3, num4);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }

}