package Employee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpServelet
 */
@WebServlet("/EmpServelet")
public class EmpServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
	    String data=request.getParameter("Ename");
	    String data1=request.getParameter("EId");
	    String data2=request.getParameter("add");
	    //String data3=request.getParameter("pass");
	    //String data4=request.getParameter("Cpass");
	    String data5=request.getParameter("EDOB");
	    String data6=request.getParameter("SAns");
	    response.setContentType("text/html");
	    out.print("<h1> <font color='blue'> Employee Registration Form </font> </h1>");
	    out.print( data+"<br>" );
	    out.print( data1+"<br>"  );
	    out.print( data2+"<br>"  );
	    //out.print( data3+"<br>"  );
	    //out.print( data4+"<br>"  );
	    out.print( data5 +"<br>" );
	    
	    
	    String arr[]= request.getParameterValues("languagesKnown");
	    String arr1[]= request.getParameterValues("g1");
	    String arr2[]= request.getParameterValues("Sques");
	    
	    for(String a:arr)
	    {
	    	out.println(a+"<br>");
	    }
	    for(String a1:arr1) {
	    	out.print(a1+"<br>");
	    }
	    for(String a2:arr2)
	    {
	    	out.println(a2+"<br>");
	    }
	    out.print( data6  +"<br>");
	}

}
