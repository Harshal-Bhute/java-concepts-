package com.jdbc.newjava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Connection1 {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        String url = "jdbc:mysql://localhost:3306/college";
        String url1="oracle:jdbc:thin:@localhost:1521:xe";
        String user = "root";
        String pass = "Harshal@123";
        //select query will be executed with execute query as it return something
       // String sql="select * from student;";
        
        //all the other  query's will be executed with executeUpdate methos as they make updates
        //String sql= "create table branch(id int ,name varchar(20))";
        //String sql= "insert into branch(id,name) values (101,'ct'),(102,'it')";
        
        //taking input from the user
        String sql= "insert into branch(id,name) values (?,?)";

        // create connection
        Connection con = DriverManager.getConnection(url, user, pass);
        System.out.println("Connection established successfully");
        
                                                   //CREATE STATEMENT
        
       // Statement st = con.createStatement();
       // FOR USER INPUT:-
        PreparedStatement st = con.prepareStatement(sql);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the name");
        String name=sc.nextLine();
        
        st.setInt(1, id);
        st.setString(2, name);
        
                                                       //result set
		  int rs = st.executeUpdate();
		 // System.out.println("Table created successfully");
		  
		  
//		  while(rs.next())
//		  {
//			  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
//		  }
    }
}
