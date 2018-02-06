package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JavaJdbc {
	public static void main(String[] args) {
		
		 Connection c = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/apparao",
	            "postgres", "postgres");
	         Statement st = c.createStatement();
	         String sql = "insert into employee values(10,'sri')";
	         st.executeUpdate(sql);
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	   }

}
