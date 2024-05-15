package org.katrin;

import org.junit.Assert;
import org.junit.Test;

public class JewelsCalculatorTest {
    JewelsCalculator calc = new JewelsCalculator();

    @Test
    public void numJewelsInStonesOneLoopOk() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;
        int actual = calc.numJewelsInStonesOneLoop(jewels, stones);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numJewelsInStonesOneLoopZeroRes() {
        String jewels = "f";
        String stones = "FF";
        int expected = 0;
        int actual = calc.numJewelsInStonesOneLoop(jewels, stones);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numJewelsInStonesTwoArraysOk() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;
        int actual = calc.numJewelsInStonesTwoArrays(jewels, stones);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numJewelsInStonesTwoArraysZeroRes() {
        String jewels = "f";
        String stones = "FF";
        int expected = 0;
        int actual = calc.numJewelsInStonesTwoArrays(jewels, stones);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numJewelsInStonesTwoLoopsOk() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;
        int actual = calc.numJewelsInStonesTwoLoops(jewels, stones);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numJewelsInStonesTwoLoopsZeroRes() {
        String jewels = "f";
        String stones = "FF";
        int expected = 0;
        int actual = calc.numJewelsInStonesTwoArrays(jewels, stones);
        Assert.assertEquals(expected, actual);
    }
}
