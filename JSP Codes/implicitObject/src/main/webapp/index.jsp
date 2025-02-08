<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	
		 String name = "Anmol Soni";
		 out.println(name);    
	%>
	
	<%
		session.setAttribute("Session","Smart Programming");
	%>
	
	<form action="outputFile.jsp" method="get">
			 <input type ="text" name="name1" placeholder="Enter Name" />
			 <input type="Submit" name="Click Me" />
	</form>

</body>
</html>