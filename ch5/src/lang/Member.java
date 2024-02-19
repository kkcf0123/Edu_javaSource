package lang;

public class Member {

  String id;

  public Member(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Member) {
      Member m = (Member) obj;
      //   Value v = (Value) obj;
      if (this.id == m.id) {
        return true;
      }
    }
    return false;
  }
}
