package org.katrin;

import java.util.HashMap;
import java.util.Map;

public class GoodPairsCalc {
    // 1 ms
    public int numIdenticalPairsTwoLoops(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) { // On2
                if (nums[i] == nums[j])
                    counter++;
            }
        }
        return counter;
    }

    // 1 ms
    public int numIdenticalPairsTwoPointers(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int counter = 0;
        while (left < right) {
            while (left != right) {  // On2
                if (nums[left] == nums[right])
                    counter++;
                right--;
            }
            right = nums.length - 1;
            left++;
        }
        return counter;
    }

    // 1 ms
    public int numIdenticalPairsMap(int[] nums) {
        int counter = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {  // On
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  // On
            int n = entry.getValue();
            counter += n * (n - 1) / 2;
        }
        return counter;
    }
}
