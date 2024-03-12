package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookDelete {

  public static void main(String[] args) {
    Connection con = null;
    PreparedStatement pstmt = null;

    try {
      Class.forName("oracle.jdbc.OracleDriver");
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "c##test2";
      String password = "test";
      con = DriverManager.getConnection(url, user, password);
      String sql = "DELETE FROM BOOKTBL b WHERE CODE = 1002";

      pstmt = con.prepareStatement(sql);

      int result = pstmt.executeUpdate(sql);
      if (result > 0) {
        System.out.println("success!");
      } else {
        System.out.println("failed!");
      }
      //   pstmt.executeUpdate();
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    } finally {
      try {
        if (pstmt != null) {
          pstmt.close();
        }
        if (con != null) {
          con.close();
        }
      } catch (Exception e) {
        // TODO: handle exception
      }
    }
  }
}
