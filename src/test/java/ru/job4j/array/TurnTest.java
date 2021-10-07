package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void when1() {
        int[] nums = new int[] {1};
        int[] expected = new int[] {1};
        int[] result = Turn.back(nums);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when2() {
        int[] nums = new int[] {1, 2};
        int[] expected = new int[] {2, 1};
        int[] result = Turn.back(nums);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when3() {
        int[] nums = new int[] {1, 2, 3};
        int[] expected = new int[] {3, 2, 1};
        int[] result = Turn.back(nums);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when4() {
        int[] nums = new int[] {1, 2, 3, 4};
        int[] expected = new int[] {4, 3, 2, 1};
        int[] result = Turn.back(nums);
        Assert.assertArrayEquals(expected, result);
    }

}