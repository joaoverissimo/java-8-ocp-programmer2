package com.verissimo.aula012_collections;

import java.util.*;

public class AllowsDuplicate {

    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        arrList.add("teste");
        arrList.add("teste");

        List<String> vector = new Vector<>();
        vector.add("teste");
        vector.add("teste");

        LinkedList<String> linkList = new LinkedList<>();
        linkList.add("teste");
        linkList.add("teste");

        Queue<String> queue = new PriorityQueue<>();
        queue.add("teste");
        queue.add("teste");

        Queue<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("teste");
        arrayDeque.add("teste");


        Set<String> setHash = new HashSet<>();
        setHash.add("teste");
        setHash.add("teste");

        Set<String> setTree = new TreeSet<>();
        setTree.add("teste");
        setTree.add("teste");

        Map<String, String> mapHash = new HashMap<>();
        mapHash.put("teste", null);
        mapHash.put("teste", null);

        Map<String, String> mapLinked = new LinkedHashMap<>();
        mapLinked.put("teste", null);
        mapLinked.put("teste", null);

        Map<String, String> mapTable = new Hashtable<>();
        // mapTable.put("teste", null);
        // Exception in thread "main" java.lang.NullPointerException

        Map<String, String> mapTree = new TreeMap<>();
        mapTree.put("teste", null);
        mapTree.put("teste", null);
    }

}
