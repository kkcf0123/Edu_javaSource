package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
  static {
    try {
      Class.forName("oracle.jdbc.OracleDriver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  private Connection con;
  private PreparedStatement pstmt;
  private ResultSet rs;

  public Connection getConnection() {
    Connection con = null;

    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "c##test2";
    String password = "test";
    try {
      con = DriverManager.getConnection(url, user, password);
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    //
    return con;
  }

  public void close(Connection con, PreparedStatement pstmt) {
    //
    try {
      if (pstmt != null) pstmt.close();
      if (con != null) con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
    //
    try {
      if (rs != null) rs.close();
      if (pstmt != null) pstmt.close();
      if (con != null) con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // CRUD insert select update delete
  public int insert(BookDTO dto) {
    int result = 0;
    con = getConnection();
    String sql =
      "INSERT INTO BOOKTBL(CODE, TITLE, WRITER, PRICE) VALUES(?, ?, ?, ?)";
    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setInt(1, dto.getCode());
      pstmt.setString(2, dto.getTitle());
      pstmt.setString(3, dto.getWriter());
      pstmt.setInt(4, dto.getPrice());
      result = pstmt.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }
    return result;
  }

  public BookDTO getRow(int code) {
    con = getConnection();
    // String sql = "SELECT * FROM BOOKTBL WHRER CODE = " + code;
    String sql = "SELECT * FROM BOOKTBL WHRER CODE = ?";
    BookDTO dto = null;
    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setInt(1, code);
      rs = pstmt.executeQuery();
      if (rs.next()) {
        // int code1 = rs.getInt("code");
        // String title = rs.getString("title");
        // String writer = rs.getString("writer");
        // int price = rs.getInt("price");

        // dto = new BookDTO();
        // dto.setCode(code1);
        // dto.setTitle(title);
        // dto.setWriter(writer);
        // dto.setPrice(price);

        dto = new BookDTO();
        dto.setCode(rs.getInt("code"));
        dto.setTitle(rs.getString("title"));
        dto.setWriter(rs.getString("writer"));
        dto.setPrice(rs.getInt("price"));
      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    return dto;
  }

  public List<BookDTO> getRows() {
    con = getConnection();
    String sql = "SELECT * FROM BOOKTBL";
    List<BookDTO> list = new ArrayList<>();
    try {
      pstmt = con.prepareStatement(sql);
      rs = pstmt.executeQuery();
      while (rs.next()) {
        BookDTO dto = new BookDTO();
        dto.setCode(rs.getInt("code"));
        dto.setTitle(rs.getString("title"));
        dto.setWriter(rs.getString("writer"));
        dto.setPrice(rs.getInt("price"));
        list.add(dto);
      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    return list;
  }

  public void select() {
    con = getConnection();
    String sql = "SELECT * FROM BOOKTBL";
    try {
      pstmt = con.prepareStatement(sql);
      rs = pstmt.executeQuery();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
  }

  public int update(BookDTO dto) {
    con = getConnection();
    int result = 0;
    String sql = "UPDATE BOOKTBL SET PRICE = ? WHERE CODE = ?";
    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setInt(1, dto.getPrice());
      pstmt.setInt(2, dto.getCode());
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }
    return result;
  }

  public int delete(int code) {
    con = getConnection();
    int result = 0;
    String sql = "DELETE FROM BOOKTBL WHERE CODE = ?";
    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setInt(1, code);
      result = pstmt.executeUpdate();
    } catch (Exception e) {
      // TODO: handle exception
    } finally {
      close(con, pstmt);
    }
    return result;
  }
}
