package com.verissimo.aula004_MethodsDefaults;

interface Flyer {
}

class Bird implements Flyer {
}

class Eagle extends Bird {
}

class Bat {
}

public class InstanceOfExample {

    public static void main(String[] args) {
        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat b = new Bat();
        Eagle g = null;

        if (f instanceof Bird) System.out.println("f is a Bird");
        if (e instanceof Flyer) System.out.println("e is a Flyer");
        if (b instanceof Flyer) System.out.println("b is a Flyer");
        if (g instanceof Flyer) System.out.println("g is a Flyer");
    }

}
