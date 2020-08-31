package com.SBA3.MyAttendance;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SaveStudent")
public class SaveStudent extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		
		List<Student> students = null;
		
		Attendance sta = null;
		long d = System.currentTimeMillis();
		Date date = new Date(d);
		
		String[] names = request.getParameterValues("state");
		HttpSession session = request.getSession();
		if(session != null) {
			students = (List<Student>) session.getAttribute("ids");
		}
		
		System.out.println(students.size());
		
		for(String n : names) {
			int sids = Integer.parseInt(n);
			for(Student s : students) {
				if(s.getSid() == sids) {
					sta= new Attendance(s.getSid(), s.getSname(), s.getSem(),  date, "PRESENT");
				}
				else {
					continue;
				}
				if(s.getSid() != sids) {
					sta= new Attendance(s.getSid(), s.getSname(), s.getSem(),  date, "ABSENT");
				}
				try {
				StudentDao.saveStudent(sta);
				}
				
				catch (SQLException e) {
					e.printStackTrace();

			}
				
			
		}
		RequestDispatcher rd=request.getRequestDispatcher("Att.jsp");
		rd.forward(request, response);
		}
		
		
	}

	

}
