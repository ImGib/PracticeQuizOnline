<%-- 
    Document   : subject-details
    Created on : Feb 28, 2023, 11:20:26 AM
    Author     : Gib
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>${requestScope.sub.name}</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/js/bootstrap.bundle.min.js"></script>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" />
        <link rel="icon" type="image/png" sizes="16x16" href="images/favicon.png">
        <!-- Pignose Calender -->
        <link href="asset/plugins/pg-calendar/css/pignose.calendar.min.css" rel="stylesheet">
        <!-- Chartist -->
        <link rel="stylesheet" href="asset/plugins/chartist/css/chartist.min.css">
        <link rel="stylesheet" href="asset/plugins/chartist-plugin-tooltips/css/chartist-plugin-tooltip.css">
        <!-- Custom Stylesheet -->
        <link href="asset/css/style.css" rel="stylesheet">

        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <!-- input popup screen -->
        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
        <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
        <script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
        <link rel="stylesheet" href="/resources/demos/style.css" />
        <!-- comment -->
        <style>
            body {
                color: #566787;
                background: #f5f5f5;
                font-family: 'Varela Round', sans-serif;
                font-size: 13px;
            }

            .table-responsive {
                margin: 30px 0;
            }

            .table-wrapper {
                min-width: 1000px;
                background: #fff;
                padding: 20px 25px;
                border-radius: 3px;
                box-shadow: 0 1px 1px rgba(0, 0, 0, .05);
            }

            .table-title {
                padding-bottom: 15px;
                background: #299be4;
                color: #fff;
                padding: 16px 30px;
                margin: -20px -25px 10px;
                border-radius: 3px 3px 0 0;
            }

            .table-title h2 {
                margin: 5px 0 0;
                font-size: 24px;
            }

            .table-title .btn {
                color: #566787;
                float: right;
                font-size: 13px;
                background: #fff;
                border: none;
                min-width: 50px;
                border-radius: 2px;
                border: none;
                outline: none !important;
                margin-left: 10px;
            }

            .table-title .btn:hover,
            .table-title .btn:focus {
                color: #566787;
                background: #f2f2f2;
            }

            .table-title .btn i {
                float: left;
                font-size: 21px;
                margin-right: 5px;
            }

            .table-title .btn span {
                float: left;
                margin-top: 2px;
            }

            table.table tr th,
            table.table tr td {
                border-color: #e9e9e9;
                padding: 12px 15px;
                vertical-align: middle;
            }

            table.table tr th:first-child {
                width: 60px;
            }

            table.table tr th:last-child {
                width: 100px;
            }

            table.table-striped tbody tr:nth-of-type(odd) {
                background-color: #fcfcfc;
            }

            table.table-striped.table-hover tbody tr:hover {
                background: #f5f5f5;
            }

            table.table th i {
                font-size: 13px;
                margin: 0 5px;
                cursor: pointer;
            }

            table.table td:last-child i {
                opacity: 0.9;
                font-size: 22px;
                margin: 0 5px;
            }

            table.table td a {
                font-weight: bold;
                color: #566787;
                display: inline-block;
                text-decoration: none;
            }

            table.table td a:hover {
                color: #2196F3;
            }

            table.table td a.settings {
                color: #2196F3;
            }

            table.table td a.delete {
                color: #F44336;
            }

            table.table td i {
                font-size: 19px;
            }

            table.table .avatar {
                border-radius: 50%;
                vertical-align: middle;
                margin-right: 10px;
            }

            .status {
                font-size: 30px;
                margin: 2px 2px 0 0;
                display: inline-block;
                vertical-align: middle;
                line-height: 10px;
            }

            .text-success {
                color: #10c469;
            }

            .text-info {
                color: #62c9e8;
            }

            .text-warning {
                color: #FFC107;
            }

            .text-danger {
                color: #ff5b5b;
            }

            .pagination {
                float: right;
                margin: 0 0 5px;
            }

            .pagination li a {
                border: none;
                font-size: 13px;
                min-width: 30px;
                min-height: 30px;
                color: #999;
                margin: 0 2px;
                line-height: 30px;
                border-radius: 2px !important;
                text-align: center;
                padding: 0 6px;
            }

            .pagination li a:hover {
                color: #666;
            }

            .pagination li.active a,
            .pagination li.active a.page-link {
                background: #03A9F4;
            }

            .pagination li.active a:hover {
                background: #0397d6;
            }

            .pagination li.disabled i {
                color: #ccc;
            }

            .pagination li i {
                font-size: 16px;
                padding-top: 6px
            }

            .hint-text {
                float: left;
                margin-top: 10px;
                font-size: 13px;
            }

            .card {
                background: #fff;
                transition: .5s;
                border: 0;
                margin-bottom: 30px;
                border-radius: .55rem;
                position: relative;
                width: 100%;
                box-shadow: 0 1px 2px 0 rgb(0 0 0 / 10%);
            }

            .card .body {
                color: #444;
                padding: 20px;
                font-weight: 400;
            }

            .card .blog-detail-header {
                color: #444;
                padding: 20px;
                position: relative;
                box-shadow: none;
            }

            .single_post {
                -webkit-transition: all .4s ease;
                transition: all .4s ease
            }

            .single_post .body {
                padding: 30px
            }

            .single_post .img-post {
                position: relative;
                overflow: hidden;
                max-height: 500px;
                margin-bottom: 30px
            }

            .single_post .img-post>img {
                -webkit-transform: scale(1);
                -ms-transform: scale(1);
                transform: scale(1);
                opacity: 1;
                -webkit-transition: -webkit-transform .4s ease, opacity .4s ease;
                transition: transform .4s ease, opacity .4s ease;
                max-width: 100%;
                filter: none;
                -webkit-filter: grayscale(0);
                -webkit-transform: scale(1.01)
            }

            .single_post .img-post:hover img {
                -webkit-transform: scale(1.02);
                -ms-transform: scale(1.02);
                transform: scale(1.02);
                opacity: .7;
                filter: gray;
                -webkit-filter: grayscale(1);
                -webkit-transition: all .8s ease-in-out
            }

            .single_post .img-post:hover .social_share {
                display: block
            }

            .single_post .footer {
                padding: 0 30px 30px 30px
            }

            .single_post .footer .actions {
                display: inline-block
            }

            .single_post .footer .stats {
                cursor: default;
                list-style: none;
                padding: 0;
                display: inline-block;
                float: right;
                margin: 0;
                line-height: 35px
            }

            .single_post .footer .stats li {
                border-left: solid 1px rgba(160, 160, 160, 0.3);
                display: inline-block;
                font-weight: 400;
                letter-spacing: 0.25em;
                line-height: 1;
                margin: 0 0 0 2em;
                padding: 0 0 0 2em;
                text-transform: uppercase;
                font-size: 13px
            }

            .single_post .footer .stats li a {
                color: #777
            }

            .single_post .footer .stats li:first-child {
                border-left: 0;
                margin-left: 0;
                padding-left: 0
            }

            .single_post h3 {
                font-size: 20px;
                text-transform: uppercase
            }

            .single_post h3 a {
                color: #242424;
                text-decoration: none
            }

            .single_post p {
                font-size: 16px;
                line-height: 26px;
                font-weight: 300;
                margin: 0
            }

            .single_post .blockquote p {
                margin-top: 0 !important
            }

            .single_post .meta {
                list-style: none;
                padding: 0;
                margin: 0
            }

            .single_post .meta li {
                display: inline-block;
                margin-right: 15px
            }

            .single_post .meta li a {
                font-style: italic;
                color: #959595;
                text-decoration: none;
                font-size: 12px
            }

            .single_post .meta li a i {
                margin-right: 6px;
                font-size: 12px
            }

            .single_post2 {
                overflow: hidden
            }

            .single_post2 .content {
                margin-top: 15px;
                margin-bottom: 15px;
                padding-left: 80px;
                position: relative
            }

            .single_post2 .content .actions_sidebar {
                position: absolute;
                top: 0px;
                left: 0px;
                width: 60px
            }

            .single_post2 .content .actions_sidebar a {
                display: inline-block;
                width: 100%;
                height: 60px;
                line-height: 60px;
                margin-right: 0;
                text-align: center;
                border-right: 1px solid #e4eaec
            }

            .single_post2 .content .title {
                font-weight: 100
            }

            .single_post2 .content .text {
                font-size: 15px
            }

            .right-box .categories-clouds li {
                display: inline-block;
                margin-bottom: 5px
            }

            .right-box .categories-clouds li a {
                display: block;
                border: 1px solid;
                padding: 6px 10px;
                border-radius: 3px
            }

            .right-box .instagram-plugin {
                overflow: hidden
            }

            .right-box .instagram-plugin li {
                float: left;
                overflow: hidden;
                border: 1px solid #fff
            }

            .comment-reply li {
                margin-bottom: 15px
            }

            .comment-reply li:last-child {
                margin-bottom: none
            }

            .comment-reply li h5 {
                font-size: 18px
            }

            .comment-reply li p {
                margin-bottom: 0px;
                font-size: 15px;
                color: #777
            }

            .comment-reply .list-inline li {
                display: inline-block;
                margin: 0;
                padding-right: 20px
            }

            .comment-reply .list-inline li a {
                font-size: 13px
            }

            @media (max-width: 640px) {
                .blog-page .left-box .single-comment-box>ul>li {
                    padding: 25px 0
                }

                .blog-page .left-box .single-comment-box ul li .icon-box {
                    display: inline-block
                }

                .blog-page .left-box .single-comment-box ul li .text-box {
                    display: block;
                    padding-left: 0;
                    margin-top: 10px
                }

                .blog-page .single_post .footer .stats {
                    float: none;
                    margin-top: 10px
                }

                .blog-page .single_post .body,
                .blog-page .single_post .footer {
                    padding: 30px
                }

            }

            .login-form__btn.submit_c {
                padding: 5px 20px;
                background: #3fa089;
                font-weight: 550;
            }

            .popup {
                top:0;
                width: 400px;
                background: #20c997;
                border-radius: 6px;
                position: absolute;
                left: 50%;
                text-align: center;
                padding: 0 30px 30px;
                color: #333;
                visibility: hidden;
                transform: translate(-50%,-50%) scale(0.1);
                transition: transform 0.4s, top 0.4s;
            }
            .open-popup{
                visibility: visible;
                top: 270px;
                transform: translate(-50%,-50%) scale(1);
            }
        </style>
        <script>
            $(document).ready(function () {
                $('[data-toggle="tooltip"]').tooltip();
            });
        </script>

    </head>

    <body>

        <!--*******************
            Preloader start
        ********************-->
        <div id="preloader">
            <div class="loader">
                <svg class="circular" viewBox="25 25 50 50">
                <circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="3" stroke-miterlimit="10" />
                </svg>
            </div>
        </div>
        <!--*******************
            Preloader end
        ********************-->


        <!--**********************************
            Main wrapper start
        ***********************************-->
        <div id="main-wrapper">

            <!--**********************************
                Nav header start
            ***********************************-->
            <div class="nav-header">
                <div class="brand-logo">
                    <a href="home">
                        <b class="logo-abbr"><img src="asset/images/logo.png" alt=""> </b>
                        <span class="logo-compact"><img src="asset/images/logo-compact.png" alt=""></span>
                        <span class="brand-title">
                            <img src="asset/images/logo-text.png" alt="">
                        </span>
                    </a>
                </div>
            </div>
            <!--**********************************
                Nav header end
            ***********************************-->

            <!--**********************************
                Header start
            ***********************************-->
            <%@include file="header-user.jsp" %>

            <!--**********************************
                Header end ti-comment-alt
            ***********************************-->

            <!--**********************************
                Sidebar start
            ***********************************-->
            <%@include file="user-sidebar.jsp" %>

            <!--**********************************
                Sidebar end
            ***********************************-->

            <!--**********************************
                Content body start
            ***********************************-->
            <div class="content-body mt-4">
                <div class="login-form-bg h-100">
                    <div class="container h-100">
                        <div class="row justify-content-center h-100">
                            <div class="col-xl-9">
                                <div class="form-input-content">
                                    <div class="card login-form mb-0">
                                        <div class="card-body pt-5 mb-5">
                                            <h1 class="text-center">${requestScope.sub.name}</h1>

                                            <div class="mt-5 mb-5 login-input">
                                                <div class="form-group">
                                                    <div>
                                                        <img src="${requestScope.sub.img}" style="width: 100%; border-radius: 4px;">
                                                    </div>


                                                    <!-- Form Group (first name)-->
                                                    <div class="col-md-4 pt-1 " style="font-size: 20px;padding-left: 0px">
                                                        <span>Category: </span>
                                                    </div>
                                                    <div class=" mt-1" style="display: flex; flex-wrap: wrap;">
                                                        <c:forEach var="cate" items="${requestScope.cateList}">
                                                            <div class="ml-5 mt-2">
                                                                <div class="btn login-form__btn submit_c">
                                                                    <div style="color: white; font-size: 15px;">${cate.name}</div>
                                                                </div>
                                                            </div>
                                                        </c:forEach>
                                                    </div>
                                                    <!-- Form Group (last name)-->
                                                </div>



                                                <div class="form-group">
                                                    <div class="row gx-2 mb-3">
                                                        <!-- Form Group (first name)-->
                                                        <div class="col-md-3 pt-1" style="font-size: 20px;">
                                                            <span>Description: </span>
                                                        </div>
                                                        <div class="col-md-8"
                                                             style="border: #c1bfbf solid 1px; padding: 0 0; border-radius: 5px; background-color: #f4f4f4;">
                                                            <div class="mx-3 my-3">
                                                                ${requestScope.sub.description}
                                                            </div>
                                                        </div>
                                                        <!-- Form Group (last name)-->
                                                    </div>
                                                </div>
                                                <c:if test="${sessionScope.account.checkEnroll(requestScope.sub.id) != requestScope.sub.id}">
                                                    <c:if test="${sessionScope.account == null}">
                                                        <c:set var="link" value="login"/>
                                                    </c:if>
                                                    <c:if test="${sessionScope.account != null}">
                                                        <c:set var="link" value="enroll?idSub=${requestScope.sub.id}"/>
                                                    </c:if>
                                                    <div style="margin-top: 50px; text-align: center;">
                                                        <a class="btn submit" href="${link}" style="background-color: #05988a; text-align: center;width: 170px; font-weight: 700; color: white;border-radius: 20px;">
                                                            Enroll</a>
                                                    </div>
                                                </c:if>
                                                <c:if test="${sessionScope.account.checkEnroll(requestScope.sub.id) == requestScope.sub.id}">
                                                    <div style="margin-top: 50px; text-align: center;">
                                                        <button class="btn submit" onclick="openPopup()" 
                                                                style="background-color: #05988a; text-align: center;width: 170px; font-weight: 700; color: white;border-radius: 20px;">
                                                            Do Quiz</button>

                                                        <div class="popup" id="popup">
                                                            <h2 class="mt-4 mb-4 text-white">Enter number of question (${requestScope.questions.size()}):</h2>
                                                            <form name="popupForm" method="get" action="do-quiz" onsubmit="return validateForm()">
                                                                <div>
                                                                    <input type="text" class="form-control" name="number" pattern="[0-9]">                                                                    
                                                                    <input type="text" class="form-control" name="idSub" value="${requestScope.sub.id}" hidden="" >
                                                                </div>
                                                                <div>
                                                                    <input type="submit" class="btn submit mt-3 mb-3" style="margin-top: 20px;background-color: #ffc107; border-radius: 20px; width: 170px;font-weight: 700" value="Do Quiz">
                                                                </div>
                                                            </form>
                                                            <div>
                                                                <button class="btn submit" onclick="closePopup()" 
                                                                        style="background-color: #05988a; text-align: center;width: 170px; font-weight: 700; color: white;border-radius: 20px;">
                                                                    Cancel</button>
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <div class="form-group">
                                                        <div class="col-md-4 pt-1 mt-4" style="font-size: 20px;padding-left: 0px">
                                                            <span>The List Questions: </span>
                                                        </div>
                                                        <c:forEach var="ques" items="${requestScope.questions}">
                                                            <div class="row mx-5 my-4">
                                                                <div class="col-md-7 mr-3"
                                                                     style="border: #c1bfbf solid 1px; padding: 0 0; border-radius: 5px; background-color: #f4f4f4;">
                                                                    <div class="mx-3 my-3">
                                                                        ${ques.getQuestion()}<br>
                                                                        <c:forEach var="ans" items="${ques.allAnswer()}">
                                                                            ${ans.getAnswer()}<br>
                                                                        </c:forEach>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-4"
                                                                     style="border: #c1bfbf solid 1px; padding: 0 0; border-radius: 5px; background-color: #f4f4f4;">
                                                                    <div class="mx-3 my-3">
                                                                        ${ques.rightAnswer() == null ? "" : ques.rightAnswer().getAnswer()}
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </c:forEach>
                                                    </div>
                                                </c:if>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <!--**********************************
                Content body end
            ***********************************-->


        <!--**********************************
                Footer start
            ***********************************-->
        <!--**********************************
                Footer end
            ***********************************-->
    </div>
    <!--**********************************
        Main wrapper end
    ***********************************-->
    <script>
        let popup = document.getElementById("popup");
        function openPopup() {
            popup.classList.add("open-popup");
            $("html, body").animate({ scrollTop: 0 }, "slow");
        }
        function closePopup() {
            popup.classList.remove("open-popup");
        }

        function validateForm() {
            let x = document.forms["popupForm"]["number"].value;
            let max = JSON.parse(${requestScope.questions.size()});
            if (x < 1 || x > max || x === "") {
                alert("Number of question error");
                return false;
            }
        }
    </script>
    <!--**********************************
        Scripts
    ***********************************-->
    <script src="asset/plugins/common/common.min.js"></script>
    <script src="asset/js/custom.min.js"></script>
    <script src="asset/js/settings.js"></script>
    <script src="asset/js/gleek.js"></script>
    <script src="asset/js/styleSwitcher.js"></script>

    <!-- Chartjs -->
    <script src="asset/plugins/chart.js/Chart.bundle.min.js"></script>
    <!-- Circle progress -->
    <script src="asset/plugins/circle-progress/circle-progress.min.js"></script>
    <!-- Datamap -->
    <script src="asset/plugins/d3v3/index.js"></script>
    <script src="asset/plugins/topojson/topojson.min.js"></script>
    <script src="asset/plugins/datamaps/datamaps.world.min.js"></script>
    <!-- Morrisjs -->
    <script src="asset/plugins/raphael/raphael.min.js"></script>
    <script src="asset/plugins/morris/morris.min.js"></script>
    <!-- Pignose Calender -->
    <script src="asset/plugins/moment/moment.min.js"></script>
    <script src="asset/plugins/pg-calendar/js/pignose.calendar.min.js"></script>
    <!-- ChartistJS -->
    <script src="asset/plugins/chartist/js/chartist.min.js"></script>
    <script src="asset/plugins/chartist-plugin-tooltips/js/chartist-plugin-tooltip.min.js"></script>



    <script src="asset/js/dashboard/dashboard-1.js"></script>

</body>

</html>