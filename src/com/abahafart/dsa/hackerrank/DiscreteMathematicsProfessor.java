package com.abahafart.dsa.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DiscreteMathematicsProfessor {

  public static void main(String[] args) {
    int k = 2;
    List<Integer> a = new ArrayList<>();
    a.add(0);
    a.add(-1);
    a.add(2);
    a.add(1);
    long studentsOk = a.stream().filter(number -> number <= 0).count();
    if (studentsOk >= k) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
    }
  }
}
