package com.abahafart.dsa.java8problems;

import java.util.stream.Stream;

public class Fibonacci {

    public static void main(String[] args) {
        withoutStream(5);
        withStream(5);
    }

    private static void withStream(int limit) {
        Stream.iterate(new int[]{0,1}, t -> new int[]{t[1], t[0] + t[1]}).limit(10).map(b -> b[0])
                .forEach(System.out::println);
    }

    private static void withoutStream(int limit) {
        int start0 = 0;
        int start1 = 1;
        if(limit==2) {
            System.out.println(start0);
            System.out.println(start1);
        }
        for(int n=0; n < limit; n++) {
            System.out.println(start0);
            System.out.println(start1);
            start0 = start0 + start1;
            start1 = start0 + start1;
        }
    }

}
