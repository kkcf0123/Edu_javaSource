package ch4;

public class StudentEx2 {

  public static void main(String[] args) {
    Student2 obj = new Student2("123", "aaaa", "bbb", "123123");

    // student.id = ""; // private
    System.out.println(obj);

    Student2 obj2 = new Student2();
    System.out.println(obj2);

    Student2 obj3 = new Student2("2024", "kim", "seoul3");
    System.out.println(obj3);
  }
}
