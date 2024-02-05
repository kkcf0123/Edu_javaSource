public class ArrayEx11 {

  public static void main(String[] args) {
    // String
    String[] names = { "Kim", "Park", "Choi" };

    for (String str : names) {
      System.out.println(str);
    }
    for (int i = 0; i < names.length; i++) {
      String a = names[i];
      for (int j = 0; j < a.length(); j++) {
        char b = a.charAt(j);
        System.out.printf("str.charAt(%d)", j, b);
      }
    }
    String src = "ABCDE";
    char[] chArr = src.toCharArray();
    System.out.println(chArr);
  }
}
