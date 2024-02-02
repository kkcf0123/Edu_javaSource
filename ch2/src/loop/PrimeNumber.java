package loop;

public class PrimeNumber {

  public static void main(String[] args) {
    int count = 0, total = 0;
    for (int i = 2; i < 101; i++) {
      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          System.out.println("before count " + count);
          count++; // 증가함수
          System.out.println("after count " + count);
          // 해당 조건이 만족할 경우 다음 수를 찾는 과정
          // 만약 이 조건에 불합한다면,
          // 아래 count가 2인 경우를 체크

        }
      }
      if (count == 2) {
        System.out.printf(i + "\t\n");
        total++;
      }
      count = 0;
      // 초기화하는 이유는 다음 수를 찾을 때,
      // 이 전에 사용했던 값이 남기 때문
    }
  }
}
