package com.verissimo.aula012_collections.exercices;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMethods {

    public static void main(String[] args) {
        ArrayDeque<String> fifo = new ArrayDeque<>();
        fifo.offer("a");
        fifo.offer("b");
        fifo.offer("c");
        fifo.offer("d");
        fifo.offer("e");
        fifo.poll();
        fifo.poll();

        ArrayDeque<String> lifo = new ArrayDeque<>();
        lifo.push("a");
        lifo.push("b");
        lifo.push("c");
        lifo.push("d");
        lifo.push("e");
        lifo.pop();
        lifo.pop();

        Queue<String> queue = new ArrayDeque<>();
        System.out.println(queue.offer("a")); // true [a]
        System.out.println(queue.offer("b")); // true [a, b]
        System.out.println(queue.peek()); // a [a, b]
        System.out.println(queue.poll()); // a [b]
        System.out.println(queue.peek()); // b [b]
        System.out.println(queue.poll()); // b []
        System.out.println(queue.peek()); // null

        System.out.println("-----------");

        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("a"); // [a]
        stack.push("b"); // [b, a]
        System.out.println(stack.peek()); // b [b, a]
        System.out.println(stack.pop()); // b [a]
        System.out.println(stack.peek()); // a [a]
        System.out.println(stack.pop()); // a []
        System.out.println(stack.peek()); // null
        //stack.pop(); // throws NoSuchElementException

    }

}
