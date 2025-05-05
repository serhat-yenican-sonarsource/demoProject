package org.example;

import java.util.regex.Pattern;

public class CustomSecretRegExpCheck {
  public static void main(String[] args) {
    CustomSecretRegExpCheck checker = new CustomSecretRegExpCheck();
    final String INPUT = "Hello, World!";

    System.out.println("Result: " + checker.isMatchingCustomRegExpExample(INPUT));
  }

  public boolean isMatchingCustomRegExpExample(String input) {
    Pattern pattern = Pattern.compile("CustomRegExpExample.*");
    return pattern.matcher(input).find();
  }
}
