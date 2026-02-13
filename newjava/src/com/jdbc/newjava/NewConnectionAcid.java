package com.jdbc.newjava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NewConnectionAcid {

	public static void main(String[] args)  {
		 Connection con = null;
		   System.out.println("Driver loaded");
	        String url = "jdbc:mysql://localhost:3306/college";
	        //String url1="oracle:jdbc:thin:@localhost:1521:xe";
	        String user = "root";
	        String pass = "Harshal@123";
	        String sql1="Update account_ set balance = balance-? where account_number=?";
	        String sql2="Update account_ set balance = balance+? where account_number=?";
	        PreparedStatement pst1=null;
	        PreparedStatement pst2=null;
	        Scanner sc =null;
	        
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
     
        
                             //create connection
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("Connection established successfully");
        
                            //prepared statement 
        con.setAutoCommit(false);
         pst1 = con.prepareStatement(sql1);
         pst2 = con.prepareStatement(sql2);
        sc = new Scanner(System.in);
        System.out.println("Pls,enter your account number");
        int u_acc=sc.nextInt();
        System.out.println("Pls,enter receiver account number");
        int r_acc=sc.nextInt();
        System.out.println("Pls,enter amount to sent");
        int s_amount=sc.nextInt();
        
        pst1.setInt(1, s_amount);
        pst2.setInt(2,r_acc);
        
        
        pst1.setInt(1, s_amount);
        pst2.setInt(1,s_amount);
        
        pst1.executeUpdate();
        pst2.executeUpdate();
        con.commit();
        con.setAutoCommit(true);
        } 
		catch (Exception e) {
			try {
				System.out.println("Error occured .Don't worry money will be refunded shortly");
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		finally {
			try {
				sc.close();
				con.close();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
		}
		}

	}

}
