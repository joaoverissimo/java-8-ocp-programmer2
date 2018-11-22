package com.verissimo.aula012_collections.enthuware;

import java.util.Arrays;
import java.util.Comparator;

class MyStringComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        int s1 = ((String) o1).length();
        int s2 = ((String) o2).length();
        System.out.println("comparing " + o1 + " - " + o2 + " > " + (s1 - s2));
        return s1 - s2;
    }

}

public class ComparatorEx1307 {

    public static void main(String[] args) {
        String[] sa = {"d", "bbb", "aaaa"};
        Arrays.sort(sa, new MyStringComparator());

        for (String s : sa) {
            System.out.println("--" + s);
        }
    }

}
