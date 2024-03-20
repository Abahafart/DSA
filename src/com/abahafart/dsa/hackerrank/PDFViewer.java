package com.abahafart.dsa.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PDFViewer {

  static final List<Integer> h = new ArrayList<>();
  static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
  static final Map<Character, Integer> alphabetNumber = new HashMap<>();

  public static void main(String[] args) {
    addValues();
    addAlphabet();
    String word = "abc";
    int maxValue = 0;
    for (Character letter: word.toCharArray()) {
      int tempValue = alphabetNumber.get(letter);
      if (tempValue > maxValue) {
        maxValue = tempValue;
      }
    }
  }

  static void addAlphabet() {
    int count = 0;
    for (Character letter: alphabet.toCharArray()) {
      alphabetNumber.put(letter, h.get(count));
      count++;
    }
  }

  static void addValues() {
    h.add(1);
    h.add(3);
    h.add(1);
    h.add(3);
    h.add(1);
    h.add(4);
    h.add(1);
    h.add(3);
    h.add(2);
    h.add(5);
    h.add(5);
    h.add(5);
    h.add(5);
    h.add(1);
    h.add(1);
    h.add(5);
    h.add(5);
    h.add(1);
    h.add(5);
    h.add(2);
    h.add(5);
    h.add(5);
    h.add(5);
    h.add(5);
    h.add(5);
    h.add(5);
  }

}
