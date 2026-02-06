package com.jdbc.newjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        String url = "jdbc:mysql://localhost:3306/college";
        String url1="oracle:jdbc:thin@localhost:1521:xe";
        String user = "root";
        String pass = "Harshal@123";
        String sql="create table phone(phone_Id int primary key ,phone_brand varchar(20),price int ) ;";
        String insert="insert into  phone values (101,'Moto',12000) ;"; //?

        Connection con = DriverManager.getConnection(url, user, pass);
        System.out.println("Connection established successfully");

        Statement st = con.createStatement();
        
		//int i = st.executeUpdate(sql);
		int i1 = st.executeUpdate(insert);
		//System.out.println(i+" row affected");
		System.out.println(i1+" rows affected");
		 

	}

}
