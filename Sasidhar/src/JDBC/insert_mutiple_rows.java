package JDBC;
import java.sql.*;
public class insert_mutiple_rows {
	public static void insertData() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			System.out.println("Connection created "+con);
			// query
			String query = "insert into student values(?,?,?)";
			// PraparedStatement
			PreparedStatement pstmt = con.prepareStatement(query);
			// using setter methods inserting multiple rows at a time
			pstmt.setInt(1, 3);
			pstmt.setString(2, "C");
			pstmt.setString(3, "EEE");
			pstmt.executeUpdate();
			
			pstmt.setInt(1, 4);
			pstmt.setString(2, "D");
			pstmt.setString(3, "MECH");
			pstmt.executeUpdate();
			
			pstmt.setInt(1, 5);
			pstmt.setString(2, "E");
			pstmt.setString(3, "AI&DS");
			pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		insertData();
	}
}
