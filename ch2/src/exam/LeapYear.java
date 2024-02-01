package exam;

import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("원하는 년도를 입력하라우: ");
    int year = sc.nextInt();

    if (year % 4 == 0) {
      System.out.println("윤년0");
    } else if (year % 100 != 0) {
      System.out.println("윤년1");
    } else if (year % 400 == 0) {
      System.out.println("윤년3");
    } else {
      System.out.println("평년");
    }
  }
}
