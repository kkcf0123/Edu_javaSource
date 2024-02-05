import java.util.Arrays;

public class ArrayEx6 {

  public static void main(String[] args) {
    int score[] = { 1, 2, 3, 7, 5, 6, 65, 8, 9, 15 };

    Arrays.sort(score);
    System.out.println(Arrays.toString(score));
    // int min = score[0], max = score[0], sum = score[0];
    // for (int i = 0; i < score.length; i++) {
    //   if (max < score[i]) max = score[i];
    //   if (min > score[i]) max = score[i];
    //   sum += score[i];
    // }
    // System.out.printf("MAX SCORE: %d, MIN SCORE: %d\n", max, min);
    // double avg = sum / (double) score.length;
  }
}
