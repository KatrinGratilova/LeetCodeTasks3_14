package org.katrin;

import org.junit.Assert;
import org.junit.Test;

public class JewelsCalculatorTest {
    JewelsCalculator calc = new JewelsCalculator();

    @Test
    public void numJewelsInStonesOneLoopTest() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;
        int actual = calc.numJewelsInStonesOneLoop(jewels, stones);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numJewelsInStonesTwoArraysLoopTest() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;
        int actual = calc.numJewelsInStonesTwoArrays(jewels, stones);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numJewelsInStonesTwoLoopsTest() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;
        int actual = calc.numJewelsInStonesTwoLoops(jewels, stones);
        Assert.assertEquals(expected, actual);
    }
}
