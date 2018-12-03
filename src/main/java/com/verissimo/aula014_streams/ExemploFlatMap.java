package com.verissimo.aula014_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ExemploFlatMap {

    public static void main(String[] args) {
        List<List<List<String>>> lists = new ArrayList<>();
        List<String> n1item1 = Arrays.asList("joao", "diego", "namor");
        List<String> n1item2 = Arrays.asList("pedro", "maria", "jose");

        List<String> n2item1 = Arrays.asList("mouse", "tela", "teclado");

        List<List<String>> fodeu = Arrays.asList(n1item1, n1item2);
        List<List<String>> naofoi = Arrays.asList(n2item1);

        List<List<List<String>>> legal = Arrays.asList(fodeu, naofoi);

        legal.stream() //
                .forEach(System.out::println);

        System.out.println("---------------");

        legal.stream() //
                .flatMap(el -> el.stream()) //
                .forEach(System.out::println);

        System.out.println("---------------");

        legal.stream() //
                .flatMap(el -> el.stream()) //
                .flatMap(el -> el.stream()) //
                .forEach(System.out::println);

        System.out.println("---------------");

//        List<String> strings = Arrays.asList("João", "Diego", "Namor");
//        strings.stream() //
//                .flatMap(el -> el.split("o")) //
//                .forEach(System.out::println);

        OptionalInt total = IntStream.of(1, 2, 3, 4, 5, 6).reduce((sum, n) -> sum + n);
        System.out.println(total.getAsInt());
    }

}
