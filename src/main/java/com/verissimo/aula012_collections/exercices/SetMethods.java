package com.verissimo.aula012_collections.exercices;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMethods {

    public static void main(String[] args) {
        // Creating a HashSet with an initial capacity of 10
        Set<String> set = new HashSet<>(10);
        // add() returns true if the element is not already in the set
        System.out.println(set.add("b")); // true
        System.out.println(set.add("x")); // true
        System.out.println(set.add("h")); // true
        System.out.println(set.add("b")); // false
        System.out.println(set.add(null)); // true
        System.out.println(set.add(null)); // false
        System.out.println(set); // [null, b, x, h]

        System.out.println("------------");

        Set<String> set2 = new TreeSet<>();
        // set2.add(null);   throws npe
        System.out.println(set2.add("b")); // true
        System.out.println(set2.add("x")); // true
        System.out.println(set2.add("h")); // true
        System.out.println(set2.add("b")); // false
        System.out.println(set2); // [b, h, x]
    }

}
