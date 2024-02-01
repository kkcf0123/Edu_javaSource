package condition;

import java.util.Scanner;

public class SwitchEx4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter grade : ");
    int grade = sc.nextInt();

    switch (grade) {
      case 'A':
      case 'a':
        System.out.println("Welcome! ur grade is VIP");
        break;
      case 'B':
      case 'b':
        System.out.println("ur grade is normal");
        break;
      default:
        System.out.println("ur grade is guest");
        break;
    }
  }
}
