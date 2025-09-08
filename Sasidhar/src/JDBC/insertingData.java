package JDBC;
import java.sql.*;
public class insertingData {
	public static void insert() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			System.out.println("Connection created "+con);
			//Query
			String query1 = "insert into student values(1,'A','CSE')";
			String query2 = "insert into student values(2,'B','ECE')";
			//Statement
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(query1);
			System.out.println("i value: "+i);
			int j = stmt.executeUpdate(query2);
			System.out.println(j+" rows created");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		insert();
	}
}
