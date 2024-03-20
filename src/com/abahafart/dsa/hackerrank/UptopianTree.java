package com.abahafart.dsa.hackerrank;

public class UptopianTree {

  public static void main(String[] args) {
    int n = 4;
    int growth = 1;
    for (int i = 1; i <= n; i++) {
      if (i%2==0) {
        growth++;
      } else {
        growth=growth*2;
      }
    }
    System.out.println("Total "+growth);
  }

}
