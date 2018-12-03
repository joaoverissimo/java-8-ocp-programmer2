package com.verissimo.aula014_streams;

import java.util.stream.Stream;

public class ParallelStreamAB {

    public static void main(String[] args) {
        String str = Stream.of("A", "B") //
                .parallel() //
                .reduce("_", (in, el) -> el + in);

        System.out.println(str);
        // _A_B or _AB
    }

}
