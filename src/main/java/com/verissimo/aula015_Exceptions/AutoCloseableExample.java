package com.verissimo.aula015_Exceptions;

class DbConection implements AutoCloseable {
    @Override
    public void close() throws RuntimeException {
        System.out.println("closed");
    }

    public void throwException() throws RuntimeException {
        throw new RuntimeException("throw here");
    }
}

public class AutoCloseableExample {

    public static void main(String[] args) {
        try (DbConection db = new DbConection();) {
            db.throwException();
        } catch (Exception ex) {
            System.out.println("exception: " + ex.getMessage());
        }

        // closed
        // exception: throw here

    }

}
