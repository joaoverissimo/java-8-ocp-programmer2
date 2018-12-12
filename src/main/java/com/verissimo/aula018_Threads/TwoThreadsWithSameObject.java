package com.verissimo.aula018_Threads;

public class TwoThreadsWithSameObject implements Runnable {

    int x = 0, y = 0;

    public void run() {
        while (true) {
            x++;
            y++;
            System.out.println(" x = " + x + " , y = " + y);
        }
    }

    public static void main(String[] args) {
        TwoThreadsWithSameObject tc = new TwoThreadsWithSameObject();
        new Thread(tc).start();
        new Thread(tc).start();
    }

}
