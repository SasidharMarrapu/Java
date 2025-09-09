package JDBC;

import java.sql.*;

public class updateData {
	public static void update_Data() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			System.out.println("Connection created "+con);
			String query = "update student set sname=? where sno=?";
			// PreparedStatement
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, "nandu");
			pst.setInt(2, 3);
			int i = pst.executeUpdate();
			System.out.println(i+" records updated");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		update_Data();
	}
}
