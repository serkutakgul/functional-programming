package com.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Ankara");
        cities.add("Almaty");
        cities.add("Tokyo");
        cities.add("Berlin");
        cities.add("Aleppo");


        System.out.println("Cities starting with 'a'");
        Stream<String> cityStream=cities.stream();
        cityStream
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .sorted()
                //.map(string -> Character.toUpperCase(string.charAt(0))+string.substring(1))
                .map(string -> string.substring(0, 1).toUpperCase() + string.substring(1))
                .forEach(x-> System.out.println(x));




        System.out.println("Cities including 'o'");

        Stream<String> cityStream2=cities.stream();
        List<String> oList;
        oList=cityStream2
                .filter(x -> x.contains("o"))
                .collect(Collectors.toList());
        oList.stream().forEach(System.out::println);


    }
}