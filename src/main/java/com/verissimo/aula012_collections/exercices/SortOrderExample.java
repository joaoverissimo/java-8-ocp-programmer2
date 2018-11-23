package com.verissimo.aula012_collections.exercices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortOrderExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("aaa");
        list.add("bbb");
        list.add("123");

        Collections.sort(list);
        System.out.println(list);
        //[123, AAA, BBB, aaa, bbb]
    }

}
