package com.myserver.demos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servelet implementation class HelloServelet
 */
@WebServlet("/HelloServelet")
public class HelloServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}


	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		 PrintWriter out=response.getWriter();
		    out.print("HELLO WORLD service");

	}*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    
	    PrintWriter out=response.getWriter();
	    String data=request.getParameter("un");
	    response.setContentType("text/html");
	    out.print("<h1> <font color='blue'> HELLO"+ data +" </font> </h1>");
	    }
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
	    PrintWriter out=response.getWriter();
	    String data=request.getParameter("un");
	    response.setContentType("text/html");
	    out.print("<h1> <font color='blue'> HELLO"+ data +" </font> </h1>");
	    String arr[]= request.getParameterValues("languagesKnown");
	    
	    for(String a:arr)
	    {
	   
	    out.println(a+"<br>");
	    }
	   
	    }

	}

	

