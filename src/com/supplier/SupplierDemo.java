package com.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    //single abstract method: T get()

    public static void main(String[] args) {

        Supplier<String> supplier= () -> "Hello World !!!";
        System.out.println(supplier.get());

        List<String> list = Arrays.asList("Java","Lisp","Ruby");
        System.out.println(list.stream().findAny().orElseGet(() -> "C++"));


    }
}
