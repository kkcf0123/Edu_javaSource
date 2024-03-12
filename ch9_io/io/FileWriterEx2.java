package io;

import java.io.InputStream;

public class FileWriterEx2 {

  public static void main(String[] args) {
    try (a) {
      InputStream in = new FileInputStream(new File("c:\\temp\\file1.txt"));
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}
