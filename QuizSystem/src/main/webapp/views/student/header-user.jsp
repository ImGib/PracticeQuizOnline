<%-- 
    Document   : header-user
    Created on : Feb 21, 2023, 1:20:56 PM
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
        <div class="header mb-3">
            <div class="header-content clearfix">

                <div class="nav-control">
                    <div class="hamburger">
                        <span class="toggle-icon"><i class="icon-menu"></i></span>
                    </div>
                </div>
                <div class="header-left">
                    <div class="input-group icons">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-transparent border-0 pr-2 pr-sm-3" id="basic-addon1"><i
                                    class="mdi mdi-magnify"></i></span>
                        </div>
                        <form action="search-subject" method="post">
                            <input type="text" name="search" class="form-control" placeholder="Search Subject"
                                   aria-label="Search Dashboard">
                        </form>
                    </div>
                </div>
                <div class="header-right">
                    <ul class="clearfix">
                        <li class="icons dropdown">
                            <div class="user-img c-pointer position-relative" data-toggle="dropdown">
                                <span class="activity active"></span>
                                <img src="asset/images/avatar/${sessionScope.account.img == null ? "default-avt.png" :  sessionScope.account.img}" height="40" width="40" alt="">
                            </div>
                            <div class="drop-down dropdown-profile animated fadeIn dropdown-menu">
                                <div class="dropdown-content-body">
                                    <ul>
                                        <c:if test="${sessionScope.account != null}">
                                            <li>
                                                <a href="profile"><i class="icon-user"></i>
                                                    <span>Profile</span></a>
                                            </li>

                                            <hr class="my-2">

                                            <li><a href="logout"><i class="icon-key"></i> <span>Logout</span></a>
                                            </li>
                                        </c:if>
                                        <c:if test="${sessionScope.account == null}">
                                            <li><a href="login"><i class="icon-key"></i> <span>Login</span></a>
                                            </li>
                                        </c:if>
                                    </ul>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </body>
</html>
