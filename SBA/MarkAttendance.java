package com.SBA3.MyAttendance;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/MarkAttendance")
public class MarkAttendance extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
			String sem= request.getParameter("sem");
		
			
			try
			{
			
			Connection con=DBConnection.getConnect();
			
			String sql="select * from student where sem=?";
			PreparedStatement stat=con.prepareStatement(sql);

			stat.setString(1, sem);
			ResultSet rs = stat.executeQuery();
			
			PrintWriter out= response.getWriter();
			response.setContentType("text/html");
			
			out.print("<tr> <td> Stud Id </td> <td> Name </td>  <td> Select </td> </tr><br>");
			
			ArrayList<Student> ids=new ArrayList<>();
			while(rs.next()) {
				Student std = new Student(rs.getInt("StudentID"), rs.getNString("StudentNAME"), rs.getInt("SEM"));;
				ids.add(std);
			}

			
			String s="<html>";
			s+="<form  action='DisplayAttendance.jsp'>";
			s+="<input type='submit' >";
			s+="</form>";
			out.println(s);

			HttpSession session= request.getSession();
			session.setAttribute("ids", ids);
			System.out.println(ids);
			
			/*HttpSession session= request.getSession();
			session.setAttribute("ids", ids);
			RequestDispatcher rd= request.getRequestDispatcher("displayMarkAttendance.jsp");
			rd.forward(request, response);*/
			}
			catch(Exception e)
			{
			e.printStackTrace();
			}

			
			}
		}

