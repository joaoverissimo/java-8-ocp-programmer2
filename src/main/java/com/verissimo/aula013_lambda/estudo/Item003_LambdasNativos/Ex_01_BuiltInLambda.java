package com.verissimo.aula013_lambda.estudo.Item003_LambdasNativos;

import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface MinhaStringRetornaLong {
    Long converter(String s);
}

@FunctionalInterface
interface MinhasDuasStringsRetornamLong {
    Long converter(String s1, String s2);

    default String obterStrDefault() {
        return "retorno default";
    }
}

public class Ex_01_BuiltInLambda {

    public static void main(String[] args) {
        MinhaStringRetornaLong obj1 = (s) -> Long.valueOf(s) * 100L;
        Long retorno1 = obj1.converter("5");
        System.out.println(retorno1);

        Function<String, Long> obj3 = (s) -> Long.valueOf(s) * 100L;
        Long retorno3 = obj3.apply("5");
        System.out.println(retorno3);

        MinhasDuasStringsRetornamLong obj2 = (s1, s2) -> 33L;
        Long retorno2 = obj2.converter("a", "b");
        System.out.println(retorno2);

        BiFunction<String, String, Long> obj4 = (s1, s2) -> 33L;
        Long retorno4 = obj4.apply("a", "b");
        System.out.println(retorno4);
    }

}
