<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Display Attendance</title>
</head>
<body>
<form action="SaveStudent" >
		<table cellspacing="5" cellpadding="0">

			<c:forEach var="students" items="${ids}">
				<tr>
					<td>${students.sname}</td>
					<td>${students.sid}</td>
					<td></td>
					<td><input type='checkbox' name='state' value='${students.sid}'></td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" value="SUBMIT">
</form>
</body>
</html>