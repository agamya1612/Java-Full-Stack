

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>


<body >
<center>
<h1>

</h1>
</center>
<center>
<form action="searchForUpdate">
Student Id:<input type="text" name="id" value="${school.id}">
<input type="submit" value="search">
</form>
</center>
<center>
<form action="updatedata">
Student Name:<input type="text" name="name" value="${school.name}">
<br>
<br>
Student Phoneno:<input type="text" name="phoneno" value="${school.phnno}">
<br>
<br>




Student Age:<input type="text" name="age" value="${school.age}">
<br>
<br>
<input type="submit" value="update Student">
</form>
</center>
<br>
<br>

</body>
</html>


