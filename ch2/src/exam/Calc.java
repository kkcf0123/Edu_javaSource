package exam;

import java.util.Scanner;

public class Calc {

  public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);

    System.out.println("+, -, *, / 중 1개 입력해주세요.: ");
    String str1 = sc1.nextLine();
    System.out.println("u picked" + str1);
    System.out.println("First num : ");
    int num1 = sc1.nextInt();
    System.out.println("Second num : ");
    int num2 = sc1.nextInt();

    switch (str1) {
      case "+":
        result = num1 + num2;
        break;
      case "-":
        result = num1 - num2;
        break;
      case "*":
        result = num1 * num2;
        break;
      case "/":
        result = num1 % num2;
        break;
    }
    System.out.println();
  }
}
