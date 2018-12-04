package com.verissimo.aula014_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReduceStreams {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        Integer reduce1 = list.stream().reduce((sum, n) -> {
            System.out.println("reduce " + sum + " " + n);
            return sum + n;
        }).get();
        System.out.println("the result of reduce1: " + reduce1);

        // reduce 1 2
        // reduce 3 3
        // reduce 6 4
        // reduce 10 5
        // reduce 15 6
        // reduce 21 7
        // the result of reduce1: 28


        Integer reduce2 = list.stream().reduce(100, (sum, n) -> {
            System.out.println("reduce " + sum + " " + n);
            return sum + n;
        });
        //* dont compile if use .get()
        System.out.println("the result of reduce2: " + reduce2);

        // reduce 100 1
        // reduce 101 2
        // reduce 103 3
        // reduce 106 4
        // reduce 110 5
        // reduce 115 6
        // reduce 121 7
        // the result of reduce2: 128

        Integer reduce3 = Stream.of("Parallel", "streams", "are", "great", "the", "best", "of", "java") //
                .parallel() //
                .reduce(200, //
                        (sum, str) -> {
                            System.out.println("reduce (accumulator) " + sum + " " + str);
                            return sum + str.length();
                        },//
                        (a, b) -> {
                            System.out.println("reduce (combiner) " + a + " " + b);
                            return a + b;
                        });

        System.out.println("the result of reduce3: " + reduce3);

        //reduce (accumulator) 200 best
        //reduce (accumulator) 200 the
        //reduce (combiner) 203 204
        // ** 406

        //reduce (accumulator) 200 java
        //reduce (accumulator) 200 of
        //reduce (combiner) 202 204
        // ** 406

        //reduce (combiner) 407 406
        //** 813

        //reduce (accumulator) 200 are
        //reduce (accumulator) 200 great
        //reduce (accumulator) 200 streams
        //reduce (combiner) 203 205
        // ** 408

        //reduce (accumulator) 200 Parallel
        //reduce (combiner) 208 207
        // ** 415

        //reduce (combiner) 415 408
        // ** 823

        //reduce (combiner) 823 813
        // ** 1.636

        //the result of reduce3: 1636
    }

}
