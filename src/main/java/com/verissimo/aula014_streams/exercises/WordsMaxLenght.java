package com.verissimo.aula014_streams.exercises;

import java.util.Optional;
import java.util.stream.Stream;

public class WordsMaxLenght {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Kennedy", "Jared", "Ian", "Nolan", "Ashton", "Marshall", "Dustin", "Ryder", "Ower");

        Optional<Integer> max = stream.map(name -> name.length()).max((o1, o2) -> Math.max(o1, o2));

        System.out.println(max.get());
    }

}
