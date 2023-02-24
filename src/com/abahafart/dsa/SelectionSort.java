package com.abahafart.dsa;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[] {21,6,5,9,7,5,3,6};
        for (int number: sort(array)) {
            System.out.println(number);
        }
    }

    public static int[] sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int temp = i;
            for(int j = i+1; j < array.length; j++) {
                if(array[j] < array[temp]) {
                    temp = j;
                }
            }
            if(temp != i) {
                int tempValue = array[temp];
                array[temp] = array[i];
                array[i] = tempValue;
            }
        }
        return array;
    }
}
