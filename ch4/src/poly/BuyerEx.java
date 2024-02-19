package poly;

public class BuyerEx {

  public static void main(String[] args) {
    Buyer buyer = new Buyer();

    buyer.buy(new Tv(300));
    buyer.buy(new Computer(200));

    System.out.println("남은 돈 : " + buyer.money);
    System.out.println("bonusPoint : " + buyer.bonusPoint);
  }
}
