package JDBC_casestudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProudOperations {
	public static void main(String[] args) {
	String URL = "jdbc:mysql://localhost:3306/inventorydb";
    String USER = "root";
    String PASSWORD = "rpk123";
    try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
		System.out.println("connected to database");
		String insert = "INSERT INTO products VALUES (?, ?, ?, ?)";
		PreparedStatement insrt = conn.prepareStatement(insert);
	        insrt.setInt(1, 1);
	        insrt.setString(2, "Laptop");
	        insrt.setInt(3, 10);
	        insrt.setDouble(4, 75000.00);
	        insrt.executeUpdate();
	    System.out.println("Product added.");
    
    // SELECT: View all products
    String select = "SELECT * FROM products";
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(select);
    System.out.println("Inventory:");
    while (rs.next()) {
        System.out.println(rs.getInt(1) + " - " +
                           rs.getString(2) + " - Qty: " +
                           rs.getInt(3) + " - ₹" +
                           rs.getDouble(4));
    }

    // UPDATE: Change quantity
    String update = "UPDATE products SET quantity = ? WHERE product_id = ?";
    PreparedStatement updt = conn.prepareStatement(update);
	    updt.setInt(1, 8); // after sale
	    updt.setInt(2, 1);
	    updt.executeUpdate();
    System.out.println("Quantity updated.");

    // DELETE: Remove product
    String delete = "DELETE FROM products WHERE product_id = ?";
    PreparedStatement dlt = conn.prepareStatement(delete);
    	dlt.setInt(1, 1);
    	dlt.executeUpdate();
    System.out.println("Product deleted.");

        conn.close();
        stmt.close();
        rs.close(); 
        updt.close();
        dlt.close();
        
    } catch (Exception e) {
    	System.out.println("connection error: "+e);
        }
	}

}
