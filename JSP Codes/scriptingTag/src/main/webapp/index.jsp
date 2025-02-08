<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


		<%!
			int a=10;
			String name ="Anmol Soni";
			                    //  Decalaration tag-> used to declare variable and method
			int square(){
				return a*a;
			}
		%>
		
		<%
			int c=20;
			if(c>0) {
				out.println("True");    // scriptlet tag-> used to embbed java code such as ifelse for loop database connectivity
			} else {
				out.println("False");
			}
			
			for(int i=0; i<=5; i++) {
				out.println(i);
			}
		%>
		
		
		<%= a %>
		<%= square() %>    
		<%= name %>
		
		<%= Math.random() %>
		
		
		



</body>
</html>