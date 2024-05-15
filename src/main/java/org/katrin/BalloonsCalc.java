package org.katrin;

import static java.lang.Math.min;

public class BalloonsCalc {
    // 1 ms
    public int maxNumberOfBalloonsSwitch(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        for (char letter : text.toCharArray()) { // On
            switch (letter) {  // On
                case 'b':
                    b++;
                    break;
                case 'a':
                    a++;
                    break;
                case 'l':
                    l++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'n':
                    n++;
                    break;
            }
        }
        return min(b, min(a, min(n, min(l / 2, o / 2))));
    }
}
