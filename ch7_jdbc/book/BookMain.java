package book;

import java.util.List;
import java.util.Scanner;

public class BookMain {

  public static void main(String[] args) {
    //

    Scanner sc = new Scanner(System.in);
    boolean run = true;

    BookDAO dao = new BookDAO();

    while (run) {
      System.out.println("========================================");
      System.out.println("1. 특정 조회 ");
      System.out.println("2. 전체 조회 ");
      System.out.println("3. 등록 ");
      System.out.println("4. 수정 ");
      System.out.println("5. 삭제 ");
      System.out.println("6. 종료 ");
      System.out.println("========================================");

      System.out.println("menu : ");
      int menu = Integer.parseInt(sc.nextLine());
      if (menu == 1) {
        System.out.println("enter code : ");
        int code = Integer.parseInt(sc.nextLine());
        BookDTO dto = dao.getRow(code);
        System.out.println(dto);
        break;
      } else if (menu == 2) {
        List<BookDTO> list = dao.getRows();
        for (BookDTO bookDTO : list) {
          System.out.println(bookDTO);
        }
        break;
      } else if (menu == 3) {
        System.out.println("enter code : ");
        int newCode = Integer.parseInt(sc.nextLine());
        System.out.println("enter title : ");
        String newTitle = sc.nextLine();
        System.out.println("enter writer : ");
        String newWriter = sc.nextLine();
        System.out.println(("enter price : "));
        int newPrice = Integer.parseInt(sc.nextLine());

        BookDTO inserDto = new BookDTO(newCode, newTitle, newWriter, newPrice);
        int result = dao.insert(inserDto);
        System.out.println(result > 0 ? "success!" : "failed!");

        break;
      } else if (menu == 4) {
        //
        System.out.println("code : ");
        int updateCode = Integer.parseInt(sc.nextLine());
        System.out.println("price : ");
        int updatePrice = Integer.parseInt(sc.nextLine());

        BookDTO updateDto = new BookDTO();
        updateDto.setCode(updateCode);
        updateDto.setPrice(updatePrice);
        System.out.println(dao.update(updateDto) > 0 ? "success!" : "failed!");
      } else if (menu == 5) {
        System.out.println("code : ");
        int deleteCode = Integer.parseInt(sc.nextLine());

        System.out.println(dao.delete(deleteCode) > 0 ? "success!" : "failed!");
        //
      } else if (menu == 6) {
        //
        run = false;
      } else {
        System.out.println("u wrong!");
        run = false;
      }

      switch (menu) {
        case 1:
          break;
        default:
          break;
      }
    }
  }
}
