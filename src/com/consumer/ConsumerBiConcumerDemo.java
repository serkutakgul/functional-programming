package com.consumer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerBiConcumerDemo {


    //single abstract method :  void accept(T t);

    public static void main(String[] args) {
//Concumer
        Consumer<Integer> consumer= (t) -> System.out.println("Value : "+t);
        consumer.accept(1);

        List<Integer> list = Arrays.asList(1,2,3);
        list.stream().forEach(t -> System.out.print(t+ " "));
        System.out.println();
//BiConsumer
        Map<Integer,String> map =  new HashMap<>();
        BiConsumer<Integer, String> biConsumer = (k, v) -> map.put(k, v);
        biConsumer.accept(90,"Turkey");
        biConsumer.accept(213,"Algeria");
        biConsumer.accept(55,"Brazil");
        biConsumer.accept(353,"Ireland");

        map.forEach((key,value)-> System.out.println(key+" -"+value));

        //  map.entrySet().stream().forEach(object -> System.out.println(object));
    }
}
