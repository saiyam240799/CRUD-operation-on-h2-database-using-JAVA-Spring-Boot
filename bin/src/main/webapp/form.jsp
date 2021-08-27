<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DEMO -4 </title>
</head>
<body>


<h1> to insert the information by id</h1>
	<form action=adddata>
	
		<input type = "text" name = "id"><br>
		<input type = "text" name = "name"><br>
		<input type = "submit">

	<br>
	</form>

<h1> to get the information by id</h1>
	<form action=getdata>

		<input type = "text" name = "id"><br>
		<input type = "submit">
		
	 <br>
	</form>
<h1> to delete the record</h1>

	<form action=deleterecord>

		<input type = "text" name = "id"><br>
		<input type = "submit">
		
	 <br>
	</form>
	

<h1> to update the record</h1>

	<form action=updaterecord>

		<input type = "text" name = "id"><br>
		<input type = "text" name = "name"><br>
		<input type = "submit">
		
	 <br>
	</form>

</body>
</html>