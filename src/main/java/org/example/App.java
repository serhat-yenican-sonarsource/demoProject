package org.example;


import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.util.StringTokenizer;


public class App {

    public void bug() {
        Thread thread = new Thread();
        thread.run();
    }

    @Override
    protected Object clone() {
        return null;
    }

    public Class vulnerability(Map<String, String> request) throws ClassNotFoundException {
        String name = request.get("name");
        Class clazz = Class.forName(name);
        return clazz;
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

