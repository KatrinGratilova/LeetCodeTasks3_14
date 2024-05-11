package org.katrin;

import org.junit.Assert;
import org.junit.Test;

public class BalloonsCalcTest {
    BalloonsCalc calc = new BalloonsCalc();

    @Test
    public void maxNumberOfBalloonsSwitchTest() {
        String text = "nlaebolko";
        int expected = 1;
        int actual = calc.maxNumberOfBalloonsSwitch(text);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maxNumberOfBalloonsSwitchTestZeroRez() {
        String text = "leetcode";
        int expected = 0;
        int actual = calc.maxNumberOfBalloonsSwitch(text);
        Assert.assertEquals(expected, actual);
    }

}
