<%-- 
    Document   : Marketing-Post-PostList
    Created on : Feb 23, 2023, 10:14:26 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Blog List App - Bootdey.com</title>
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

        .pagination li.active a, .card {
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
                <a href="Home_App.html">
                    <b class="logo-abbr"><img src="images/logo.png" alt=""> </b>
                    <span class="logo-compact"><img src="asset/images/logo-compact.png" alt=""></span>
                    <span class="brand-title">
                        <img src="images/logo-text.png" alt="">
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
        <div class="header" style="margin-bottom: 10px;">
            <div class="header-content clearfix">

                <div class="nav-control">
                    <div class="hamburger">
                        <span class="toggle-icon"><i class="icon-menu"></i></span>
                    </div>
                </div>
                <div class="header-right">
                    <ul class="clearfix">
                        <li class="icons dropdown">
                            <div class="user-img c-pointer position-relative" data-toggle="dropdown">
                                <span class="activity active"></span>
                                <img src="${sessionScope.account.img == null ? "asset/images/avatar/default-avt.png" :  sessionScope.account.img}" height="40" width="40" alt="">
                            </div>
                            <div class="drop-down dropdown-profile animated fadeIn dropdown-menu">
                                <div class="dropdown-content-body">
                                    <ul>
                                        <li>
                                            <a href="marketing-profile"><i class="icon-user"></i>
                                                <span>Profile</span></a>
                                        </li>

                                        <hr class="my-2">

                                        <li><a href="logout"><i class="icon-key"></i> <span>Logout</span></a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <!--**********************************
            header end ti-comment-alt
        ***********************************-->

        <!--**********************************
            Sidebar start
        ***********************************-->
        <div class="nk-sidebar">
            <div class="nk-nav-scroll">
                <ul class="metismenu" id="menu">
                    <li class="nav-label">Blog List</li>
                    <li>
                        <a href="Admin_Dashboard.html" aria-expanded="false">
                            <i class="icon-speedometer menu-icon"></i><span class="nav-text">Dashboard</span>
                        </a>
                    </li>
                    <li>
                        <a href="Admin_User_Management.html"><i class="icon-user"></i> <span class="nav-text">User Management</span></a>
                    </li>

                </ul>
            </div>
        </div>
        <!--**********************************
            Sidebar end
        ***********************************-->

        <!--**********************************
            Content body start
        ***********************************-->
        <div class="content-body">
            <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" />
        <div id="main-content" class="blog-page">
            <div class="container">
                <div class="row clearfix">
                    <div class="col-lg-8 col-md-12 left-box">
                        <div class="card single_post">
                            <div class="body">
                                <div class="img-post">
                                    <img class="d-block img-fluid" src="https://www.bootdey.com/image/800x280/FFB6C1/000000"
                                        alt="First slide">
                                </div>
                                <h3><a href="Blog_Detail_App.html">All photographs are accurate</a></h3>
                                <p>It is a long established fact that a reader will be distracted by the readable content of
                                    a page when looking at its layout. The point of using Lorem Ipsum is that it has a
                                    more-or-less normal</p>
                            </div>
                            <div class="footer">
                                <div class="actions">
                                    <a href="Blog_Detail_App.html" class="btn btn-outline-secondary">Continue Reading</a>
                                </div>
                            </div>
                        </div>
                        <div class="card single_post">
                            <div class="body">
                                <div class="img-post">
                                    <img class="d-block img-fluid" src="https://www.bootdey.com/image/800x280/FFB6C1/000000"
                                        alt="">
                                </div>
                                <h3><a href="Blog_Detail_App.html">All photographs are accurate</a></h3>
                                <p>It is a long established fact that a reader will be distracted by the readable content of
                                    a page when looking at its layout. The point of using Lorem Ipsum is that it has a
                                    more-or-less normal</p>
                            </div>
                            <div class="footer">
                                <div class="actions">
                                    <a href="Blog_Detail_App.html" class="btn btn-outline-secondary">Continue Reading</a>
                                </div>
                            </div>
                        </div>
                        <div class="card single_post">
                            <div class="body">
                                <div class="img-post">
                                    <img class="d-block img-fluid" src="https://www.bootdey.com/image/800x280/FFB6C1/000000"
                                        alt="">
                                </div>
                                <h3><a href="Blog_Detail_App.html">All photographs are accurate</a></h3>
                                <p>It is a long established fact that a reader will be distracted by the readable content of
                                    a page when looking at its layout. The point of using Lorem Ipsum is that it has a
                                    more-or-less normal</p>
                            </div>
                            <div class="footer">
                                <div class="actions">
                                    <a href="Blog_Detail_App.html" class="btn btn-outline-secondary">Continue Reading</a>
                                </div>
                            </div>
                        </div>
                        <div class="card single_post">
                            <div class="body">
                                <div class="img-post">
                                    <img class="d-block img-fluid" src="https://www.bootdey.com/image/800x280/FFB6C1/000000"
                                        alt="">
                                </div>
                                <h3><a href="Blog_Detail_App.html">All photographs are accurate</a></h3>
                                <p>It is a long established fact that a reader will be distracted by the readable content of
                                    a page when looking at its layout. The point of using Lorem Ipsum is that it has a
                                    more-or-less normal</p>
                            </div>
                            <div class="footer">
                                <div class="actions">
                                    <a href="Blog_Detail_App.html" class="btn btn-outline-secondary">Continue Reading</a>
                                </div>
                            </div>
                        </div>
                        <ul class="pagination pagination-primary">
                            <li class="page-item"><a class="page-link" href="javascript:void(0);">Previous</a></li>
                            <li class="page-item active"><a class="page-link" href="javascript:void(0);">1</a></li>
                            <li class="page-item"><a class="page-link" href="javascript:void(0);">2</a></li>
                            <li class="page-item"><a class="page-link" href="javascript:void(0);">3</a></li>
                            <li class="page-item"><a class="page-link" href="javascript:void(0);">Next</a></li>
                        </ul>
                    </div>
                    <div class="col-lg-4 col-md-12 right-box">
                        <div class="card">
                            <div class="body search">
                                <div class="input-group m-b-0">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text"><i class="fa fa-search"></i></span>
                                    </div>
                                    <input type="text" class="form-control" placeholder="Search...">
                                </div>
                            </div>
                        </div>
                        <div class="card">
                            <div class="blog-header">
                                <h2>List Categories</h2>
                            </div>
                            <div class="body widget">
                                <ul class="list-unstyled categories-clouds m-b-0">
                                    <li><a href="javascript:void(0);">eCommerce</a></li>
                                    <li><a href="javascript:void(0);">Microsoft Technologies</a></li>
                                    <li><a href="javascript:void(0);">Creative UX</a></li>
                                    <li><a href="javascript:void(0);">Wordpress</a></li>
                                    <li><a href="javascript:void(0);">Angular JS</a></li>
                                    <li><a href="javascript:void(0);">Enterprise Mobility</a></li>
                                    <li><a href="javascript:void(0);">Website Design</a></li>
                                    <li><a href="javascript:void(0);">HTML5</a></li>
                                    <li><a href="javascript:void(0);">Infographics</a></li>
                                    <li><a href="javascript:void(0);">Wordpress Development</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="card">
                            <div class="blog-header">
                                <h2>Popular Posts</h2>
                            </div>
                            <div class="body widget popular-post">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <div class="single_post">
                                            <p class="m-b-0">Apple Introduces Search Ads Basic</p>
                                            <span>jun 22, 2018</span>
                                            <div class="img-post">
                                                <img src="https://www.bootdey.com/image/280x280/FFB6C1/000000"
                                                    alt="Awesome Image">
                                            </div>
                                        </div>
                                        <div class="single_post">
                                            <p class="m-b-0">new rules, more cars, more races</p>
                                            <span>jun 8, 2018</span>
                                            <div class="img-post">
                                                <img src="https://www.bootdey.com/image/280x280/FFB6C1/000000"
                                                    alt="Awesome Image">
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
        </div>
        
        <!--**********************************
            Content body end
        ***********************************-->


        <!--**********************************
            Footer start
        ***********************************-->
        <div class="footer">
            <div class="copyright">
                <p>Copyright &copy; Designed & Developed by <a href="https://themeforest.net/user/quixlab">Quixlab</a>
                    2018</p>
            </div>
        </div>
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
