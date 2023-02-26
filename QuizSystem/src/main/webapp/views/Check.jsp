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
        <form action="hello" method="post">
            <input type="txt" name="img" value="${img}">
            <input type="txt" name="hlink" value="${hlink}">
            <input type="txt" name="id" value="${id}" hidden="">
            <button>Save</button>
        </form>
        <div>${txt}</div>
        <div>${txt3}</div>
        
    </body>
</html>
