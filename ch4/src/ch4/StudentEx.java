package ch4;

public class StudentEx {

  public static void main(String[] args) {
    Student student = new Student();

    student.id = "123";
    student.name = "hong";
    student.addr = "seoul";
    student.hp = "010-1234-5678";

    System.out.println(student);
    System.out.println(student.id);
    System.out.println(student.name);
    System.out.println(student.addr);
    System.out.println(student.hp);

    Student student2 = new Student();
    student2.id = "456";
    student2.name = "song";
    student2.addr = "seoul2";
    student2.hp = "010-2345-6789";

    System.out.println(student2.id);
    System.out.println(student2.name);
    System.out.println(student2.addr);
    System.out.println(student2.hp);
  }
}
