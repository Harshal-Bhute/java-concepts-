package com.jdbc.newjava;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class InsertStoredProcedure {

	public static void main(String[] args) {
		Connection con = null;
	
	        String url = "jdbc:mysql://localhost:3306/college";
	        String user = "root";
	        String pass = "Harshal@123";
	        String sql="Call insertData (?,?,?)";
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
	      
	      
	      System.out.println("Enter your name ");
	      sc=new Scanner(System.in);
	      String name= sc.nextLine();
	      l.setString(2,name);
	      
	      System.out.println("Enter your balance");
	      sc=new Scanner(System.in);
	      int balance= sc.nextInt();
	      l.setInt(3,balance);
	      
	      
	     int r=l.executeUpdate();
	      System.out.println(r+"Inserted successfully");
	      
	      if(r>0) {
	    	  System.out.println(r+" rows inserted");
	      }else {
	    	  System.out.println("Error,,,,,,,,,,,,,,");
	      }
	        
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
			
		}
	}
}
	



