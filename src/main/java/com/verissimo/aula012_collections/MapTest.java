package com.verissimo.aula012_collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        //HashMap: key/value dont store the order
        Map<String, Integer> list = new HashMap<>();
        list.put("aaa", 1);
        list.put("zzz", 2);
        list.put("jjj", 3);
        list.put("a", 4);
        System.out.println(list); //{aaa=1, a=4, zzz=2, jjj=3}

        //LinkedHashMap: key/value, store the order
        Map<String, Integer> list2 = new LinkedHashMap<>();
        list2.put("aaa", 1);
        list2.put("zzz", 2);
        list2.put("jjj", 3);
        list2.put("a", 4);
        System.out.println(list2); //{aaa=1, zzz=2, jjj=3, a=4}

        //Both have only one unique key
        Map<String, Integer> list3 = new HashMap<>();
        list3.put("aaa", 1);
        list3.put("zzz", 2);
        list3.put("aaa", 33);
        System.out.println(list3); //{aaa=33, zzz=2}

        //for (String str : list.keySet()) {
        //    list.remove(str); //java.util.ConcurrentModificationException use entrySet loop
        //}

    }

}
