package com.verissimo.aula012_collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        Map map = new LinkedHashMap(4, 1f);
        map.put("0001", "a");
        map.put("0002", "b");
        map.put("0003", "c");
        map.get("0003");

        System.out.println(map);
    }

}
