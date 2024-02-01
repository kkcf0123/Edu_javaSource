package condition;

import java.util.Random;
import java.util.Scanner;

public class SwitchEx3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int usr = sc.nextInt();
    Random random = new Random(2);
    int com = 0;

    switch (com - usr) {
      case 1:
      case -2:
        System.out.println("u lose");
        break;
      case -1:
      case 2:
        System.out.println("u win");
        break;
      case 0:
        System.out.println("DRAW");
        break;
    }
    if (com > usr) {
      System.out.println("u lose");
    } else if (com == usr) {
      System.out.println("draw");
    } else if (com < usr) {
      System.out.println("u win");
    }
  }
}
