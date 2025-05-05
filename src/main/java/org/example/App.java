package org.example;

public class App {
    private static final String MESSAGE = "Hello";

    private static final String MESSAGE1 =
            "Hello";

    private static final String MESSAGE2 =
            "Hello";

    private static final String secret =
            "my-secret";
    //todo
    private static final String PASSWORD = "my-password";
    private static final String PASSWORD2 = "my-password";
    //todo srt

    private static final String PASSWORD3 = "my-password";

    private static final String PASSWORD5 = "my-password";
    private static final String PASSWORD6 = "my-password";
    private static final String PASSWORD7 = "my-password";
    //todo
    private static final String PASSWORD8 = "my-password";
    private static final String PASSWORD9 = "my-password";
    //todo 23

    public String hello(String name) {
        return MESSAGE + name;
    }

    public static String getMessage() {
        return "";
    }

    public static String getMessage2() {
        return "";
    }

    public static String getPswd() {
        return "" + "asd" + "pswd";
    }

    public boolean isValid(String password) {
        return PASSWORD.equals(password);
    }

    private static final String MY_SECRET = "MyCustomSecret_123";
    private static final String MY_SECRET3= "MyCustomSecret_1223";

    public static void main(String[] args) {
        new App().callMyService(MY_SECRET);
    }



    private void callMyService(String mySecret) {
        System.out.println(isValid(mySecret));
    }
}

