package ch4;

public class Student2 {

  private String id;
  private String name;
  private String addr;
  private String hp;

  void changeAddr() {}

  void changeHp() {}

  Student2() {}

  Student2(String id, String name, String addr, String hp) {
    this.id = id;
    this.name = name;
    this.addr = addr;
    this.hp = hp;
  }

  @Override
  public String toString() {
    return (
      "Student2 [id=" +
      id +
      ", name=" +
      name +
      ", addr=" +
      addr +
      ", hp=" +
      hp +
      "]"
    );
  }

  public Student2(String id, String name, String addr) {
    this.id = id;
    this.name = name;
    this.addr = addr;
  }
}
