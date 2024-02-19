package abstractclass;

public abstract class Account {

  private String accountNo;

  public void deposit() {}

  public Account() {}

  public Account(String accountNo) {
    this.accountNo = accountNo;
  }

  public abstract void print();
}
