package com.java.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo1 {
/*

    *Non-terminal operations            |          * Terminal operations
    -----------------------------------------------------------------------------
    *map()                              |          * forEach
    *filter()                           |          * collect
    *limit()                            |          * reduce
    *distinct()                         |          * findAny/findFirst
    *flatMap()                          |          * anyMatch/allMatch/noneMatch
    *peek()                             |          * min/max,count,toArray
    ------------------------------------------------------------------------------
     Concatenate streams                |          Parallel stream processing

*/

//Stream.of("","","")--->Creating a stream from one or more objects.

    public static void main(String[] args) {

        IntStream stream = IntStream.range(0, 10);
        stream.skip(2).forEach(System.out::print);

        String[] cities = {"Ankara", "Paris", "Berlin", "Tokyo", "Almaty"};
        Arrays.stream(cities)
                .map(city -> city.toLowerCase())
                .forEach(city -> System.out.println(city));


        Stream.of(cities)
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);


    }
}
