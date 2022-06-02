package org.example;


import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.StringTokenizer;

public class App {
    private static final String MESSAGE = "Hello";
    private static final String APP_SECRET = "secret";

    public String hello(String name) {
        return MESSAGE + name;
    }

    public static String getAppSecret() {
        return APP_SECRET;
    }

    //TODO open this part later
//  private void doSomething() {
//    System.out.println(System.currentTimeMillis());
//  }


    public void verifyEmail(String email) throws Exception {
        if(email == null) {
            System.out.println("email is null");
        }
        if(!email.contains("@")) {
            throw new Exception("invalid email");
        }
    }

    public PasswordAuthentication hotSpotExample() throws SQLException {
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
          "user=steve&password=blue"); // Sensitive
        String uname = "steve";
        String password = "blue";
        conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
          "user=" + uname + "&password=" + password); // Sensitive

        return new java.net.PasswordAuthentication("userName", "1234".toCharArray());  // Sensitive
    }

}

