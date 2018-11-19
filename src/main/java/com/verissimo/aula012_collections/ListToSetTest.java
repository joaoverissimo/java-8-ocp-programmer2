package com.verissimo.aula012_collections;

import java.util.*;

public class ListToSetTest {

    public static void main(String[] args) {

        String[] arr = {"a", "b", "c", "d", "e"};

        List<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list); //[a, b, c, d, e]

        list.add("b");
        System.out.println(list); //[a, b, c, d, e, b]

        Set<String> set = new HashSet<>(list);
        System.out.println(set); //[a, b, c, d, e]

        set.add("b");
        System.out.println(set); //[a, b, c, d, e]

        set.addAll(Arrays.asList(arr));
        System.out.println(set); //[a, b, c, d, e]


        //
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.remove(0);
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Test");
        queue.add("x");
        System.out.println(queue);
    }

}
