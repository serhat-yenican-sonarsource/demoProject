package org.example;

public class App {
    private static final String MESSAGE = "Hello";

    public String hello(String name) {
        return MESSAGE + name;
    }

    public String getMessage() {
        return MESSAGE;
    }

    public static void main(String[] args) {
        System.out.println(new App().hello(null));
    }
}

