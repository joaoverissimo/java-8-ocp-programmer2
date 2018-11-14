package com.verissimo.aula011_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableListExample {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(7);
        lista.add(9);
        lista.add(2);
        lista.add(5);

        sortList(lista);

        System.out.println(lista);
    }

    public static void sortList(List<? extends Comparable> lista) {
        Collections.sort(lista);
    }
}
