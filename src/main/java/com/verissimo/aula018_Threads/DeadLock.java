package com.verissimo.aula018_Threads;

public class DeadLock extends Thread {
    static Object obj1 = new Object();
    static Object obj2 = new Object();

    public void m1() {
        synchronized (obj1) {
            System.out.print("1 ");
            synchronized (obj2) {
                System.out.println("2");
            }
        }
    }

    public void m2() {
        synchronized (obj2) {
            System.out.print("2 ");
            synchronized (obj1) {
                System.out.println("1");
            }
        }
    }

    public void run() {
        m1();
        m2();
    }

    public static void main(String[] args) {
        new DeadLock().start();
        new DeadLock().start();
        // can DeadLock
    }

}
