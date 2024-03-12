package shop;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {

  // private Customer customers[] = new Customer[5];
  // private Product products[] = new Product[5];
  ArrayList<Customer> customers = new ArrayList<>();
  ArrayList<Product> products = new ArrayList<>();

  private String title;
  private int customerNo;
  // 장바구니
  // CellPhone cellPhone[] = new CellPhone[5];
  // SmartTV smartTV[] = new SmartTV[5];
  // private Product carts[] = new Product[5]; // CellPhone과 SmartTV 둘다 담아야 하기 때문에
  ArrayList<Product> carts = new ArrayList<>();

  Scanner sc = new Scanner(System.in);

  @Override
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public void genUser() {
    // 고객 생성
    Customer customer = new Customer();
    customer.setName("홍길동");
    customer.setPayType(PayType.CARD);
    // customers[0] = customer;
    customers.add(customer);

    customer = new Customer();
    customer.setName("성춘향");
    customer.setPayType(PayType.CASH);
    // customers[1] = customer;
    customers.add(customer);

    customer = new Customer();
    customer.setName("이순신");
    customer.setPayType(PayType.CARD);
    // customers[2] = customer;
    customers.add(customer);

    customer = new Customer();
    customer.setName("정우성");
    customer.setPayType(PayType.CASH);
    // customers[3] = customer;
    customers.add(customer);

    customer = new Customer();
    customer.setName("이정재");
    customer.setPayType(PayType.CARD);
    // customers[4] = customer;
    customers.add(customer);
  }

  @Override
  public void genProduct() {
    // 제품 생성
    CellPhone phone = new CellPhone("갤럭시노트", 500000, "U+");
    // products[0] = phone;
    products.add(phone);

    phone = new CellPhone("Z폴드", 2097000, "SKT");
    // products[1] = phone;
    products.add(phone);

    phone = new CellPhone("아이폰15", 1564000, "KT");
    // products[2] = phone;
    products.add(phone);

    SmartTV tv = new SmartTV("삼성 KQ75", 1821000, "4K");
    // products[3] = tv;
    products.add(tv);

    tv = new SmartTV("LG OLED", 2315000, "Ultra");
    // products[4] = tv;
    products.add(tv);
  }

  @Override
  public void start() {
    System.out.println(title + " : 메인화면 - 계정선택");
    System.out.println("===================================");

    for (int i = 0; i < customers.size(); i++) {
      System.out.printf(
        "[%d] %s(%s)\n",
        i,
        // customers[i].getName(),
        // customers[i].getPayType()
        customers.get(i).getName(),
        customers.get(i).getPayType()
      );
    }
    System.out.println("[x] 종료");

    // 사용자에게 고객 번호 입력받기
    System.out.print("고객 번호 >> ");
    String cNo = sc.nextLine(); // 0~4, x
    System.out.println("\n### " + cNo + " 고객 선택 ###");

    customerNo = Integer.parseInt(cNo);

    if (cNo.equals("x")) {
      System.exit(0);
    } else { // 0~4
      productList();
    }
  }

  public void productList() {
    //상품 목록 출력
    System.out.println("\n");
    System.out.println(title + " : 상품목록 - 상품선택");
    System.out.println("===================================");

    for (int i = 0; i < products.size(); i++) {
      System.out.printf("[%d]", i);
      // products[i].printDetail();
      products.get(i).printDetail();
    }
    System.out.println("[h] 메인 화면");
    System.out.println("[c] 체크 아웃");

    System.out.print("상품 번호 >> ");
    String menu = sc.nextLine(); // 0~4, x

    switch (menu) {
      case "h":
        start();
        break;
      case "c":
        checkOut();
        break;
      default: // 0~4 에 해당하는 제품을 장바구니에 추가
        // for (int i = 0; i < carts.size(); i++) {
        //   if (carts.get(i) == null) {
        // carts[i] = products[Integer.parseInt(menu)];
        carts.add(products.get(Integer.parseInt(menu)));
        productList();
      // System.out.printf(menu, carts);
      // break;
      // }
      // }
    }
  }

  public void checkOut() {
    System.out.println("\n");
    System.out.println(title + " : 체크아웃");
    System.out.println("===================================");

    int i = 0, total = 0;
    for (Product product : carts) {
      if (product != null) {
        System.out.printf(
          "[%d] %s %d\n",
          i++,
          product.getPname(),
          product.getPrice()
        );
        total += product.getPrice();
      }
    }
    System.out.println("===================================");
    System.out.println("합계 : " + total);
    // System.out.println("결제방법 : " + customers[customerNo].getPayType());
    System.out.println("결제방법 : " + customers.get(customerNo).getPayType());
    System.out.println("[p] 이전");
    System.out.println("[q] 결제");
    String menu = sc.nextLine();

    switch (menu) {
      case "p":
        productList();
        break;
      case "q":
        System.out.println("결제가 완료 되었습니다. 종료합니다.");
        System.exit(0);
        break;
      default:
        break;
    }
  }
}
