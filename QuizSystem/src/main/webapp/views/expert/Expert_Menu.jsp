<%-- 
    Document   : Expert_Menu
    Created on : Feb 23, 2023, 10:04:27 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div class="nk-sidebar">
                <div class="nk-nav-scroll">
                    <ul class="metismenu" id="menu">
                        <li class="nav-label">Expert Manager</li>
                        <li>
                            <a href="expert-home"><i class="icon-user"></i> <span class="nav-text">Statistic</span></a>
                        </li>
                        <li>
                            <a href="expert-subject-management?index=1&&search=" aria-expanded="false">
                                <i class="icon-speedometer menu-icon"></i><span class="nav-text">Manage Subjects</span>
                            </a>
                        </li>
                        <li>
                            <a href="expert-question-management?index=1&&search=&&idSub=-1" aria-expanded="false">
                                <i class="icon-speedometer menu-icon"></i><span class="nav-text">Manage Questions</span>
                            </a>
                        </li>
                        <li>
                            <a href="expert-category-management?index=1&&search=" aria-expanded="false">
                                <i class="icon-speedometer menu-icon"></i><span class="nav-text">Manage Categories</span>
                            </a>
                        </li>

                    </ul>
                </div>
            </div>
    </body>
</html>
