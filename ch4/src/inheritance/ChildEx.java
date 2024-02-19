package inheritance;

public class ChildEx {

  public static void main(String[] args) {
    //
    Parent parent = new Parent(15);
    Child child = new Child(20);
    Child child2 = new Child(25);
    GrandChild grandChild = new GrandChild(30);

    System.out.println(parent.age);
    System.out.println(child.age);
    System.out.println(child2.age);
    child.play();
  }
}
