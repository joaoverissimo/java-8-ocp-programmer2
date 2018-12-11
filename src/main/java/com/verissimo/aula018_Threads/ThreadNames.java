package com.verissimo.aula018_Threads;

public class ThreadNames implements Runnable {

    public static void main(String[] args) {
        ThreadNames a1 = new ThreadNames();
        Thread t = new Thread(a1);
        t.setName("a1");
        t.start();
        System.out.print(Thread.currentThread().getName() + " ");
        try {
            t.join();
        } catch (Exception e) {
        }
        System.out.print(Thread.currentThread().getName());
    }

    public void run() {
        System.out.print(Thread.currentThread().getName() + " ");
    }

}
