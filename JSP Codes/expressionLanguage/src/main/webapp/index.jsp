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
		request.setAttribute("Name","Anmol Soni");
		//out.println(request.getAttribute("Name"));
	%>

	
	<h3> Hello ${ requestScope.Name} </h3>
	
	<%
		session.setAttribute("Company_Name","Infosys");
		//out.println(session.getAttribute("Company_Name"));
	%>
	
	<h3> Company Name ${ Company_Name } </h3>

	<form action="outputFile.jsp" method="get">
			 <input type ="text" name="name1" placeholder="Enter Name" />
			 <input type="Submit" value="Click Me" />
	</form>
	
	${20+40}
	
	${40*50}
	
</body>
</html>