package JDBC;

import java.sql.*;

public class ResultSet_Ex {
	static Connection con = null;
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			System.out.println("Connection created "+con);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void getData() {
		String query = "select * from student";
		ResultSet rs = null;
		try {
			PreparedStatement pst = con.prepareStatement(query);
			rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println("Sno: "+rs.getInt(1));
				System.out.println("Sname: "+rs.getString(2));
				System.out.println("Stream: "+rs.getString(3));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		getData();
	}
}
