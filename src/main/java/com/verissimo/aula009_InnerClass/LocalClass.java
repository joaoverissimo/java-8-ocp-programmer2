package com.verissimo.aula009_InnerClass;

public class LocalClass {

    private static int i = 1;

    public static void main(String[] args) {

        int i2 = 1;

        class Local {
            public int sum(int a, int b) {
                return a + b;
            }

            public int sum2() {
                return i + i2;
            }
        }

        Local obj = new Local();
        System.out.println(obj.sum(i, i2));
        System.out.println(obj.sum2());
    }

}
