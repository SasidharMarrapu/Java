package JDBC;

import java.sql.*;
import java.util.*;

public class insertRows_using_forLoop {
	public static void insertRows() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			System.out.println("Connection craeted "+con);
			// Query
			String query = "insert into student values(?,?,?)";
			// PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			int id=0;
			String name="";
			String stream="";
			for(int i=1; i<4;i++) {
				System.out.println("Enter id:");
				id=sc.nextInt();
				System.out.println("Enter name:");
				name = sc.next();
				System.out.println("Enter stream:");
				stream = sc.next();
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setString(3, stream);
				int val = pstmt.executeUpdate();
				System.out.println(val +" rows inserted");
			}
//			con.commit();  every SQL statement is committed automatically after execution.
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		insertRows();
	}
}
