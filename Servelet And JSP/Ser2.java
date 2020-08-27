package com.myservelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Ser2
 */
@WebServlet("/Ser2")
public class Ser2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ser2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session= request.getSession();
		String data=(String)session.getAttribute("sVar");
		ServletContext context= request.getServletContext();
		String appData= context.getAttribute("appVar").toString();
		
		/*HttpSession session= request.getSession();
		Employee employee=(Employee)session.getAttribute("employee");
		session.setMaxInactiveInterval(2);
		out.print(employee);
		out.print("<form action='Ser3'>");
		out.print(" <input type='submit'>");
		out.print(" </form>");*/
		
		
		out.print("servlet 2");
		out.print("Session Data" +data);
		out.print("<br>");
		out.print("Application data "+appData);
		

	}
}
