package com.myservelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myservelet.dao.ProductDao;
import com.myservelet.product.Product;

/**
 * Servlet implementation class Ser5
 */
@WebServlet("/Ser5")
public class Ser5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ser5() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int prodId=Integer.parseInt(request.getParameter("prodId"));
		String prodName=request.getParameter("prodName");
		float prodPrice=Float.parseFloat(request.getParameter("prodPrice"));
		String mfdStr= request.getParameter("mfd");
		String prodColour=request.getParameter("prodColour");
		String expDateStr=request.getParameter("expDate");

		Date mfd=null;
		Date expDate=null;

		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try
		{
		mfd=sdf.parse(mfdStr);
		expDate=sdf.parse(expDateStr);
		}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}

		Product product=new Product(prodId, prodName, prodPrice, mfd, prodColour, expDate);

		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		ProductDao dao=new ProductDao();
		out.print(dao.saveProduct(product));
		}

		}


