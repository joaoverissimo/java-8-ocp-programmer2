package com.verissimo.aula005_SingletonAndImmutable;

public class SingletonOnDemand {

    private SingletonOnDemand() {
        System.out.println("Contrutor call");
    }

    private static class SingletonHolder {
        private static final SingletonOnDemand INSTANCE = new SingletonOnDemand();
    }

    public static SingletonOnDemand getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        SingletonOnDemand obj = SingletonOnDemand.getInstance();
        System.out.println("obj: " + obj.hashCode());

        SingletonOnDemand obj2 = SingletonOnDemand.getInstance();
        System.out.println("obj2:" + obj2.hashCode());
    }

}
