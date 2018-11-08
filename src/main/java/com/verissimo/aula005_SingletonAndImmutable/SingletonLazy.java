package com.verissimo.aula005_SingletonAndImmutable;

public class SingletonLazy {

    private static SingletonLazy INSTANCE;

    private SingletonLazy() {

    }

    public synchronized static SingletonLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonLazy();
        }

        return INSTANCE;
    }

    public void print() {
        System.out.println("print: " + this.hashCode());
    }

    public static void main(String[] args) {
        SingletonLazy obj = SingletonLazy.getInstance();
        obj.print();

        SingletonLazy obj2 = SingletonLazy.getInstance();
        obj2.print();
    }

}
