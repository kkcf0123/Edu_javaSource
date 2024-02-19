package exam;

public class PhysicalInfo {

  private String name;
  private int age;
  private double height;
  private double weight;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age < 0) return;
    this.age = age;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    if (height < 0.0) return;
    this.height = height;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    if (weight < 0.0) return;
    this.weight = weight;
  }

  //method overloading
  void update(int age) {
    this.age = age;
  }

  void update(int age, double height) {
    this.age = age;
    this.height = height;
  }

  void update(int age, double weight, double height) {
    // this.age = age;
    // this.height = height;
    update(age, height);
    this.weight = weight;
  }
}
