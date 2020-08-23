package com.myproduct.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.myproduct.dbutil.*;
import com.myproduct.model.*;
public class ProductDao {

	public	ArrayList<Product> getProducts(){
		try
		{

		Connection connection=DBConnection.getConnect();
		
			
			String sql="select * from Product";
			PreparedStatement stat=connection.prepareStatement(sql);

			ArrayList<Product> Pro=new ArrayList<>();

			ResultSet res= stat.executeQuery();
			if(res.next())
			{
			do{

			int prodid= res.getInt(1);
			int productprice=res.getInt(2);
			String prodName= res.getString(3);
			String prodbrand= res.getString(4);
			String prodaddress= res.getString(5);
			String proddate= res.getString(6);
			

			Product p=new Product (prodid,productprice, prodName,prodbrand,prodaddress,proddate );

			Pro.add(p);

			 }
			while(res.next());

			}

			return Pro;

			}
			catch (Exception e) {
			e.printStackTrace();

			}

			return null;
			}
	public int deleteProduct(int productId){
		try
		{
		Connection connection=DBConnection.getConnect();

		String sql="delete from Product where productid=? productbrnad=?";
		PreparedStatement stat=connection.prepareStatement(sql);


		stat.setInt(1, productId);
		//stat.setString(4, productbrand);
		int res= stat.executeUpdate();
		if(res>0){
		return res;
		}

		}
		catch (Exception e) {
		e.printStackTrace();

		}

		return 0;
		}




		}



