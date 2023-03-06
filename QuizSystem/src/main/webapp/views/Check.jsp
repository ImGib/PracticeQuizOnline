<%-- 
    Document   : Check
    Created on : Feb 19, 2023, 1:27:20 AM
    Author     : Lenovo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>correct : ${requestScope.cr}</h1>
        <c:forEach items="${requestScope.id}" var="i">
            <h1>id: ${i} + ${i.isEmpty()}</h1>
        </c:forEach>
            
        <c:forEach items="${requestScope.answer}" var="a">
            <h1>answer: ${a} + ${a.isEmpty()}</h1>
        </c:forEach>    
    </body>
</html>
