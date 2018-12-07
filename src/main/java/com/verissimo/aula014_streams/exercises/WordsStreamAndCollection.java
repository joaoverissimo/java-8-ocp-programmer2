package com.verissimo.aula014_streams.exercises;

import java.util.Arrays;
import java.util.List;

public class WordsStreamAndCollection {

    public static void main(String[] args) {
        List<String> itens = Arrays.asList("h", "e", "l", "l", "o");
        itens.forEach(System.out::print);
        // hello

        itens.stream().forEach(System.out::print);
        // hello
    }

}
