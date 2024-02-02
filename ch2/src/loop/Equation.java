package loop;

public class Equation {

  public static void main(String[] args) {
    for (int x = 1; x < 11; x++) {
      for (int y = 1; y < 11; y++) {
        System.out.printf("(%d, %d)\n", x, y);
      }
    }
  }
}
