package org.katrin;

import org.junit.Assert;
import org.junit.Test;

public class GoodPairsCalcTest {
    GoodPairsCalc calc = new GoodPairsCalc();

    @Test
    public void numIdenticalPairsTwoLoopsTest() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int expected = 4;
        int actual = calc.numIdenticalPairsTwoLoops(nums);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numIdenticalPairsTwoPointersTest() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int expected = 4;
        int actual = calc.numIdenticalPairsTwoPointers(nums);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numIdenticalPairsMapTest() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int expected = 4;
        int actual = calc.numIdenticalPairsMap(nums);
        Assert.assertEquals(expected, actual);
    }
}
