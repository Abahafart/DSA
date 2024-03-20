package com.abahafart.dsa.hackerrank;

public class BeautifulDays {

  public static void main(String[] args) {
    int  i = 20;
    int j = 23;
    int k = 6;
    int count = 0;
    for (; i<=j; i++) {
      String number = String.valueOf(i);
      StringBuilder secondNumber = new StringBuilder(number);
      int reverseNumber = Integer.parseInt(secondNumber.reverse().toString());
      if (Math.abs(i-reverseNumber)%k == 0) {
        count++;
      }
    }
    System.out.println("Found "+count);
  }
}
