package com.verissimo.aula012_collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("a");
        queue.add("c");
        queue.add("b");
        queue.add("d");
        System.out.println(queue); //[a, c, b, d]

        //offer: validate capacity restrictions, only add if is possible
        System.out.println(queue.offer("e")); //true
        System.out.println(queue); //[a, c, b, d, e]

        //retrive the item and remove
        System.out.println(queue.poll()); //a
        System.out.println(queue); //[b, c, e, d]

        //retrive the item and don't remove
        System.out.println(queue.peek()); //b
        System.out.println(queue); //[b, c, e, d]

    }

}
