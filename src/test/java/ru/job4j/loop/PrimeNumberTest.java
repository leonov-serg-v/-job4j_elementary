package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void when5Then3() {
        int finish = 5;
        int expected = 3;
        int result = PrimeNumber.calc(finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when11Then5() {
        int finish = 11;
        int expected = 5;
        int result = PrimeNumber.calc(finish);
        Assert.assertEquals(expected, result);
    }
}