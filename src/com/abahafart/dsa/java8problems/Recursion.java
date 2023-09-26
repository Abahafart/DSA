package com.abahafart.dsa.java8problems;

import java.util.Arrays;
import java.util.List;

public class Recursion {

  public static void countdown(int value) {
    if (value == 0) {// base case
      System.out.println("Happy new year");
    } else {
      System.out.println(value);// prologue operations
      countdown(value-1);// recursive case
      System.out.println(value);// epilogue operations
    }
  }

  public static void decrementToZero(int value) {
    System.out.println(value);// prologue
    if(value>0) {// base case
      decrementToZero(value-1);// recursive case
    }
  }

  public static int factorial(int factor) {
    if (factor == 0) {
      return 1;
    } else {
      return factor * factorial(factor-1);
    }
  }

  public static void printNumbers(int number) {
    if (number < 0) {
      return;
    }
    System.out.println(number);
    printNumbers(number-1);
  }

  public static int sumNumbersIterative(List<Integer> numbers) {
    int result = 0;
    for (int number : numbers) {
      result+= number;
    }
    return  result;
  }

  public static int sumNumbersRecursive(List<Integer> numbers) {
    if (numbers.isEmpty()) {
      return 0;
    }
    int latest = numbers.size()-1;
    return numbers.get(latest) + sumNumbersRecursive(numbers.subList(0, latest));
  }

  public static void main(String[] args) {
//    printNumbers(3);
    List<Integer> numbers = Arrays.asList(5,8,9,6,3);// 31
    System.out.println(sumNumbersIterative(numbers));
    System.out.println(sumNumbersRecursive(numbers));
  }

}
