package com.verissimo.aula005_SingletonAndImmutable;

public class SingletonEager {

    public static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager () {
        System.out.println("constructor");
    }

    public static SingletonEager getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println("line 1");

        SingletonEager obj = SingletonEager.getInstance();
        System.out.println("obj: " + obj.hashCode());

        SingletonEager obj2 = SingletonEager.getInstance();
        System.out.println("obj2:" + obj2.hashCode());
    }

}
