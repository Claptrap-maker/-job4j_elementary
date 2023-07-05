package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus43toMinus72then3dot16() {
        double expected = 3.16;
        int x1 = -4;
        int y1 = 3;
        int x2 = -7;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when28toMinus4Minus1then10dot81() {
        double expected = 10.81;
        int x1 = 2;
        int y1 = 8;
        int x2 = -4;
        int y2 = -1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2Minus1to04then5dot38() {
        double expected = 5.38;
        int x1 = 2;
        int y1 = -1;
        int x2 = 0;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus52to3Minus4then10() {
        double expected = 10;
        int x1 = -5;
        int y1 = 2;
        int x2 = 3;
        int y2 = -4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}