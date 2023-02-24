package com.abahafart.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,1,2);
        System.out.println(pickingNumbers(list));
    }

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int sum = 1;
        int min = 1;
        int middle = 0;
        List<Integer> total = new ArrayList<>();
        for(int i=0; i < a.size(); i++) {
            int firstValue = a.get(i);
            for(int j=i+1; j < a.size(); j++) {
                int secondValue = a.get(j);
                if(Math.abs(firstValue - secondValue) <= 1 && firstValue > secondValue) {
                    sum++;
                }else if(Math.abs(firstValue - secondValue) <= 1 && firstValue < secondValue) {
                    min++;
                }else if (firstValue == secondValue) {
                    middle++;
                }
            }
            if(sum>min) {
                sum+=middle;
            }else{
                min+=middle;
            }
            total.add(sum);
            total.add(min);
            sum = 1;
            min = 1;
            middle = 0;
        }
        return total.stream().max(Integer::compare).get();
    }
}
