package stream;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class StreamEx2 {

  public static void main(String[] args) {
    List<File> list = Arrays.asList(
      new File("Ex1.java"),
      new File("Ex2"),
      new File("Ex3.bak"),
      new File("Ex4.java"),
      new File("Ex5.txt")
    );
  }
}
