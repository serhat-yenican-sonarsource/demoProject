package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    private static final String MESSAGE = "Hello";
    private static final String MESSAGE = "Hello";

    public String hello(String name) {
        return MESSAGE + name;
    }

    public String getMessage() {
        return MESSAGE;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Path tempDir = Files.createTempDirectory("clone");
        System.out.println(tempDir);
        ProcessBuilder processBuilder = new ProcessBuilder("ls", "/var");
        processBuilder.environment().put("srt", "/temp");
        Process process = processBuilder
          .redirectErrorStream(true)
          .start();
        process.getInputStream().transferTo(System.out);
        int exitCode = process.waitFor();

        Files.delete(tempDir);
    }


}

