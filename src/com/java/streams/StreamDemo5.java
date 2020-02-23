package com.java.streams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo5 {

    //that can reduce all elements in the stream to a single element

    public static void main(String[] args) {
        double total = Stream.of(1.1, 8.9, 5.5)
                .reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println("Total = " + total);


        IntSummaryStatistics summary = IntStream.of(29, 98, 13, 97, 88, 11, 11)
                .summaryStatistics();
        System.out.println(summary);
    }
}
