package com.abahafart.dsa.hackerrank;

import java.math.BigInteger;

public class ExtraLongFactorial {

  public static void main(String[] args) {
    int n = 23;
    if(n<=1) {
      System.out.println(1);
      return;
    }
    BigInteger value = BigInteger.valueOf(n);
    while(n> 1) {
      value = value.multiply(BigInteger.valueOf(n-1));
      n-=1;
    }
    System.out.println(value);
  }

}
