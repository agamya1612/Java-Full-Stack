package com.myservelet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import com.myservelet.dbutil.DBConnection;
import com.myservelet.product.Product;

public class ProductDao {


public String saveProduct(Product product)
{

try{
Connection con= DBConnection.getConnect();
String sql="insert into products values(?,?,?,?,?,?)";
PreparedStatement stat=con.prepareStatement(sql);

stat.setInt(1, product.getProdId());
stat.setString(2, product.getProdName());
stat.setFloat(3, product.getProdPrice());
stat.setDate(4, new java.sql.Date(product.getMfd().getTime()));
stat.setString(5, product.getColour());
stat.setDate(6, new java.sql.Date(product.getExpDate().getTime()));

int res= stat.executeUpdate();
if(res>0)
return "Product Created";
}

catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}
return "cannot create product";
}
public ArrayList<Product> getAllProducts()
{
try
{

Connection con=DBConnection.getConnect();
String sql="select * from products";

PreparedStatement stat=con.prepareStatement(sql);
ResultSet rs= stat.executeQuery();

ArrayList<Product> productList=new ArrayList<>();

while(rs.next())
{
int prodId= rs.getInt("prod_id");
String prodName= rs.getString("prod_name");
float prodPrice= rs.getFloat("prod_price");
Date mfd= rs.getDate("mfd");
String colour= rs.getString("colour");
Date expDate=rs.getDate("exp_date");

Product product=new Product(prodId, prodName, prodPrice, mfd, colour, expDate);

productList.add(product);

}

return productList;

}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}
return null;
}
	
public String deleteProduct(int prodId){
	try
	{
	Connection connection=DBConnection.getConnect();

	String sql="delete from Products where prod_Id=?";
	PreparedStatement stat=connection.prepareStatement(sql);
	stat.setInt(1, prodId);
	int res= stat.executeUpdate();
	if(res>0){
	return "Deleted";
	}
	}
	catch (Exception e) {
	e.printStackTrace();

	}

	return "Not Deleted" ;
	}
	
public ArrayList<Product> searchProductByName(String data) {
	
	{
		try
		{

		Connection con=DBConnection.getConnect();
		String sql="select * from products where PROD_NAME LIKE '%"+data+"%'";
		PreparedStatement stat=con.prepareStatement(sql);
		ResultSet rs= stat.executeQuery();

		ArrayList<Product> productList=new ArrayList<>();

		while(rs.next())
		{
		int prodId= rs.getInt("prod_id");
		String prodName= rs.getString("prod_name");
		float prodPrice= rs.getFloat("prod_price");
		Date mfd= rs.getDate("mfd");
		String colour= rs.getString("colour");
		Date expDate=rs.getDate("exp_date");

		Product product=new Product(prodId, prodName, prodPrice, mfd, colour, expDate);

		productList.add(product);

		}

		return productList;

		}
		catch (Exception e) {
		
		e.printStackTrace();
		}
	
	
	
	return null;
}


}
}
