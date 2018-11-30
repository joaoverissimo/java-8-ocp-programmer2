package com.verissimo.aula013_lambda.estudo.Item004_MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MeuInteiro {
    private Integer i;

    public MeuInteiro(Integer i) {
        this.i = i;
    }
}

public class Ex_01_MethodReference {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("João", "Diego", "Namur");

        List<Integer> integers = Arrays.asList(111, 222, 333);

        // Instance method of an object of a particular type
        strings.stream()//
                .map(s -> s.trim());


        // Static Method
        integers.stream() //
                .map(i -> Long.valueOf(i));

        // Instance method of an existing object
        List<String> newList = new ArrayList<>();
        integers.stream() //
                .map(s -> s.toString() + "str") //
                .forEach(el -> newList.add(el));

        // Constructor
        integers.stream() //
                .map(el -> new MeuInteiro(el));
    }

}
