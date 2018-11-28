package com.verissimo.aula013_lambda.enthuware;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionAndConsumer {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("a", "aa", "aaa");
        Function<String, Integer> f = x -> x.length();
        Consumer<Integer> c = x -> System.out.print("Len:" + x + " ");
        strList.stream().map(f).forEach(c);

        //Len:1 Len:2 Len:3
    }

}
