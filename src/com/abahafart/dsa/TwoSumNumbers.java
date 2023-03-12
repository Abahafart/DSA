package com.abahafart.dsa;

import java.util.HashMap;
import java.util.Map;

public class TwoSumNumbers {
    // Given an array of integers, return indices of the two numbers such that they add up to a specific target
    public int[] twoSUm(int[] array, int target) {
        Map<Integer, Integer> mapSum = new HashMap<>();
        for(int i=0; i < array.length; i++) {
            int temp = target - array[i];
            if(mapSum.containsKey(temp)) {
                return new int[]{mapSum.get(temp), i};
            }
            mapSum.put(temp, i);
        }
        throw new IllegalArgumentException("NO two sum solution");
    }
}
