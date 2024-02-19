package inheritance;

public class Tv {

  private boolean power;
  private int channel;

  public Tv(boolean power, int channel) {
    this.power = power;
    this.channel = channel;
  }

  public Tv() {}

  void power() {
    power = !power;
  }

  void channelUp() {
    channel++;
  }

  void channelDown() {
    channel--;
  }

  public int getChannel() {
    return channel;
  }

  public boolean isPower() {
    return power;
  }
}
