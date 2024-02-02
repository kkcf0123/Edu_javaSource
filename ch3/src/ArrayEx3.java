public class ArrayEx3 {

  public static void main(String[] args) {
    int score[] = new int[] { 98, 97, 96, 95, 94, 93 };
    int score2[] = { 98, 88, 78, 68, 58 };
    int score3[][] = { { 78, 98 }, { 88, 68 } };

    for (int i = 0; i < score3.length; i++) {
      for (int j = 0; j < score3[i].length; j++) {
        System.out.println(score3[i][j] + "\t");
      }
      System.out.println();
    }

    for (int[] arr : score3) {
      for (int num : arr) {
        System.out.println(num + "\t");
      }
    }
  }
}
