package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        double expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To00Then0() {
        double expected = 0;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when0n1To00Then0() {
        double expected = 1;
        Point point1 = new Point(0, -1);
        Point point2 = new Point(0, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01To01Then0() {
        double expected = 0;
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 1);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}