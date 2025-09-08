package JDBC;

import java.sql.*;
public class CreateTable {
	public static void createTable() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//creating connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			System.out.println("Connection created "+ con);
			// Query
			String query = "create table student(sno number, sname varchar2(30), stream varchar2(20))";
			//Statement
			Statement stmt = con.createStatement();
			boolean b = stmt.execute(query);
			System.out.println("b value: "+b);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		createTable();
	}
}
