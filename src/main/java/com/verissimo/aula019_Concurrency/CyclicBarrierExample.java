package com.verissimo.aula019_Concurrency;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample {

    static void checkStep(CyclicBarrier barrier, String step) {
        // Do something to prepare the step
        System.out.println(step + " is ready");
        try {
            // Wait the other threads
            barrier.await();
        } catch (Exception e) { /** ... */}
    }

    public static void main(String[] args) {
        String[] steps = {"Read the recipe", "Gather the ingredients", "Wash hands"};
        System.out.println("Preparing everything:");

        Runnable allSet = () -> System.out.println("Everything's ready. Let's begin.");

        ExecutorService executor = Executors.newFixedThreadPool(steps.length);
        CyclicBarrier barrier = new CyclicBarrier(steps.length, allSet);

        for (String step : steps) {
            executor.submit(() -> checkStep(barrier, step));
        }

        executor.shutdown();
    }
}
