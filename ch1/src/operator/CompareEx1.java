package operator;

public class CompareEx1 {

  public static void main(String[] args) {
    int n1 = 10, n2 = 10;
    System.out.println(n1 == n2);
    System.out.println(n1 != n2);
    System.out.println(n1 <= n2);

    char ch1 = 'A', ch2 = 'B';
    System.out.println(ch1 == ch2);
    System.out.println(ch1 != ch2);
    System.out.println(ch1 <= ch2);

    float f1 = 0.1f;
    double d1 = 0.1d;
    System.out.printf("f1 == d1 = %b\n", f1 == d1);
  }
}
