package com.abahafart.dsa.dynamic;

public class DecimalToBinary {

  public static void main(String[] args) {
    int value = 10;
    System.out.println(toBinary(value));
  }

  public static String toBinary(int value) {
    String result = "";
    if (value > 0) {
      int binary = value % 2;
      value = value / 2;
      result = toBinary(value) +binary;
    }
    return result;
  }
}
