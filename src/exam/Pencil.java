package exam;

public class Pencil {

  public static void main(String[] args) {
    int student = 30, pencil = 534;
    int disturb = pencil / student;
    int nokori = pencil % student;

    System.out.println(
      "총 " + disturb + "명에게 1명당 " + nokori + "개를 가질 수 있da"
    );
  }
}
