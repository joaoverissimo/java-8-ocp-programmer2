package com.verissimo.aula012_collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest {

    public static void main(String[] args) {
        //Same of HashMap, but sorted by key
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("a", "Letra A");
        map.put("c", "Letra C");
        map.put("b", "Letra B");
        map.put("d", "Letra D");
        System.out.println(map);

        //headMap returns the same of lower; the second paramiter, inclusive, allows equals at floor
        System.out.println(map.headMap("c"));
        System.out.println(map.headMap("c", true));

        // map.pollFirstEntry();
        // map.pollFirstEntry();

        //lfhc
        // map.lowerEntry("c");
        // map.floorEntry("c");
        // map.higherEntry("c");
        // map.ceilingEntry("c");

    }

}
