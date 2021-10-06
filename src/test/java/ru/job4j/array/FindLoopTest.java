package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
      int[] data = {5, 4, 3, 2};
      int key = 5;
      int result = FindLoop.indexOf(data, key);
      int expected = 0;
      Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas2Then3() {
        int[] data = {5, 4, 3, 2};
        int key = 2;
        int result = FindLoop.indexOf(data, key);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }
    
    @Test
    public void whenArrayHas20ThenNoFound() {
        int[] data = {5, 4, 3, 2};
        int key = 20;
        int result = FindLoop.indexOf(data, key);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

}