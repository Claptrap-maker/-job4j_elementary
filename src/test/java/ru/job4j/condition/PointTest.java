package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus43toMinus72then3dot16() {
        double expected = 3.16;
        Point first = new Point(-4, 3);
        Point second = new Point(-7, 2);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when28toMinus4Minus1then10dot81() {
        double expected = 10.81;
        Point first = new Point(2, 8);
        Point second = new Point(-4, -1);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2Minus1to04then5dot38() {
        double expected = 5.38;
        Point first = new Point(2, -1);
        Point second = new Point(0, 4);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus52to3Minus4then10() {
        double expected = 10;
        Point first = new Point(-5, 2);
        Point second = new Point(3, -4);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}