package com.verissimo.aula012_collections;

import java.util.*;

public class CanBeNull {

    public static void main(String[] args) {
        System.out.println(Integer.valueOf(null) + Integer.valueOf(6));

        List<String> arrList = new ArrayList<>();
        arrList.add(null);
        System.out.println(arrList);
        // [null]

        List<String> vector = new Vector<>();
        vector.add(null);
        System.out.println(vector);
        // [null]

        LinkedList<String> linkList = new LinkedList<>();
        linkList.add(null);
        System.out.println(linkList);
        // [null]

        Queue<String> queue = new PriorityQueue<>();
        //queue.add(null);
        //System.out.println(queue);
        //Exception in thread "main" java.lang.NullPointerException

        Queue<String> arrayDeque = new ArrayDeque<>();
        //arrayDeque.add(null);
        //System.out.println(arrayDeque);
        //Exception in thread "main" java.lang.NullPointerException


        Set<String> setHash = new HashSet<>();
        String s = null;
        setHash.add(s);
        setHash.add(s);
        System.out.println("HashSet: " + setHash);
        // [null]

        Set<String> setTree = new TreeSet<>();
        //setTree.add(null);
        //System.out.println(setTree);
        //Exception in thread "main" java.lang.NullPointerException

        Map<String, String> mapHash = new HashMap<>();
        mapHash.put(null, null);
        System.out.println(mapHash);
        //{null=null}

        Map<String, String> mapLinked = new LinkedHashMap<>();
        mapLinked.put(null, null);
        System.out.println(mapLinked);
        //{null=null}

        Map<String, String> mapTable = new Hashtable<>();
        //mapTable.put(null, null);
        //System.out.println(mapTable);
        //Exception in thread "main" java.lang.NullPointerException

        Map<String, String> mapTree = new TreeMap<>();
        //mapTree.put(null, null);
        //System.out.println(mapTable);
        //Exception in thread "main" java.lang.NullPointerException
    }

}
