package ch4;

public class CarEx {

  public static void main(String[] args) {
    Car car = new Car();

    car.brand = "Hyundai";
    car.model = "sonata";
    car.maxSpeed = 180;
    car.forward();

    Car car2 = new Car();
    car2.brand = "Hyundai";
    car2.model = "avante";
    car2.maxSpeed = 190;
    car2.backward();

    System.out.println(car.brand);
    System.out.println(car.model);
    System.out.println(car.maxSpeed);
  }
}
