package com.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {

    //return type: void
    //
    public static void main(String[] args) {

        Consumer<Integer> consumer= (t) -> System.out.println("Value : "+t);
        consumer.accept(1);
    }
}
