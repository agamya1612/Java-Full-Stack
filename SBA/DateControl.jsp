<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aqua">
<form action="MarkAttendance">
<center>
<h1>Check the Attendance By using Sem and Date</h1>
<select name="sem" style="font-size-adjust: 50px;">
<option value="1"> Sem 1 </option>
<option value="2"> Sem 2 </option>
<option value="3"> Sem 3 </option>
<option vale="4"> Sem 4 </option>
<option value="5"> Sem 5 </option>
<option value="6"> Sem 6 </option>
</select>
Select Date<input type="Date" name="cdate" id="attdd"  max="2020-08-30">
<input type="submit" value="Check Attendance">
</center>
</form>

</body>
</html>