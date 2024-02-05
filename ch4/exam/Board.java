package exam;

import java.time.LocalDateTime;

public class Board {

  private int bno;
  private String title;
  private String content;
  private String writer;
  private LocalDateTime regDate;
  private LocalDateTime lastModyDate;

  public Board() {}

  public Board(
    int bno,
    String title,
    String content,
    String writer,
    LocalDateTime regDate,
    LocalDateTime lastModyDate
  ) {
    this.bno = bno;
    this.title = title;
    this.content = content;
    this.writer = writer;
    this.regDate = regDate;
    this.lastModyDate = lastModyDate;
  }
}
