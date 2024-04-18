package com.abahafart.dsa.hackerrank;

public class FindDigits {

  public static void main(String[] args) {
    int n = 1012;
    int temp = n;
    int count = 1;
    while (n>= 10) {
      int rest = n % 10;
      if (rest > 0 && temp % rest == 0) {
        count++;
      }
      n/= 10;
    }
    System.out.println(count);
  }

}
