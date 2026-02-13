package com.jdbc.newjava;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class StoredProcedures {

	public static void main(String[] args) {
		Connection con = null;
	
	        String url = "jdbc:mysql://localhost:3306/college";
	        String user = "root";
	        String pass = "Harshal@123";
	        String sql="Call getData (?)";
	       CallableStatement l=null;
	        Scanner sc =null;
	        ResultSet rs=null;
	        
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("Driver loaded");
                          //create connection
     con = DriverManager.getConnection(url, user, pass);
     System.out.println("Connection established successfully");
	      l=con.prepareCall(sql);
	      System.out.println("Enter your account number ");
	      sc=new Scanner(System.in);
	      int acc= sc.nextInt();
	      l.setInt(1,acc);
	      boolean result=l.execute();
	      
	      if(result) {
	    	  rs=l.getResultSet();
	      while(rs.next()) {
	    	  System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getInt(3));
	      }
	      }else {
	    	  System.out.println("No data found");
	      }
	        
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
			
		}
	}
}
	



