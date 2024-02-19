package abc.calc;

import java.util.Scanner;

public class CalcEx {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input num1 : ");
    int num1 = Integer.parseInt(sc.nextLine());
    System.out.println("input num2 : ");
    int num2 = Integer.parseInt(sc.nextLine());
    System.out.println("input op : ");
    String op = sc.nextLine();

    Calc calc = null;

    if (op.equals("+")) {
      calc = new Add();
    } else if (op.equals("-")) {
      calc = new Sub();
    } else if (op.equals("*")) {
      calc = new Mul();
    } else if (op.equals("/")) {
      calc = new Div();
    } else {
      System.out.println(" u wrong ");
    }
    calc.setValue(num1, num2);
    System.out.println(calc.calulate());
  }
}
