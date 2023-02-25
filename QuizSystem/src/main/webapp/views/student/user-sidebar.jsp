<%-- 
    Document   : user-sidebar
    Created on : Feb 21, 2023, 1:09:52 PM
    Author     : Gib
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
        <div class="nk-sidebar">
            <div class="nk-nav-scroll">
                <ul class="metismenu" id="menu">
                    <li class="nav-label">${sessionScope.crPage}</li>
                    <li>
                        <a href="home" aria-expanded="false">
                            <i class="icon-speedometer menu-icon"></i><span class="nav-text">Home</span>
                        </a>
                    </li>
                    <li>
                        <a href="subject-list"><i class="icon-user"></i> <span class="nav-text">Subject List</span></a>
                    </li>
                    <li>
                        <a href="blog"><i class="icon-user"></i> <span class="nav-text">Blog</span></a>
                    </li><!-- comment -->
                    <c:if test="${sessionScope.account != null}">
                        <li>
                            <a href="enroll-list"><i class="icon-user"></i> <span class="nav-text">My Enroll</span></a>
                        </li>
                    </c:if>
                </ul>
            </div>
        </div>
    </body>
</html>
