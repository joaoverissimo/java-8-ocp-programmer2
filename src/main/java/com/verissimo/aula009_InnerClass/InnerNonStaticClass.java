package com.verissimo.aula009_InnerClass;

public class InnerNonStaticClass {

    private int i = 0;

    public class in {
        public int i2 = 1;
    }

    public static void main(String[] args) {
        InnerNonStaticClass obj = new InnerNonStaticClass();
        InnerNonStaticClass.in obj2 = obj.new in();

        System.out.println("out: " + obj.i + " " + obj2.i2);
    }

}
