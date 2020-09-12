<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>

</head>
<body bgcolor="aqua">
<center>
<h1>
Hello Student Fill your Details Here
</h1>
</center>






<center>
<form action="savestud">
Enter Student Name Here:<input type="text" name="name">
<br>
<br>
Enter Student ID Here:<input type="text" name="id">
<br>
<br>
Enter Student Phone Number Here:<input type="text" name="phnno">
<br>
<br>
Enter Student Age Here:<input type="text" name="age">
<br>
<br>
<input type="submit">
</form>
</center>

<center>
<form action=search>
<h3>Enter here to search the Student details by Student Id</h3>
<input type="text"  name="id" >
<input type="submit">
</form>
</center>
<br>
<br>

<center>
<form action=search1>
<h3>Enter here to search the Student details by Student Name</h3>
<input type="text"  name="name" >
<input type="submit">
</form>
</center>
<br>
<br>




<center>
<form action=search2>
<h3>Enter here to search the Student details by Student Phonenumber</h3>
<input type="text"  name="phonenumber" >
<input type="submit">
</form>
</center>
<br>
<br>

<center>
<form action=search3>
<h3>Enter here to search the Student details by Student Age</h3>
<input type="text"  name="age" >
<input type="submit">
</form>
</center>
<br>
<br>
<center>
<h3>Click Here to update Student Details</h3>
<form action="updatepage">
<input type="submit" value="Update">
</form>
</center>
<br>
<br>
<center>
<form  action="delete">
<h3>Enter here to Delete by Name</h3>
<input type="text" name="name">
<input type="submit" value="Delete by name">
</form>
</center>
<br>
<br>
<center>

<form  action="delete1">
<h3>Enter here to Delete by Id</h3>
<input type="text" name="id">
<input type="submit" value="Delete by Id">
</form>

</center>

</body>
</html>

