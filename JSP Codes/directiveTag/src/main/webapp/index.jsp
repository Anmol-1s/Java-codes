<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.time.LocalDate" %>   <%-- Page Directive: Importing Java class --%>
<%@ include file="Header.jsp" %>    <%-- Include Directive: Includes a static file --%>

<!DOCTYPE html>
<html>
<head>
    <title>JSP Directive Tag Example</title>
</head>
<body>

    <h2>JSP Directive Tag Example</h2>

  
    <%!
        String message = "Hello, JSP Directive!";
        int square(int num) {
            return num * num;
        }
    %>

  
    <p>Message: <%= message %></p>
    <p>Square of 5: <%= square(5) %></p>
    <p>Today's Date: <%= LocalDate.now() %></p>


    <%@ include file="Footer.jsp" %>

</body>
</html>
