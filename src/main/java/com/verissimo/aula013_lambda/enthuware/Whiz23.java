package com.verissimo.aula013_lambda.enthuware;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Whiz23 {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Tom Cruise", "Tom Hart", "Tom Hanks", "Tom Brady");
        Predicate<String> p = str -> {
            System.out.println("Looking...");
            return str.indexOf("Tom") > -1;
        };
        boolean flag = ls.stream().filter(str -> str.length() > 8).allMatch(p);


        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Stream<Integer> ints = list.stream().map(s -> {
            System.out.print(s);
            return Integer.parseInt(s);
        });

        System.out.print("Count : ");

        System.out.print(ints.count());

    }
}