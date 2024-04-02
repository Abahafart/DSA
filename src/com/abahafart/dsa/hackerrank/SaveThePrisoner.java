package com.abahafart.dsa.hackerrank;


public class SaveThePrisoner {

  public static void main(String[] args) {
    int prisoners = 3;
    int candies = 7;
    int started = 3;
    System.out.println("Prisoner finished "+calculate(prisoners,candies, started));
  }

  static int calculate(int n, int m, int s) {
    if (m/ s == n) {
      return m;
    }
    if (m < n) {
      if (s == n) {
        return s - m;
      } else if (s < n) {
        return s + (m -1);
      }
    }
    while (m >= n) {

    }
    return 0;
  }
}
