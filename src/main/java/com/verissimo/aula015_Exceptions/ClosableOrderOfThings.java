package com.verissimo.aula015_Exceptions;

import java.io.IOException;

class Connection implements java.io.Closeable {
    public void close() throws IOException {
        throw new IOException("Close Exception");
    }
}

public class ClosableOrderOfThings {

    public static void main(String[] args) {
        try (Connection c = new Connection()) {
            throw new RuntimeException("RuntimeException");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
