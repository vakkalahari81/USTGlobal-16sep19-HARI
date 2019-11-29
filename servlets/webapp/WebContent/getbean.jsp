<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:useBean id ="obj" class="com.ustglobal.webap.servlets.Employee" scope ="request"/>
<html>

<h3><%=obj.getName() %></h3>
<h3><%=obj.getId() %></h3>

</html>