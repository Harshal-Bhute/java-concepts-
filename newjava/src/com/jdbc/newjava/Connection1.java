package com.jdbc.newjava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connection1 {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        String url = "jdbc:mysql://localhost:3306/college";
        String url1="oracle:jdbc:thin:@localhost:1521:xe";
        String user = "root";
        String pass = "Harshal@123";
        String sql="select * from student";

        Connection con = DriverManager.getConnection(url, user, pass);
        System.out.println("Connection established successfully");

        Statement st = con.createStatement();
        
		  ResultSet rs = st.executeQuery(sql);
		  while(rs.next())
		  {
			  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		  }
    }
}
