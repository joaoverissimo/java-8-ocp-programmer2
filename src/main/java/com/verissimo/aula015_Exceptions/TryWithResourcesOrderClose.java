package com.verissimo.aula015_Exceptions;

class Clo implements AutoCloseable {
    private String s;

    public Clo(String s) {
        this.s = s;
    }

    @Override
    public void close() throws RuntimeException {
        System.out.println("closing " + s);
    }
}

public class TryWithResourcesOrderClose {

    public static void main(String[] args) {
        try (Clo c1 = new Clo("c1"); Clo c2 = new Clo("c2")) {
            System.out.println("inner");
        } finally {
            System.out.println("finally");
        }

        // inner
        // closing c2
        // closing c1
        // finally
    }

}
