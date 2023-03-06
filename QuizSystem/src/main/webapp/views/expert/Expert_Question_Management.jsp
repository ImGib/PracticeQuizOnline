<%-- 
    Document   : Expert_Question_Management
    Created on : Feb 23, 2023, 8:15:03 AM
    Author     : Lenovo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>Quixlab - Bootstrap Admin Dashboard Template by Themefisher.com</title>
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
            <jsp:include page="Expert_Nav.jsp"></jsp:include>
                <!--**********************************
                    Nav header end
                ***********************************-->

                <!--**********************************
                    header start
                ***********************************-->
                <div class="header">
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
                                <form action="expert-question-management" method="get">
                                    <input type="txt" hidden value="1" name="index">
                                    <input type="txt" class="form-control" placeholder="Search Dashboard"
                                           aria-label="Search Dashboard" name="search" value="${requestScope.searchName}">
                                <button type="submit" hidden></button>
                            </form>
                            <div class="drop-down animated flipInX d-md-none">

                            </div>
                        </div>
                    </div>
                    <div class="header-right">
                        <ul class="clearfix">
                            <li class="icons dropdown">
                                <div class="user-img c-pointer position-relative" data-toggle="dropdown">
                                    <span class="activity active"></span>
                                    <img src="images/user/1.png" height="40" width="40" alt="">
                                </div>
                                <div class="drop-down dropdown-profile animated fadeIn dropdown-menu">
                                    <div class="dropdown-content-body">
                                        <ul>
                                            <li>
                                                <a href="Profile_Update_App.html"><i class="icon-user"></i>
                                                    <span>Profile</span></a>
                                            </li>

                                            <hr class="my-2">

                                            <li><a href="Login_App.html"><i class="icon-key"></i> <span>Logout</span></a>
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
            <jsp:include page="Expert_Menu.jsp"></jsp:include>
                <!--**********************************
                    Sidebar end
                ***********************************-->

                <!--**********************************
                    Content body start
                ***********************************-->
                <div class="content-body">

                    <div class="container-xl">
                        <div class="table-responsive">
                            <div class="table-wrapper">
                                <div class="table-title">
                                    <div class="row">
                                        <div class="col-sm-5">
                                            <h2>Questions <b>Management</b></h2>
                                        </div>
                                        <div class="col-sm-7">

                                            <a href="expert-add-new-question" class="btn btn-secondary"><i class="material-icons">&#xE147;</i>
                                                <span>Add New Question</span></a>
                                            <div class="btn btn-secondary"style="display: flex;">
                                                <div class="mr-2"><i class="fa fa-filter"></i>Filter by subject</div>
                                                <div>
                                                    <form action="expert-question-management" method="get" id="subForm">
                                                        <input hidden value="1" name="index">
                                                        <input hidden value="${requestScope.searchName}" name="search">
                                                        <select name="idSub" style="width:80px; font-size: 15px" onchange="searchBySub()">
                                                            <option value="0">Empty</option>
                                                        <c:forEach items="${requestScope.listS}" var="s">
                                                            <option value="${s.id}" ${requestScope.idSub == s.id ? "selected":""}>${s.name}</option>
                                                        </c:forEach>
                                                    </select>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <table class="table table-striped table-hover">
                                <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>Question</th>
                                        <th>Subject</th>
                                        <th>Status</th>
                                        <th>Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:set var="stt" value="0"></c:set>
                                    <c:forEach items="${requestScope.listQ}" var="q">
                                        <tr>
                                            <c:set var="stt" value="${stt + 1}"></c:set>
                                            <td>${stt}</td>
                                            <td style="max-width:250px"><span style="max-width:250px; line-height: 1.8">${q.question}</span></td>
                                            <td>${q.subject}</td>
                                            <td><span class="status text-success">&bull;</span> Public</td>
                                            <td>
                                                <a href="expert-edit-question?id=${q.id}" class="settings" title="Update" data-toggle="tooltip"><i
                                                        class="material-icons">&#xE8B8;</i></a>
                                                <a href="expert-delete-question?id=${q.id}" class="delete" title="Delete" data-toggle="tooltip"><i
                                                        class="material-icons">&#xE5C9;</i></a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                            <div class="clearfix">
                                <ul class="pagination">
                                    <li class="page-item disabled" ${index == 1 ? "hidden":""}><a href="expert-question-management?index=${index-1}&&search=${requestScope.searchName}&&idSub=${requestScope.idSub}">Previous</a></li>
                                        <c:forEach begin="1" end="${totalPage}" var="i">
                                        <li class="page-item ${index == i ? "active":""}"><a href="expert-question-management?index=${i}&&search=${requestScope.searchName}&&idSub=${requestScope.idSub}" class="page-link">${i}</a></li>
                                        </c:forEach>
                                    <li class="page-item" ${index == totalPage ? "hidden":""}><a href="expert-question-management?index=${index+1}&&search=${requestScope.searchName}&&idSub=${requestScope.idSub}" class="page-link">Next</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- #/ container -->
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

        <script src="asset/js/dashboard/dashboard-1.js"></script>
        
        <script>
            function searchBySub(){
                document.getElementById("subForm").submit();
            }
        </script>

    </body>

</html>