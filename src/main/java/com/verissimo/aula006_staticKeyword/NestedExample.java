package com.verissimo.aula006_staticKeyword;

public class NestedExample {

    private static int test;

    static {test++;}

    private static class InnerClass {
        private InnerClass() {
            test++;
        }
    }

    public static void main(String[] args) {
        InnerClass obj = new InnerClass();
        System.out.println(test);
    }

}
