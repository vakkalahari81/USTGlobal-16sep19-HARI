<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ChangePassword</title>
</head>
<jsp:useBean id = "msg" class = "java.lang.String" scope="request"></jsp:useBean>
<body>

<a href="./home">Home</a>
	<a style="float:right" href="./logout">Logout</a>
	<h4><%=msg%></h4>

	<fieldset align="center">
		<legend>Change Password</legend>
		<form action="./changepassword" method="post">
		
			<table align="center">
				
				<tr>
					<td>New Password</td>
					<td><input type ="password" name= "password"></td>
				</tr>
			
				<tr>
					<td>Confirm Password</td>
					<td><input type ="password" name= "confirmpassword"></td>
				</tr>
			
			<tr>
			<td><input type="reset" value="Reset"></td>
			<td><input type="submit" value="Change Password"></td>
			</tr>
			
			</table>
		
		</form>
		
	</fieldset>
	
	
	
	
	
	
	
	
	
	
	<!-- <input name="New" type="text"> <br>
	<input name="Confirm" type="text"> <br>
	
	<input name= change type="submit">
 -->
 
 
</body>
</html>