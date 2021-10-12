package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqLastTest {

    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] rigth = {5, 4, 3};
        boolean result = EqLast.check(left, rigth);
        Assert.assertTrue(result);
    }
    
    @Test
    public void whenNoEq() {
        int[] left = {1, 2, 3};
        int[] rigth = {5, 4, 0};
        boolean result = EqLast.check(left, rigth);
        Assert.assertFalse(result);
    }

}