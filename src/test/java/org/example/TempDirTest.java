package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Path;

class TempDirTest {
  @Test
  void testTempDir(@TempDir Path tmpdir) {
    System.out.println("@TempDir : " + tmpdir);
    System.out.println("java.io.tmpdir : " + System.getProperty("java.io.tmpdir"));

    Path actual = tmpdir.getParent().toAbsolutePath();
    Path expected = Path.of(System.getProperty("java.io.tmpdir"));

    Assertions.assertEquals(expected, actual);
  }
}
