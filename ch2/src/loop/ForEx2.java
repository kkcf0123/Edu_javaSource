package loop;

public class ForEx2 {

  public static void main(String[] args) {
    // for (int i = 1; i <= 5; i++) {
    //   for (int j = 1; j <= 10; j++) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    for (int i = 1; i <= 100; i += 2) {
      for (int j = 99; j > i; j -= 2) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.printf("*");
      }
      System.out.println();
    }

    for (int i = 1; i <= 100; i += 2) {
      for (int j = 0; j < i; j += 2) {
        System.out.print(" ");
      }

      for (int j = 98; j > i; j--) {
        System.out.printf("*");
      }
      System.out.println();
    }
    // for (int x = 1; x <= 10; x++) {
    //   for (int z = x; z <= 10; z++) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }
  }
}
