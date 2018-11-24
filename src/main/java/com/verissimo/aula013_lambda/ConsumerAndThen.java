package com.verissimo.aula013_lambda;

import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerAndThen {

    public static void main(String[] args) {
        Consumer<String> first = t -> System.out.println("First:" + t);
        Consumer<String> second = t -> System.out.println("Second:" + t);

        first.andThen(second).accept("Hi");
        // First:Hi
        // Second:Hi


        Function<String, String> f1 = s -> s.toUpperCase();
        Function<String, String> f2 = s -> s.toLowerCase();
        System.out.println(f1.compose(f2).apply("Compose")); //COMPOSE
        System.out.println(f1.andThen(f2).apply("AndThen")); //andthen
        // compose apply first to f1
        // andThen apply firsto to f2

    }

}
