package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] nums = new int[] {1, 2, 3, 4};
        int source = 0;
        int dest = nums.length - 1;
        int[] result = SwitchArray.swap(nums, source, dest);
        int[] expected = new int[] {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0To2() {
        int[] nums = new int[] {1, 2, 3, 4};
        int source = 0;
        int dest = nums.length - 2;
        int[] result = SwitchArray.swap(nums, source, dest);
        int[] expected = new int[] {3, 2, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1To2() {
        int[] nums = new int[] {1, 2, 3, 4};
        int source = 1;
        int dest = nums.length - 2;
        int[] result = SwitchArray.swap(nums, source, dest);
        int[] expected = new int[] {1, 3, 2, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2To3() {
        int[] nums = new int[] {1, 2, 3, 4};
        int source = 2;
        int dest = nums.length - 1;
        int[] result = SwitchArray.swap(nums, source, dest);
        int[] expected = new int[] {1, 2, 4, 3};
        Assert.assertArrayEquals(expected, result);
    }

}