package com.mypack.myjdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcDemo2 {

public static void main(String[] args) {

try
{

Class.forName("oracle.jdbc.OracleDriver");

Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "agamdxc","agamya1612");

String sql="insert into clg values(?,?)";

PreparedStatement stat=con.prepareStatement(sql);

Scanner sc=new Scanner(System.in);
System.out.println("ENTER Cid , clg name ");

int cid=sc.nextInt();
String cname=sc.next();


stat.setInt(1, cid);
stat.setString(2, cname);

stat.executeUpdate();
System.out.println("Values inserted");
}
catch (Exception e) {
e.printStackTrace();
}
}

}

