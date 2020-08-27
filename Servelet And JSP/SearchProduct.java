package com.myservelet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.myservelet.dao.ProductDao;
import com.myservelet.product.Product;

/**
 * Servlet implementation class SearchProduct
 */
@WebServlet("/SearchProduct")
public class SearchProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String data=request.getParameter("search");
		ProductDao dao=new ProductDao();
		ArrayList<Product> productList= dao.searchProductByName(data);

		//System.out.println(productList.size());
		
		HttpSession session= request.getSession();
		session.setAttribute("productList", productList);


		javax.servlet.RequestDispatcher rd= request.getRequestDispatcher("displayProduct.jsp");
		rd.forward(request, response);


	}
	}


