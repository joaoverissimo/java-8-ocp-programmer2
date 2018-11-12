package com.verissimo.aula009_InnerClass.Exercices;

public class Enthuware_1580 {

    public InnerPeace i = new InnerPeace();

    private class InnerPeace {
        private String reason = "test";
    }

    public void m() {
        System.out.println(i.reason);
    }

    public static void main(String[] args) {
        Enthuware_1580 obj = new Enthuware_1580();
        obj.m();

        Enthuware_1580.InnerPeace obj2 = obj.new InnerPeace();
        System.out.println(obj2.reason);
    }

}
