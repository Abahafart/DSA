package com.abahafart.dsa.java8problems;

public class JumpingOnTheCloud {

  public static void main(String[] args){
    int[] input = new int[]{1 ,1 ,0 ,1 ,0 ,1 ,0 ,1 ,0 ,1 ,0 ,1 ,1 ,0 ,1 ,1 ,1 ,1 ,1};
    int jump = 19;
    System.out.println(jumpingOnClouds(input, jump));
  }

  static int jumpingOnClouds(int[] c, int k) {
    int total = c.length;
    int energy = 100;
    int start = 0;
    if(total == 0) {
      return energy;
    }
    if (k==total) {
      if (c[0]==1) {
        start+=2;
      }
      start+=1;
      return energy-start;
    }
    boolean flag = true;
    int i = 0;
    while (flag) {
      if(i> total) {
        i=i-total;
      }
      if (c[i] == 1) {
        start += 2;
      }
      i += k;
      start += 1;
      if (i == total) {
        flag = false;
      }
    }
    return energy-start;
  }
}
