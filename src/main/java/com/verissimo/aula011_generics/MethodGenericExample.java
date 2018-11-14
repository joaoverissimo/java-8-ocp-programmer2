package com.verissimo.aula011_generics;

import java.util.ArrayList;
import java.util.List;

public class MethodGenericExample {

    public static <T> void print(T item) {
        System.out.println(item.toString());
    }

    public static <T> List<T> arrayOf(T item1, T item2) {
        List<T> list = new ArrayList<T>();
        list.add(item1);
        list.add(item2);
        return list;
    }

    public static void main(String[] args) {
        print(12);
        print(new Cachorro());

        List<String> arr = arrayOf("item 1", "item 2");
        System.out.println(arr);

        List<Integer> arr2 = arrayOf(2, 5);
        System.out.println(arr2);
    }

}
