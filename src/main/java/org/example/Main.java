package org.example;

import java.io.IOException;
import java.nio.file.Files;

public class Main {
  public static void main(String[] args) throws IOException {
    System.out.println("createTempDirectory : " + Files.createTempDirectory("prefix").getParent());
    System.out.println("java.io.tmpdir : " + System.getProperty("java.io.tmpdir"));
  }
}
