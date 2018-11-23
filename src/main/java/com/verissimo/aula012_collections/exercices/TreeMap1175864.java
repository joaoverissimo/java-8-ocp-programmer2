package com.verissimo.aula012_collections.exercices;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap1175864 {

    public static void main(String args[]) {
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("a", "apple");
        map.put("e", "egg");
        map.put("g", "gear");

        SortedMap<String, String> smap = map.subMap("a", "e");
        smap.put("b", "ball");
        map.put("c", "cat");
        // smap.put("f", "fish"); // throws IllegalArgumentException: key out of range
        // the range is: '|- a'  at '-| e', e is exclusive

        map.remove("a");

        System.out.println(smap); //{b=ball, c=cat}
        System.out.print(map); //{b=ball, c=cat, e=egg, g=gear}
    }

}
