package lang;

public class ObjectEx {

  public static void main(String[] args) {
    Object obj1 = new Object();
    Object obj2 = new Object();

    if (obj1.equals(obj2)) {
      System.out.println("it's same");
    } else {
      System.out.println("it's diff");
    }

    if (obj1 == obj2) {
      System.out.println("its same");
    } else {
      System.out.println("its diff");
    }

    Value value1 = new Value(10);
    Value value2 = new Value(10);
    if (value1.equals(value2)) {
      System.out.println("it's same");
    } else {
      System.out.println("it's diff");
    }
    if (value1 == value2) {
      System.out.println("its same");
    } else {
      System.out.println("its diff");
    }

    Member member1 = new Member("hong");
    Member member2 = new Member("hong");
    System.out.println(member1.equals(member2) ? "same" : "diff");
    System.out.println(member1 == member2 ? "same" : "diff");
  }
}
