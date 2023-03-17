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
        <style>
            #dialog-confirm {
                display:none
            }
            .shut-up {
                float:left;
                display: inline-block;
                margin-top: 1em;
            }
        </style>
    </head>
    <body>
        <form action="test" method="post">
            <div>hello</div>
            <input type="file" id="btnOpenDialog"  />
        </form>
        
        <img src="${requestScope.link}" alt="alt"/>
        <div>${requestScope.link}</div>


    </body>


</html>
