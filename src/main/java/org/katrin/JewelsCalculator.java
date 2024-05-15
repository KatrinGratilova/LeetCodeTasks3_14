package org.katrin;

public class JewelsCalculator {
    // 0 ms
    public int numJewelsInStonesOneLoop(String jewels, String stones) {
        int counter = 0;
        for (int i = 0; i < stones.length(); i++) { // On
            if (jewels.indexOf(stones.charAt(i)) != -1)
                counter++;
        }
        return counter;
    }

    // 0 ms
    public int numJewelsInStonesTwoArrays(String jewels, String stones) {
        int counter = 0;
        char[] stonesArray = stones.toCharArray();
        char[] jewelsArray = jewels.toCharArray();

        for (char c : stonesArray) {
            for (char b : jewelsArray) { // On2
                if (c == b)
                    counter++;
            }
        }
        return counter;
    }

    // 1 ms
    public int numJewelsInStonesTwoLoops(String jewels, String stones) {
        int counter = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) { // On2
                if (stones.charAt(i) == jewels.charAt(j)) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
