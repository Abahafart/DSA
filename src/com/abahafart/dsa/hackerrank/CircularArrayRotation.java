package com.abahafart.dsa.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CircularArrayRotation {

  public static void main(String[] args) {
    List<Integer> array = Arrays.asList(1,2,3);
    int k = 2;
    List<Integer> queries = Arrays.asList(0,1,2);
    circularArrayRotation(array, k, queries).forEach(System.out::println);
  }

  static List<Integer> circularArrayRotation(List<Integer> array, int k, List<Integer> queries) {
    int rest = k % array.size();
    List<Integer> getQueries = new ArrayList<>();
    if (rest == 0) {
      queries.forEach(value -> getQueries.add(array.get(value)));
      return getQueries;
    }
    Collections.rotate(array, rest);
    queries.forEach(value -> getQueries.add(array.get(value)));
    return getQueries;
  }

}
