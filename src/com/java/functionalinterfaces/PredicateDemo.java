package com.java.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo{

    //single abstract method:boolean test(T t)

    public static void main(String[] args) {

        Predicate<Integer> predicate= (t)-> t>100;
        System.out.println(predicate.test(1000));

       //
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers.stream().filter(t -> t%3==0).forEach(t -> System.out.println(t));
    }
}
