package abc.Tv;

public class IPTV extends ColorTv {

  private String ipAddress;

  //   public IPTV(int size, int color) {
  //     super(size, color);
  //     //TODO Auto-generated constructor stub
  //   }

  public IPTV(int size, int color, String ipAddress) {
    super(size, color);
    this.ipAddress = ipAddress;
  }

  public String getIpAddress() {
    return ipAddress;
  }

  @Override
  public void printProperty() {
    System.out.println(
      getSize() + "size " + getColor() + "color " + ipAddress + "ip"
    );
  }
}
