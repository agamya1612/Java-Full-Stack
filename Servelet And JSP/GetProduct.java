package com.myservelet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myservelet.dao.ProductDao;
import com.myservelet.product.Product;

/**
 * Servlet implementation class GetProduct
 */
@WebServlet("/GetProduct")
public class GetProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDao dao=new ProductDao();
		ArrayList<Product> productList=  dao.getAllProducts();

		HttpSession session= request.getSession();
		session.setAttribute("productList", productList);


		RequestDispatcher rd= request.getRequestDispatcher("displayProduct.jsp");	
		rd.forward(request, response);

		}

}
