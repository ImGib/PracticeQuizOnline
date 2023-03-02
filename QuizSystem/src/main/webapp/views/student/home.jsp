<%-- 
    Document   : home
    Created on : Feb 21, 2023, 1:01:52 PM
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
        <title>QuixLab</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Favicon icon -->
        <link rel="icon" type="image/png" sizes="16x16" href="asset/images/favicon.png">
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

            .card .blog-header {
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

            .animate-fading {
                width: 98%;
                animation: fading 10s infinite
            }

            @keyframes fading {
                0% {
                    opacity: 0
                }

                50% {
                    opacity: 1
                }

                100% {
                    opacity: 0
                }
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
                header start
            ***********************************-->
            <%@include file="header-user.jsp" %>
            <!--**********************************
                header end ti-comment-alt
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
            <div class="content-body">
                <div id="main-content" class="blog-page">
                    <div class="row clearfix">
                        <div class="col-lg-12 col-md-12 left-box">
                            <div class="card single_post mx-5" style="width: 95%;">
                                <div class="body">
                                    <div>
                                        <img class="mySlides2 animate-fading"
                                             src="https://bizweb.dktcdn.net/100/330/208/files/mau-slide-powerpoint-lich-su-1.jpg?v=1651990539676">
                                        <img class="mySlides2 animate-fading"
                                             src="https://bizweb.dktcdn.net/100/330/208/files/mau-slide-powerpoint-lich-su-9.jpg?v=1651990877449">
                                        <img class="mySlides2 animate-fading"
                                             src="https://bizweb.dktcdn.net/100/330/208/files/mau-slide-powerpoint-lich-su-17.jpg?v=1651991039908">
                                        <img class="mySlides2 animate-fading"
                                             src="https://bizweb.dktcdn.net/100/330/208/files/mau-slide-powerpoint-lich-su-3.jpg?v=1651990799496">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="my-5" style="font-size: 30px; text-align: center;">95% học sinh sử dụng QuixLab cho biết họ
                        đã cải thiện được điểm số</div>
                    <div class="container mt-5 mb-3">
                        <div class="row">
                            <c:forEach var="sub" items="${requestScope.sbjList}">
                                <c:set var="author" value="${requestScope.accService.getAccountByID(sub.idAuthor)}"/>
                                <div class="col-md-4">
                                    <div class="card p-3 mb-2">
                                        <div class="d-flex justify-content-between">
                                            <div class="d-flex flex-row align-items-center">
                                                <!--                                            <div class="icon"> <i class="bx bxl-mailchimp"></i> </div>-->
                                                <div class="ms-2 c-details">
                                                    <h6 class="mb-0">${author.firstName} ${author.lastName}</h6> 
                                                    <span>${sub.diffirentDate()}</span>
                                                </div>
                                            </div>
                                            <div class="badge"> 
                                                <c:choose>
                                                    <c:when test="${sessionScope.account.checkEnroll(sub.id) == sub.id}">
                                                        <a><span style="background-color: #fffbec;
                                                                          width: 60px;
                                                                          height: 25px;
                                                                          padding-bottom: 3px;
                                                                          border-radius: 5px;
                                                                          display: flex;
                                                                          color: #fed85d;
                                                                          justify-content: center;
                                                                          align-items: center;">Enrolled</span></a>
                                                        </c:when>
                                                        <c:when test="${sessionScope.account.checkEnroll(sub.id) != sub.id}">
                                                            <c:if test="${sessionScope.account == null}">
                                                                <a href="login"><span>Enroll</span></a> 
                                                            </c:if>
                                                            <c:if test="${sessionScope.account != null}">
                                                                <a href="enroll?idSub=${sub.id}"><span>Enroll</span></a> 
                                                            </c:if>
                                                    </c:when>
                                                </c:choose>
                                            </div>
                                        </div>
                                        <div class="mt-5">
                                            <a class="course" href="subject-details?id=${sub.id}">
                                                <h3 class="heading">${sub.name}</h3>
                                            </a>
                                            <div class="mt-5">
                                                <div class="mt-3">
                                                    <span class="text1">${sub.getNumberEnroll()} Person <span class="text2">Erroll this Cousrse</span>\</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!--See More Button-->
                                    <c:if test="${requestScope.sbjList.get(2) == sub}">
                                        <div style="text-align: end; margin-bottom: 15px;">
                                            <div class="actions">
                                                <a href="subject-list" class="btn btn-outline-secondary">See More</a>
                                            </div>
                                        </div>
                                    </c:if>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                    <div class="my-5" style="font-size: 30px; text-align: center;">Sẵn sàng cho ngày thi với Học và Kiểm tra</div>
                    <div class="container">
                        <div class="row clearfix">
                            <div class="col-lg-8 col-md-12 left-box">
                                <c:forEach var="pst" items="${requestScope.pstList}">
                                    <div class="card single_post">
                                        <div class="body">
                                            <div class="img-post">
                                                <img class="d-block img-fluid"
                                                     src="${pst.img}" alt="First slide">
                                            </div>
                                            <h3><a href="blog-details?postId=${pst.id}">${pst.tittle}</a></h3>
                                            <p style="width: 670px; height: 78">${pst.details}</p>
                                        </div>
                                        <div class="footer">
                                            <div class="actions">
                                                <a href="blog-details?postId=${pst.id}" class="btn btn-outline-secondary">Continue
                                                    Reading</a>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                                <c:if test="${requestScope.pstList.size() == 2}">
                                    <div style="text-align: end; margin-bottom: 15px;">
                                        <div class="actions">
                                            <a href="blog" class="btn btn-outline-secondary">See More</a>
                                        </div>
                                    </c:if>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-12 right-box">
                                <div class="card">
                                    <div class="blog-header">
                                        <h2>List Categories</h2>
                                    </div>
                                    <div class="body widget">
                                        <ul class="list-unstyled categories-clouds m-b-0">
                                            <c:forEach var="cate" items="${cateList}">
                                                <li><a href="subject-list?search=${cate.name}">${cate.name}</a></li>
                                                </c:forEach>
                                        </ul>
                                    </div>
                                </div>
                                <%@include file="popular-post.jsp" %>
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

            <!--**********************************
            Scripts
        ***********************************-->
            <script>
                var myIndex = 0;
                carousel2();

                function carousel2() {
                    var i;
                    var x = document.getElementsByClassName("mySlides2");
                    for (i = 0; i < x.length; i++) {
                        x[i].style.display = "none";
                    }
                    myIndex++;
                    if (myIndex > x.length) {
                        myIndex = 1
                    }
                    x[myIndex - 1].style.display = "block";
                    setTimeout(carousel2, 7000);
                }
            </script>
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