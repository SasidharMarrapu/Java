package JDBC;

import java.sql.*;

public class deleteData {
	public static void delete_Data() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			System.out.println("Connection created "+con);
			String query = "delete from student where sno=?";
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, 2);
			int i = pst.executeUpdate();
			System.out.println(i+" Records deleted");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		delete_Data();
	}
}
