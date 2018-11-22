package com.verissimo.aula012_collections.exercices;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTreeMethods {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        System.out.println(map.put("oranges", 7)); // null
        System.out.println(map.put("apples", 5)); // null
        System.out.println(map.put("lemons", 2)); // null
        System.out.println(map.put("bananas", 7)); // null


        // {apples=5 , bananas=7, lemons=2, oranges=7}
        System.out.println(map);

        // [apples, bananas, lemons, oranges]
        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values(); // [5, 7, 2, 7]
    }

}
