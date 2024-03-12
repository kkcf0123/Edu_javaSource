package generics;

public class BoxEx {

  public static void main(String[] args) {
    Box box = new Box();
    box.setItem(new String("hong"));
    String name = (String) box.getItem();

    box.setItem(Integer.valueOf(10));
    Integer i = (Integer) box.getItem();

    box.setItem(Float.valueOf(3.14F));
    Float f = (Float) box.getItem();

    Box2<String> box2 = new Box2<>();
    box2.setItem("hong");
    box2.setItem("kim");
    String str = box2.getItem();

    Box2<Integer> box3 = new Box2<>();
    Box2<Float> box4 = new Box2<>();
    Box2<Double> box5 = new Box2<>();

    Box3<Fruit> fruitBox = new Box3<>();
    Box3<Apple> appleBox = new Box3<>();
    Box3<Grape> grapeBox = new Box3<>();

    fruitBox.add(new Fruit());
    fruitBox.add(new Apple());
    fruitBox.add(new Grape());
  }
}
