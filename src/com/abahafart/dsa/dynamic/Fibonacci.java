package com.abahafart.dsa.dynamic;

import java.util.HashMap;

public class Fibonacci {

  static HashMap<Integer, Integer> store = new HashMap<>();
  static int fibonacciMemoization(int value) {
    if (store.containsKey(value)) {
      return store.get(value);
    }
    int result;
    if (value == 0) {
      result = 0;
    } else if (value == 1) {
      result = 1;
    } else {
      result = fibonacciMemoization(value-1) + fibonacciMemoization(value-2);
    }
    store.put(value, result);
    return result;
  }

  static int fibonacciTabulation(int value) {
    if (value == 0) {
      return 0;
    }
    int[] table = new int[value+1];

    table[0] = 0;
    table[1] = 1;
    for (int i = 2; i <= value; i++) {
      table[i] = table[i-1]+table[i-2];
    }
    return table[value];
  }

  public static void main(String[] args) {
    int value = 5;
    System.out.println("Result from fibonacciMemoization "+fibonacciMemoization(value));
    System.out.println("Result from fibonacciTabulation "+fibonacciTabulation(value));
  }
}
