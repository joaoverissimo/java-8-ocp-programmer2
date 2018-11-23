package com.verissimo.aula012_collections.exercices;

import java.util.TreeSet;

public class TreeSetCeiling {

    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("one");
        tree.add("One");
        tree.add("ONE");

        System.out.println(tree.ceiling("One"));

        System.out.println(tree.ceiling("On"));

        System.out.println(tree.ceiling("O"));

        System.out.println(tree.ceiling("o"));
    }

}
