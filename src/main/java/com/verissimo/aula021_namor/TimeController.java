package com.verissimo.namor;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimeController {

    private static LocalDateTime startExecutionDate;
    private static LocalDateTime startLastTask;
    private static String task;
    private static LocalDateTime endExecution;
    private static boolean isDebug = true;

    public static void startExecution() {
        startExecutionDate = LocalDateTime.now();
    }

    public static void setDebug(boolean isDebugParam) {
        isDebug = isDebugParam;
    }

    public static void startTask(String strTask) {
        task = strTask;
        startLastTask = LocalDateTime.now();
    }

    public static void endTask() {
        LocalDateTime endLastTask = LocalDateTime.now();
        Long seconds = startLastTask.until(endLastTask, ChronoUnit.MILLIS);

        if (isDebug) {
            System.out.println("Run task " + task + "; executed in " + seconds + " miliseconds");
        }

    }

    public static void endExecution() {
        LocalDateTime endExecutionDate = LocalDateTime.now();
        Long seconds = startExecutionDate.until(endExecutionDate, ChronoUnit.MILLIS);

        if (isDebug) {
            System.out.println("End of execution; executed in " + seconds + " miliseconds");
        }
    }

}
