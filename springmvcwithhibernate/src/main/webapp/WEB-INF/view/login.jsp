<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page session ="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>${msg}</h3>
<fieldset>
<form action="./login" method = "post">
<table>
<tr>
	 <th>Id:</th>
	 <td><input type = "number" name = "id"></td>
<tr>
<tr>
	<th>Password:</th>
	<td><input type = "password" name = "password"></td>
<tr>

<tr>
     <td><input type ="reset" value="reset"></td>
     <td><input type = "submit" value ="Login"></td>
</tr>

</table>
</form>
</fieldset>
<a href= "./register">Click here to Register</a>
</body>
</html>