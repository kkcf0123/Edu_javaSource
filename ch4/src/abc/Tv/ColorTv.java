package abc.Tv;

public class ColorTv extends Tv {

  private int color;

  public ColorTv(int size, int color) {
    super(size);
    this.color = color;
  }

  protected int getColor() {
    return color;
  }

  public void printProperty() {
    System.out.println(getSize() + "inch  " + color + "color");
  }
}
