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
    private static final String PASSWORD19 = "my-password";
    private static final String PASSWORD39 = "my-password";
    private static final String PASSWORD29 = "my-password";
    private static float zeroFloat = 0.0f;

    public String hello(String name) {
        return MESSAGE + name;
    }

    //TODO remove this
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
        System.out.println(checkZero(10));
        System.out.println(checkZero(0));
        String myString = null;

        System.out.println("Equal? " + myString.equals("foo"));                        // Noncompliant; will raise a NPE
        System.out.println("Equal? " + (myString != null && myString.equals("foo")));  // Noncompliant; null check could be removed
    }

    private void callMyService(String mySecret) {
        System.out.println(isValid(mySecret));
    }

    private static boolean checkZero(int a) {
        return zeroFloat == 0 && zeroFloat == a;
    }
}

