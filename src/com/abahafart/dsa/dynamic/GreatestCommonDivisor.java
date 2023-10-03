package com.abahafart.dsa.dynamic;

public class GreatestCommonDivisor {

  public static int calculateGCD(int valueA, int valueB) {
    int greatest = 0;
    if (valueA == valueB) {
      return valueA;
    } else if (valueA > valueB) {
      for (int i = 1; i <= valueB; i++) {
        if (valueA%i == 0 && valueB%i == 0) {
          greatest = i;
        }
      }
    }else {
      for (int i = 1; i <= valueA; i++) {
        if (valueA%i == 0 && valueB%i == 0) {
          greatest = i;
        }
      }
    }
    return greatest;
  }

  public static int calculateGCDRecursion(int valueA, int valueB) {// 25,30|30,25|25,5|5,0|
    if (valueB == 0) {
      return valueA;
    }
    return calculateGCDRecursion(valueB, valueA % valueB);
  }

  public static void main(String[] args) {
    int valueA = 25;
    int valueB = 30;
    System.out.println(valueA % valueB);
    System.out.println("Greatest Common Divisor by "+valueB+" and "+valueA+" is "+calculateGCD(valueA, valueB));
    System.out.println("Greatest Common Divisor by "+valueB+" and "+valueA+" is "+calculateGCDRecursion(valueA, valueB));
  }
}
