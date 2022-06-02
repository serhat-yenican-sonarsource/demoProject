package org.example;


import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.StringTokenizer; //code smells


public class App {

    public void bug() {
        Thread thread = new Thread();
        thread.run();
    }

    @Override
    protected Object clone() {
        return null; //vulnerability
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

