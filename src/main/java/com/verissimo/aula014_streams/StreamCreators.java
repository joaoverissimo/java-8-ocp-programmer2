package com.verissimo.aula014_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreators {

    public static void main(String[] args) {
        // Collection
        List<String> words = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao"});
        Stream<String> stream = words.stream();
        stream.forEach(System.out::println);

        // Stream.Of
        Stream<String> streamOf = Stream.of("hello", "hola", "hallo", "ciao");
        streamOf.forEach(System.out::println);

        // Stream.Of Array
        String[] wordsArr = {"hello", "hola", "hallo", "ciao"};
        Stream<String> streamArr = Stream.of(wordsArr);
        streamArr.forEach(System.out::println);

        // Stream.of Array primitive (*)
        int[] nums = {1, 2, 3, 4, 5};
        Stream.of(nums).forEach(System.out::println);
        // * the stream make just on item ie: [I@3b9a45b3

        // Generate (Supplier)
        Stream<Double> streamGenerate = Stream.generate(() -> Math.random()).limit(5);
        streamGenerate.forEach(System.out::println);
        // 0.004784806492941218 0.8603730991601239 0.8664162881085398 0.6902823770448862 0.33261745027414535

        // Iterate (Start Value, UnaryFunction)
        Stream<Integer> streamIterate = Stream.iterate(1, t -> t * 2).limit(5);
        // 1, 2, 4, 8, 16

        Stream.Builder<String> builder = Stream.<String>builder().add("h").add("e").add("l").add("l");
        builder.accept("o");
        Stream<String> streamBuilder = builder.build();
        streamBuilder.forEach(System.out::print);
        // hello
    }

}
