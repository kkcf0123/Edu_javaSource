package book;

public class BookDTO {

  //
  private int code;
  private String title;
  private String writer;
  private int price;

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public BookDTO(int code, String title, String writer, int price) {
    this.code = code;
    this.title = title;
    this.writer = writer;
    this.price = price;
  }

  public BookDTO() {
    //TODO Auto-generated constructor stub
  }
}
