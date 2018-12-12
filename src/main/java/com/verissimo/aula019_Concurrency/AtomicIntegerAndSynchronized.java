package com.verissimo.aula019_Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerAndSynchronized {

    static int nUnSynchronized = 0;
    static int nSynchronized = 0;
    static AtomicInteger nAtomicInteger = new AtomicInteger(0);

    static void addUnSynchronized() {
        nUnSynchronized++;
        System.out.print(nUnSynchronized);
    }

    static synchronized void addSynchronized() {
        nSynchronized++;
        System.out.print(nSynchronized);
    }

    static void addAtomicInteger() {
        System.out.print(nAtomicInteger.incrementAndGet());
    }

    public static void main(String[] args) {

        //UnSynchronized
        ExecutorService service = Executors.newFixedThreadPool(4);
        Runnable rUnSynchronized = () -> addUnSynchronized();
        for (int i = 0; i < 4; i++) {
            service.execute(rUnSynchronized);
        }
        service.shutdown();
        System.out.println("---");
        //output: 2 4 2 3

        //Synchronized
        ExecutorService service2 = Executors.newFixedThreadPool(4);
        Runnable rSynchronized = () -> addSynchronized();
        for (int i = 0; i < 4; i++) {
            service2.execute(rSynchronized);
        }
        service2.shutdown();
        System.out.println("---");
        //output: 1 2 3 4   \o/

        //AtomicInteger
        ExecutorService service3 = Executors.newFixedThreadPool(4);
        Runnable rAtomicInteger = () -> addAtomicInteger();
        for (int i = 0; i < 4; i++) {
            service3.execute(rAtomicInteger);
        }
        service3.shutdown();
        //output: 1 2 3 4   \o/


    }

}
