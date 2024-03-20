package com.abahafart.dsa.hackerrank;

public class ViralAdvertising {

  public static void main(String[] args) {
    int n = 4;// days
    System.out.println("Viral advertising "+viralAdvertising(n));
  }

  static int viralAdvertising(int n) {
    if (n == 1) {
      return 2;
    }
    int sharedWithFriends = 5;
    int comulative = 0;
    for (int i = 1; i <= n; i++) {
      int shared = sharedWithFriends/2;
      sharedWithFriends = shared*3;
      comulative = comulative+shared;
    }
    return comulative;
  }

}
