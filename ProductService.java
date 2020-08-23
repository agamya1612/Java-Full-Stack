package com.myproduct.services;

import java.util.ArrayList;

import com.myproduct.dao.ProductDao;
import com.myproduct.model.Product;

public class ProductService {

	public static void main(String[] args) {
		//Product prod= new Product(104,16000,"J5","Samsung", "South Korea", "10-Nov-2015" );
		//System.out.println(pro.createProduct(prod));
		
		/*ProductDao pr=new ProductDao();
		@SuppressWarnings("unused")
		ArrayList<Product> pro =pr.getProducts();
		for(Product p:pro) {
			System.out.println(p);
		}*/
		
		
		ProductDao del=new ProductDao();
		System.out.println(del.deleteProduct(101));

		

	}

}
