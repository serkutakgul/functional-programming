package com.java.streams;

import java.util.Arrays;

public class StreamDemo3 {
    public static void main(String[] args) {

        Arrays.stream(new long[] {1,3,5,7,9})
                .map(x -> x*x)
                .filter(x -> x>30)
                .min()
                .ifPresent(System.out::print);


    }
}
