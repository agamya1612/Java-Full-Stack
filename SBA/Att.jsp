<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<title>jQuery Datepicker: Disable Future Dates</title>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.9.1/themes/base/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.8.2.js"></script>
<script src="http://code.jquery.com/ui/1.9.1/jquery-ui.js"></script>
<script type="text/javascript">
	$(function() {
		var date = new Date();
		var currentMonth = date.getMonth();
		var currentDate = date.getDate();
		var currentYear = date.getFullYear();
		$('#datepicker').datepicker({
			maxDate : new Date(currentYear, currentMonth, currentDate)
		});
	});
</script>
</head>

<body>

	<form action="showAttendance">
		Select Semester : <select name="sem">
			<option>Select</option>
			<option value="1">Sem 1</option>
			<option value="2">Sem 2</option>
			<option value="3">Sem 3</option>
			<option value="4">Sem 4</option>
			<option value="5">Sem 5</option>
			<option value="6">Sem 6</option>
		</select>

		<p>
			Date: <input type="text" id="datepicker" name="date" />
		</p>
		<input type="submit" value="Mark attendance">


	</form>

</body>
</html>
