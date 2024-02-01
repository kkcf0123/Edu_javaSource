package operator;

import java.util.Scanner;

public class ConditionEx2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("entry num : ");
    int num = sc.nextInt();

    if (num < 0) {
      System.out.println("음수");
    } else if (num > 0) {
      System.out.println("양수");
    } else if (num == 0) {
      System.out.println("0");
    }

    System.out.println(num >= 0 ? "양수" : "음수");
    System.out.println(num % 2 == 0);

    char ch1 = 'a';
    // boolean result = ch1 >= 'A'
  }
}
