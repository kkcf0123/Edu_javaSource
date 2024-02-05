package ch4;

import java.util.Scanner;

public class TvEx {

  public static void main(String[] args) {
    Tv tv = new Tv();

    tv.color = "black";
    tv.channel = 3;
    tv.power = true;

    System.out.println(tv.color);
    System.out.println(tv.channel);
    System.out.println(tv.power);

    tv.channelUp();
    System.out.println(tv.channel);

    Scanner sc = new Scanner(System.in);
    int setChannel = sc.nextInt();
  }
}
