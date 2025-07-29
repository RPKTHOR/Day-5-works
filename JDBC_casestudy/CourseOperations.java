package JDBC_casestudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CourseOperations {
	public static void main(String[] args) {
	String url = "jdbc:mysql://localhost:3360/coursedb";
	String user = "root";
	String password = "pavan123";
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,user,password);
        System.out.println("connected to database");
        String insert = "INSERT INTO courses";
        PreparedStatement stmt = conn.prepareStatement(insert);
        
	        stmt.setInt(1, 101);
	        stmt.setString(2, "Java Programming");
	        stmt.setString(3, "Dr. Rao");
	        stmt.setInt(4, 4);
	        stmt.executeUpdate();
	        System.out.println("Course added.");

        // Show all courses
        String select = "SELECT * FROM courses";
        Statement stmt1 = conn.createStatement();
        ResultSet rs = stmt1.executeQuery(select);
        System.out.println("Course List:");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " - " +
                               rs.getString(2) + " - " +
                               rs.getString(3) + " - " +
                               rs.getInt(4));
        }

        // Update course
        String update = "UPDATE courses SET faculty = ? WHERE course_id = ?";
        PreparedStatement updt = conn.prepareStatement(update);
	        updt.setString(1, "Prof. Sharma");
	        updt.setInt(2, 101);
	        updt.executeUpdate();
        System.out.println("Course updated.");
        

        // Delete course
        String delete = "DELETE FROM courses WHERE course_id = ?";
        PreparedStatement dlt = conn.prepareStatement(delete);
	        dlt.setInt(1, 101);
	        dlt.executeUpdate();
        System.out.println("Course deleted.");
        
        conn.close();
            stmt.close();
            stmt1.close();   
            updt.close();
            dlt.close();
            rs.close();
            
        } catch(Exception e) {
        	System.out.println("connection error: "+e);
        }
	}

	}
