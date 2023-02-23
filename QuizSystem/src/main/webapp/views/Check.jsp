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
        <form action="hello" method="get">
            <textarea id="id" name="txt" >
                
            </textarea>
            <button>save</button>
        </form>
        <div>${txt2}</div>
    </body>
</html>
