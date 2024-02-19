package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookSelect {

  public static void main(String[] args) {
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    // use for select
    try {
      Class.forName("oracle.jdbc.OracleDriver");
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "c##test2";
      String password = "test";
      con = DriverManager.getConnection(url, user, password);
      String sql = "SELECT * FROM BOOKTBL WHERE CODE = 1000";

      pstmt = con.prepareStatement(sql);
      rs = pstmt.executeQuery();
      //   pstmt.executeUpdate();
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
}
