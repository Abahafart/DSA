package com.abahafart.dsa.java8problems;

import java.util.Arrays;
import java.util.List;

public class UseMap {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,6,5,8,9,7,4,2,3);
        List<Integer> ordered = list.stream().sorted(Integer::compareTo).peek(System.out::println).toList();
    }

}
