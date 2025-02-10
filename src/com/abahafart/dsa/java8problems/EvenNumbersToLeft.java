package com.abahafart.dsa.java8problems;

public class EvenNumbersToLeft {

  public static void main(String[] args){
    int[] values = init();
    int[] vals = ordered(values);
    StringBuilder builder = new StringBuilder();
    for(int i : vals) {
      builder.append(i).append(",");
    }
    System.out.println(builder);
  }

  static int[] init() {
    int[] values = new int[100];
    for (int i = 0; i < values.length; i++) {
      values[i] = (int)(Math.random()*100+1);
    }
    return values;
  }

  static int[] ordered(int[] values) {
    int total = values.length;
    int position = 0;
    for (int i = 0; i < total; i++) {
      int num = values[i];
      if (num % 2 == 0) {
        int temp = values[position];
        values[position] = num;
        values[i] = temp;
        position++;
      }
    }
    return values;
  }
}
