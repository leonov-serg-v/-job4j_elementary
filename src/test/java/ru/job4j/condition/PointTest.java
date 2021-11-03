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
    public void when010To010Then0() {
        double expected = 0;
        Point point1 = new Point(0, 1, 0);
        Point point2 = new Point(0, 1, 0);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when004To204Then2() {
        double expected = 2;
        Point point1 = new Point(0, 0, 4);
        Point point2 = new Point(2, 0, 4);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when014To208Then4dot58() {
        double expected = 4.58;
        Point point1 = new Point(0, 1, 4);
        Point point2 = new Point(2, 0, 8);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

}