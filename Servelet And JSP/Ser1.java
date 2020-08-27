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
 * Servlet implementation class Ser1
 */
@WebServlet("/Ser1")
public class Ser1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ser1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");

		out.print("servlet 1");
		String var= request.getParameter("somedata");
		out.print(var +"<br>");
		
		String appVar= request.getParameter("appData");
		out.print(appVar);


		HttpSession session= request.getSession();
		session.setAttribute("sVar", var);
		session.setMaxInactiveInterval(5);
		ServletContext context=request.getServletContext();
		context.setAttribute("appVar", appVar);
		
		/*out.print("servlet 1");
		int empId=Integer.parseInt(request.getParameter("empId"));
		int empAge= Integer.parseInt(request.getParameter("empAge"));
		String empName= request.getParameter("empName");
		String empAddress= request.getParameter("empAddress");

		Employee employee=new Employee(empId, empName, empAge, empAddress);
		
		HttpSession session= request.getSession();
		session.setAttribute("employee", employee);
		session.setMaxInactiveInterval(10);*/
		
		out.print("<form action='Ser2'>");
		out.print(" <input type='submit'>");
		out.print(" </form>");
		//out.print(" <input type='hidden' name='somedata' value='"+var+"'>");
	}

	
}
