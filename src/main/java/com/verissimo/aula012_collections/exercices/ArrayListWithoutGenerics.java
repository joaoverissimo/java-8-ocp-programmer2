package com.verissimo.aula012_collections.exercices;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithoutGenerics {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("one");
        list.add("two");
        //list.add(7);

        //for (String s : list) { does not compile
        for (Object s : list) {
            System.out.print(s);
        }
    }

}
