package operator;

public class LogicalEx1 {

  public static void main(String[] args) {
    int x = 13;
    System.out.println(x > 10 && x < 20);

    int charCode = 'A';

    if ((charCode >= 65) && (charCode <= 90)) {
      System.out.println("Upper");
    }

    char charCode2 = 'a';
    System.out.println(charCode2 >= 'a' && charCode2 <= 'z');
    if ((charCode2 >= 'a') && (charCode2 <= 'z')) {
      System.out.println("lower");
    }

    int i = 6;
    System.out.println(i % 2 == 0 || i % 3 == 0);

    System.out.println(i % 2 == 0 || i % 3 == 0 && i % 6 != 0);
  }
}
