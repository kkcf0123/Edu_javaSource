package abc.money;

public class Won2Dollar extends Converter {

  // 1 = 0.00075
  @Override
  protected double convert(double src) {
    return src / 1200;
  }

  @Override
  protected String getSrcString() {
    return "원";
    // TODO Auto-generated method stub

  }

  @Override
  protected String getDestString() {
    // TODO Auto-generated method stub
    return "달러";
  }
}
