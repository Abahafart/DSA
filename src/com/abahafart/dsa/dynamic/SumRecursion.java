package com.abahafart.dsa.dynamic;

public class SumRecursion {
  static int sumRecursion(int value) {
    if (value == 1) {
      return 1;
    }
    int result = value;
    if (value > 1) {
      result = result + sumRecursion(value-1);
    }
    return result;
  }

  static int sumRecursion1(int value) {
    if (value <= 0) {
      return 0;
    }
    return value + sumRecursion1(value-1);
  }

  public static void main(String[] args) {
    int value = 3;
    System.out.println(sumRecursion(value));
    System.out.println(sumRecursion1(value));
  }
}
