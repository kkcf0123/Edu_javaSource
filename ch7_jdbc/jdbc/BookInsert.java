package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookInsert {

  public static void main(String[] args) {
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null; // use for select

    try {
      Class.forName("oracle.jdbc.OracleDriver");
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "c##test2";
      String password = "test";
      con = DriverManager.getConnection(url, user, password);
      String sql =
        "INSERT INTO BOOKTBL(CODE, TITLE, WRITER, PRICE) VALUES(1000, 'JAVA PROGRAMMING NOOBS', 'PARK', 28500)";
      pstmt = con.prepareStatement(sql);
      int result = pstmt.executeQuery();

      if (result > 0) {
        System.out.println("success!");
      } else {
        System.out.println("failed!");
      }
      //   pstmt.executeUpdate();
    } catch (ClassNotFoundException | SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      try {
        if (pstmt != null) {
          pstmt.close();
        }
        // important
        if (con != null) {
          con.close();
        }
      } catch (Exception e) {
        // TODO: handle exception
      }
    }
  }
}
