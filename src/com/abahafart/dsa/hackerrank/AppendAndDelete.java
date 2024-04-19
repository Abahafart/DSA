package com.abahafart.dsa.hackerrank;

import java.util.Arrays;

public class AppendAndDelete {

  public static void main(String[] args) {
    String input = "y";
    String output = "yu";
    int k = 6;
    System.out.println(appendAndDelete(input, output, k));
  }

  static String appendAndDelete(String s, String t, int k) {
    int lengthBetweenThem = 0;
    if (s.length() > t.length()) {
      lengthBetweenThem = s.length() - t.length();
      if (lengthBetweenThem > k) {
        return "No";
      }
    } else if (s.length() < t.length()) {
      lengthBetweenThem = t.length() - s.length();
      if (lengthBetweenThem > k) {
        return "No";
      }
    }
    if (s.contains(t) && t.length()+k == s.length()) {
      return "Yes";
    }
    int point = 0;
    for (int i = 0; i < s.length(); i++) {
      if (t.charAt(i) != s.charAt(i)) {
        point = i;
        break;
      }
    }
    String copyS = s.substring(0, point);
    String copyT = t.substring(0, point);
    int differenceS = s.length() - copyS.length();
    int differenceT = t.length() - copyT.length();
    int total = differenceS + differenceT;
    if (total <= k) {
      return "Yes";
    } else {
      if (Arrays.asList(s.toCharArray()).stream().distinct().count() == 1 &&
          Arrays.asList(t.toCharArray()).stream().distinct().count() == 1 &&
          s.charAt(0) == t.charAt(0)) {
        return "Yes";
      }
      return "No";
    }
  }

}
