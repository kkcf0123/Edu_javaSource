package exam;

import java.util.Scanner;

public class Salary {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("월급 : ");
    int salary = sc.nextInt();

    int deposit = salary * 12 * 10;
    System.out.println("10년뒤 : " + deposit);
  }
}
