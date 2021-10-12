package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort3Any() {
        int[] data = {2, 1, 3};
        int[] expected = {1, 2, 3};
        int[] result = SortSelected.sort(data);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3All() {
        int[] data = {0, 0, 0};
        int[] expected = {0, 0, 0};
        int[] result = SortSelected.sort(data);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5() {
        int[] data = {5, 4, 3, 1, 1};
        int[] expected = {1, 1, 3, 4, 5};
        int[] result = SortSelected.sort(data);
        Assert.assertArrayEquals(expected, result);
    }

}