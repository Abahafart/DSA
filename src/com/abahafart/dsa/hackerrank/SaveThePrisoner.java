package com.abahafart.dsa.hackerrank;


public class SaveThePrisoner {

  public static void main(String[] args) {
    int prisoners = 3;
    int candies = 7;
    int started = 3;
    System.out.println("Prisoner finished "+calculate(prisoners,candies, started));
  }

  static int calculate(int n, int m, int s) {
    int index = (m-1+s-1) % n +1;
    if (index == 0) {
      index = n;
    }
    return index;
  }
}
