package JDBC_casestudy;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
public static void main (String[] args){
	String URL = "jdbc:mysql://localhost:3306/coursedb";
    String USER = "root";
    String PASSWORD = "rpk123"; 
    try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
		System.out.println("connected to database");
		conn.close();
	}catch(Exception e) {
		System.out.println("connection error: "+e);
		}
	}
}
