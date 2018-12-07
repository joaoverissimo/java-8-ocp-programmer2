package com.verissimo.aula014_streams.exercises;

import java.util.stream.Stream;

public class ParallelYetAnotherExecution {

    public static void main(String[] args) {
        Stream.of("a", "b", "c", "d", "e") //
                .parallel() //
                .forEach(System.out::println);

        //cedba
        //cbaed

        double start = System.nanoTime();
        Stream.of("b", "d", "a", "c", "e") //
                .sorted() //
                .filter(s -> {
                    System.out.println("Filter:" + s);
                    return !"d".equals(s);
                }) //
                .parallel() //
                .map(s -> {
                    System.out.println("Map:" + s);
                    return s += s;
                })//
                .forEach(System.out::println);
        double duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(duration + " milliseconds");

        //Filter:c
        //Filter:d
        //Filter:b
        //Map:b
        //Filter:e
        //Map:e
        //ee
        //bb
        //Filter:a
        //Map:a
        //aa
        //Map:c
        //cc
        //7.743608 milliseconds

    }

}
