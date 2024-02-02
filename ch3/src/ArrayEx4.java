import java.util.Arrays;

public class ArrayEx4 {

  public static void main(String[] args) {
    char chArr[] = { 'a', 'b', 'c', 'd', 'e' };
    System.out.println(chArr);

    int intArr[] = { 77, 88, 99, 10, 15 };
    System.out.println(intArr);

    String strArr[] = { "asd", "qwe", "zxc", "fgh" };
    System.out.println(Arrays.toString(strArr));

    int temp[] = new int[intArr.length * 2];
    for (int i = 0; i < intArr.length; i++) {
      temp[i] = intArr[i];
    }

    intArr = temp;
    System.out.println(Arrays.toString(intArr));
  }
}
