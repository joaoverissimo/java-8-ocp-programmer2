package com.verissimo.aula012_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {
        //HashMap: list of value, dont store the order
        Set<String> list = new HashSet<>();
        list.add("aaa");
        list.add("zzz");
        list.add("jjj");
        list.add("a");
        System.out.println(list); //[aaa, a, zzz, jjj]

        //LinkedHashSet: list of value, store the order
        Set<String> list2 = new LinkedHashSet<>();
        list2.add("aaa");
        list2.add("zzz");
        list2.add("jjj");
        list2.add("a");
        System.out.println(list2); //[aaa, zzz, jjj, a]

        //Both have only one unique key
        Set<String> list3 = new HashSet<>();
        list3.add("aaa");
        list3.add("zzz");
        list3.add("aaa");
        System.out.println(list3); //[aaa, zzz]
    }
}
