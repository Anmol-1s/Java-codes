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
    	String myname = request.getParameter("name1");
    	out.println(myname);
    
    %>
    
    <%
    	String mysession = (String)session.getAttribute("Session");
    	out.println(mysession);
    	
    %>
    
</body>
</html>