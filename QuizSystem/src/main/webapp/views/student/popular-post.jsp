<%-- 
    Document   : popular-post
    Created on : Feb 24, 2023, 12:29:01 AM
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
        <div class="card">
            <div class="blog-header">
                <h2>Popular Posts</h2>
            </div>
            <div class="body widget popular-post">
                <div class="row">
                    <div class="col-lg-12">
                        <c:forEach var="plpost" items="${sessionScope.pplPost}">
                            <div class="single_post">
                                <p class="m-b-0"><a href="blog-details?postId=${plpost.id}">${plpost.tittle}</a></p>
                                <span>${plpost.publicDate}</span>
                                <div class="img-post">
                                    <img src="${plpost.img}"
                                         alt="Awesome Image">
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
