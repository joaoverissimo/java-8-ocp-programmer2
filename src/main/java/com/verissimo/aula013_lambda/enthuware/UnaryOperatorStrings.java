package com.verissimo.aula013_lambda.enthuware;

import java.util.function.UnaryOperator;

public class UnaryOperatorStrings {

    public static void main(String[] args) {
        String val1 = "hello";
        String val2 = new String("world");
        UnaryOperator<String> uo1 = s1 -> s1.concat(val1); //1
        UnaryOperator<String> uo2 = s -> s.toUpperCase(); //2
        System.out.println(uo1.apply(uo2.apply(val2))); //3
    }

}
