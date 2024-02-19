package abc.oddDia;

public abstract class OddDetector {

  private int n;

  public OddDetector(int n) {
    this.n = n;
  }

  public int getN() {
    return n;
  }

  public abstract boolean isOdd();
}
