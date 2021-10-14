package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSumTest {

    @Test
    public void whenSingle() {
        int[][] data = {{10}};
        int expected = 10;
        int result = MatrixSum.sum(data);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSecond() {
        int[][] data = {{1, 2}, {1, 2}};
        int expected = 6;
        int result = MatrixSum.sum(data);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenOther() {
        int[][] data = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        int expected = 19;
        int result = MatrixSum.sum(data);
        Assert.assertEquals(expected, result);
    }

}