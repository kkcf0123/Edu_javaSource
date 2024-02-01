package exam;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PayOfHours {

  public static void main(String[] args) {
    DecimalFormat decFormat = new DecimalFormat("###,###");
    Scanner sc = new Scanner(System.in);
    int limitWorkTime = 8;
    int payOfHours = 9800;

    System.out.println("얼마나 일했음? : ");
    int workTime = sc.nextInt();

    // int result = limitWorkTime - workTime;

    if (workTime > limitWorkTime) {
      double totalPay = workTime * (payOfHours * 1.05);
      System.out.println(
        "넌 이정도 받을 자격있어.  " +
        decFormat.format(Math.abs(Math.round(totalPay))) +
        "원"
      );
    } else if (workTime <= limitWorkTime) {
      double totalPay = workTime * payOfHours;
      System.out.println(
        "오늘은 이정도네.  " +
        decFormat.format(Math.abs(Math.round(totalPay))) +
        "원"
      );
    }
  }
}
