package com.verissimo.aula018_Threads;

public class TestClassThread extends Thread {

    public void run() {
        for (; ; ) ;
    }

    public static void main(String args[]) {
        System.out.println("Starting Main");
        new TestClassThread().start();
        System.out.println("Main returns");

        // output:
        // Starting Main
        // Main returns
        // --> and never ends
    }

}
