package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void whenFirstMin() {
        int[] data = {0, 3, 1};
        int expected = 0;
        int result = Min.findMin(data);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSecondMin() {
        int[] data = {1, 0, 1};
        int expected = 0;
        int result = Min.findMin(data);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] data = {1, 2, 0};
        int expected = 0;
        int result = Min.findMin(data);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenAllMin() {
        int[] data = {2, 2, 2};
        int expected = 2;
        int result = Min.findMin(data);
        Assert.assertEquals(expected, result);
    }
}