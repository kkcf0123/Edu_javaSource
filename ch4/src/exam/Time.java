package exam;

public class Time {

  private int hour;
  private int minute;
  private float second;

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    if (hour < 0 || hour > 23) return;
    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    this.minute = minute;
  }

  public float getSecond() {
    return second;
  }

  public void setSecond(float second) {
    this.second = second;
  }
}
