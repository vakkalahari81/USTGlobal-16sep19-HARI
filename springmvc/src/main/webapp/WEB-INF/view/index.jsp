<%
	String s = (String)request.getAttribute("msg");
	String s1 = (String)request.getAttribute("msg");
%>
<html>
<body>
<h2>${msg}</h2>
<h3>${name}</h3>
<h3>${id}</h3>
<h2 style="color:green;"><%=s%></h2>
<h2 style ="color:yellow;"><%=s1%></h2>
</body>
</html>
