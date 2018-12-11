package com.verissimo.aula018_Threads;

public class TestClassInnerRunner implements Runnable {
    class Runner implements Runnable {
        public void run() {
            Thread[] t = new Thread[5];
            for (int i = 0; i < t.length; i++) System.out.println(t[i]);
        }
    }

    public static void main(String args[]) throws Exception {
        TestClassInnerRunner tc = new TestClassInnerRunner();
        new Thread(tc.new Runner()).start();
    }

    @Override
    public void run() {

    }
}
