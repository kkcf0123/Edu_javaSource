package poly;

public class Buyer {

  int money = 1000;
  int bonusPoint = 0;

  //   void buy(Tv tv) {
  //     if (money < tv.price) {
  //       System.out.println("give me money");
  //       return;
  //     }
  //     money -= tv.price;
  //     bonusPoint += tv.bonusPoint;
  //     System.out.println("u buy");
  //   }

  void buy(Product p) {
    if (money < p.price) {
      System.out.println("give me money");
      return;
    }
    money -= p.price;
    bonusPoint += p.bonusPoint;
    System.out.println("u buy");
  }
}
