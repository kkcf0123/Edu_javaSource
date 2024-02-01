package exam;

import java.util.Scanner;

public class Degrees {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("화씨 입력 : ");
    int num = sc.nextInt();

    double c = (num - 32) * 5 / 9.0;
    System.out.printf("%.3f", c);
  }
}
