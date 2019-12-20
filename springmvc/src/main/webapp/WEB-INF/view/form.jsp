<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./form" method ="post">
 <table>
 <tr>
 
 <td>ID</td>
 <td>
 <input type= "number" name="id" id ="number"/>
 </td>
 </tr>
 
 
 <tr>
 <td>Name</td>
 <td>
 <input type ="text" name="name" id ="name"/> 
 </td>
 </tr>
 
 <tr>
 <td>Password</td>
 <td>
<input type="password" name="password" id="password"/> 
 </td>
 </tr>
 
 <tr>
 <td>Gender</td>
 <td>
  <input type="radio" name="gender" value="male"> Male<br>
  <input type="radio" name="gender" value="female"> Female<br>
  <input type="radio" name="gender" value="other"> Other  
 </td>
 </tr> 
  <tr>
  
  <tr>
 <td>DOJ</td>
 <td>
 <input type= "date" name="doj" />
 </td>
 </tr>
  
  <tr>
  <td><input type="submit" name = "submit"></td>
  </tr>
</table>
</form>
</body>
</html>