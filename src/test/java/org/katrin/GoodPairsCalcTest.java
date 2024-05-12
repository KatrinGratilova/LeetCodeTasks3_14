package org.katrin;

import org.junit.Assert;
import org.junit.Test;

public class GoodPairsCalcTest {
    GoodPairsCalc calc = new GoodPairsCalc();

    @Test
    public void numIdenticalPairsTwoLoopsOk() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int expected = 4;
        int actual = calc.numIdenticalPairsTwoLoops(nums);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numIdenticalPairsTwoLoopsZeroRez() {
        int[] nums = {1, 2, 3};
        int expected = 0;
        int actual = calc.numIdenticalPairsTwoLoops(nums);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numIdenticalPairsTwoPointersOk() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int expected = 4;
        int actual = calc.numIdenticalPairsTwoPointers(nums);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numIdenticalPairsTwoPointersZeroRez() {
        int[] nums = {1, 2, 3};
        int expected = 0;
        int actual = calc.numIdenticalPairsTwoPointers(nums);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numIdenticalPairsMapOk() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int expected = 4;
        int actual = calc.numIdenticalPairsMap(nums);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numIdenticalPairsMapZeroRez() {
        int[] nums = {1, 2, 3};
        int expected = 0;
        int actual = calc.numIdenticalPairsMap(nums);
        Assert.assertEquals(expected, actual);
    }
}
