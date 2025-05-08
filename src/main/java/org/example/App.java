package org.example;

public class App {
    private static final String MESSAGE = "Hello";

    private static final String MESSAGE1 =
            "Hello";

    private static final String secret =
            "my-secret";
    private static final String PASSWORD = "my-password";
    private static final String PASSWORD2 = "my-password";

    private static final String PASSWORD3 = "my-password";
    private static final String PASSWORD4 = "my-password";
    private static final String PASSWORD5 = "my-password";
    private static final String PASSWORD6 = "my-password";
    private static final String PASSWORD7 = "my-password";
    private static final String PASSWORD8 = "my-password";
    private static final String PASSWORD9 = "my-password";

    public String hello(String name) {
        return MESSAGE + name;
    }

    public static String getMessage() {
        return "";
    }

    public static String getMessage2() {
        return "";
    }

    public boolean isValid(String password) {
        return PASSWORD.equals(password);
    }

    private static final String MY_SECRET = "47828a8dd77ee1eb9dde2d5e93cb221ce8c32b37";

    public static void main(String[] args) {
        new App().callMyService(MY_SECRET);
    }



    private void callMyService(String mySecret) {
        System.out.println(isValid(mySecret));
    }
}

