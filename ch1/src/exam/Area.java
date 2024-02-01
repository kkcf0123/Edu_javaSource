package exam;

public class Area {

  public static void main(String[] args) {
    int top = 7, bottom = 10, hight = 3;
    double width = (double) (top + bottom) * hight / 2.0;

    System.out.printf("result: %.2f", width);
  }
}
