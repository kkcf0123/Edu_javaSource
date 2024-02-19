package poly;

public class EmployeeEx {

  public static void main(String[] args) {
    Employee employee = new Employee("hong", "member");
    employee.work();
    work(employee);

    // employee = new Ceo("kim", "CEO");
    // employee.work();

    // employee = new Admin("dong", "ADMIN");
    // employee.work();

    // employee = new PartTime("jeong", "PartTime");
    // employee.work();

    Ceo ceo = new Ceo("kim", "ceo");
    work(ceo);

    Admin admin = new Admin("dong", "ADMIN");
    work(admin);

    PartTime partTime = new PartTime("jeong", "PartTime");
    work(partTime);
    // ---
  }

  public static void work(Employee employee) {
    employee.work();
  }
}
