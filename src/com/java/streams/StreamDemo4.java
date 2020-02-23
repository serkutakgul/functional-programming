package com.java.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) throws IOException {
        //every line is stream
        Stream<String> row
                = Files.lines(Paths.get("file.txt"));
        row.map(x -> x.split(",")).forEach( x-> System.out.println(Arrays.toString(x)));



        Stream<String> row2
                = Files.lines(Paths.get("file.txt"));
        Map<String, Integer> map = new HashMap<>();
        map = row2
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 32)
                .collect(Collectors.toMap(
                        x -> x[0]+x[2],
                        x -> Integer.parseInt(x[1])));

        for (String key : map.keySet()) {
            System.out.println(key + "  " + map.get(key));
        }
    }
}
