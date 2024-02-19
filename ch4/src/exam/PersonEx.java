package exam;

public class PersonEx {

  public static void main(String[] args) {
    Person person = new Person();
    person.setName("hong");
    System.out.println(person.getName());
    System.out.println(person);

    Person person2 = new Person();
    person2.setName("song");
    System.out.println(person2.getName());
  }
}
