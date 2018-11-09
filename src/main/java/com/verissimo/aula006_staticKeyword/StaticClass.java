package com.verissimo.aula006_staticKeyword;

public class StaticClass {

    private static String outerVar;

    public static class AninhadaNested {
        private String innerVar = outerVar;
    }
}
