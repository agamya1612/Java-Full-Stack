package com.mypack.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class Myjdbcdemo1 {
	public static void main(String[] args) {

		try
		{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "agamdxc","agamya1612");
		String sql="insert into clg values('160','SRM')";

		PreparedStatement stat=con.prepareStatement(sql);

		stat.executeUpdate();

		System.out.println(" You are connected to JDBC Now");
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		}

		}

