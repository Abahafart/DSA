package com.abahafart.dsa.java8problems;

public class LoopsProblem {

    public static void main(String[] args) {
        int t=2;
        int constant = 2;
        for(int i=0;i<t;i++){
            int a = 0;
            int b = 2;
            int n = 10;
            StringBuilder print = new StringBuilder();
            for(int s = 0; s<n; s++) {
                long value = 0;
                for(int q=s; q>=0; q--) {
                    value+= (long) Math.pow(constant, q)*b;
                }
                value+= a;
                print.append(value).append(" ");
            }
            System.out.println(print.substring(0, print.length() - 1));
        }
    }
}
