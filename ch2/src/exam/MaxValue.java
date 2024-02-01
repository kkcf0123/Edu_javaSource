package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxValue {

  public static void main(String[] args) {
    // ArrayList<Integer> comparingNum = new ArrayList<Integer>();

    Scanner sc1 = new Scanner(System.in);
    System.out.println("enter number 1 : ");
    int num1 = sc1.nextInt();
    // comparingNum.add(num1);

    Scanner sc2 = new Scanner(System.in);
    System.out.println("enter number 2 : ");
    int num2 = sc2.nextInt();
    // comparingNum.add(num2);

    Scanner sc3 = new Scanner(System.in);
    System.out.println("enter number 3 : ");
    int num3 = sc3.nextInt();
    // comparingNum.add(num3);

    int max = num1;
    if (max < num2) {
      max = num2;
    }
    if (max < num3) {
      max = num3;
    }
    System.out.println(max);

    int min = num1;
    if (min > num3) {
      min = num3;
    }
    if (min > num2) {
      min = num2;
    }
    System.out.println(min);
  }
}
