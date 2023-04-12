package com.abahafart.dsa;

import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        Random generateNumber = new Random();
        int[] listNumbers = new int[generateNumber.nextInt(10)];
        for(int i=0;i< listNumbers.length; i++) {
            listNumbers[i] = generateNumber.nextInt(100)*3;
        }
        int greatestNumberFound = greatestNumber(listNumbers);
    }

    public static int greatestNumber(int[] listNumbers) {
        int back = 0;
        for (int number: listNumbers) {
            if(number>back) {
                back = number;
            }
        }
        return back;
    }

}
