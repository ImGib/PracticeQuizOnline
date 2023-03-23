<%-- 
    Document   : Expert-Subject-Management
    Created on : Feb 20, 2023, 2:15:34 PM
    Author     : Gib
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>Subject Management</title>
        <!-- Favicon icon -->
        <link rel="icon" type="image/png" sizes="16x16" href="images/favicon.png">
        <!-- Pignose Calender -->
        <link href="asset/plugins/pg-calendar/css/pignose.calendar.min.css" rel="stylesheet">
        <!-- Chartist -->
        <link rel="stylesheet" href="asset/plugins/chartist/css/chartist.min.css">
        <link rel="stylesheet" href="asset/plugins/chartist-plugin-tooltips/css/chartist-plugin-tooltip.css">
        <!-- Custom Stylesheet -->
        <link href="asset/css/style.css" rel="stylesheet">

        <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/js/bootstrap.bundle.min.js"></script>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" />

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

            .card {
                border: none;
                border-radius: 10px;
            }

            .c-details span {
                font-weight: 300;
                font-size: 13px
            }

            .icon {
                width: 50px;
                height: 50px;
                background-color: #eee;
                border-radius: 15px;
                display: flex;
                align-items: center;
                justify-content: center;
                font-size: 39px
            }

            .badge span {
                background-color: #fffbec;
                width: 60px;
                height: 25px;
                padding-bottom: 3px;
                border-radius: 5px;
                display: flex;
                color: #fed85d;
                justify-content: center;
                align-items: center
            }

            .progress {
                height: 10px;
                border-radius: 10px
            }

            .progress div {
                background-color: red
            }

            .text1 {
                font-size: 14px;
                font-weight: 600
            }

            .text2 {
                color: #a5aec0
            }

            .course {
                text-decoration: none;
                color: #000;
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
                    Header start
                ***********************************-->
            <jsp:include page="Expert_Header.jsp"></jsp:include>
                <!--**********************************
                    Header end ti-comment-alt
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
                    <div class="alert alert-warning" role="alert" ${requestScope.totalP == 0? "":"hidden"}>
                    Not found any subject!!
                </div>
                <div class="container mt-5 mb-3">
                    <div style="text-align: end; margin-bottom: 15px;">
                        <div>
                            <a href="expert-add-new-subject" class="btn btn-secondary"><i class="material-icons"
                                                                                          style="margin-bottom: -20px;">&#xE147;</i>
                                Add new Subject</a>
                        </div>
                    </div>
                    <div class="row">
                        <c:forEach items="${requestScope.list}" var="l">
                            <div class="col-md-4">
                                <div class="card p-3 mb-2">
                                    <div class="d-flex justify-content-between">
                                        <div class="d-flex flex-row align-items-center">
                                            <div class="icon"> <i class="bx bxl-mailchimp"></i> </div>
                                            <div class="ms-2 c-details">
                                                <h6 class="mb-0" style="margin-left: 10px">${l.idAuthor}</h6> <span style="margin-left: 10px">${l.diffirentDate()}</span>
                                            </div>
                                        </div>
                                        <div class="badge"> <a href="expert-public-subject?id=${l.id}&&isPublic=${l.isPublic}"><span>${l.isPublic ? "UnPublic":"Public"}</span></a> </div>
                                    </div>
                                    <div class="mt-5">
                                        <a class="course" href="expert-edit-subject?id=${l.id}">
                                            <div class="heading">${l.name}</div>
                                        </a>
                                        <div class="mt-5">
                                            <div class="mt-3">
                                                <span class="text1">${l.numberEnroll} Person <span class="text2">Erroll this
                                                        Course</span>\</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                    <c:set var="search" value="${requestScope.searchName}"></c:set>
                        <div class="clearfix">
                            <ul class="pagination">
                                <li class="page-item disabled" ${index == 1 ? "hidden":""}><a href="expert-subject-management?index=${index-1}&&search=${search}">Previous</a></li>
                                <c:forEach begin="${(index-2)<=0?1:(index-2)}" end="${(index+2)<totalPage?(index+2):totalPage}" var="i">
                                <li class="page-item ${index == i ? "active":""}"><a href="expert-subject-management?index=${i}&&search=${search}" class="page-link">${i}</a></li>

                            </c:forEach>
                            <li class="page-item" ${index == totalPage ? "hidden":""} ${requestScope.totalP == 0? "hidden":""}><a href="expert-subject-management?index=${index+1}&&search=${search}" class="page-link">Next</a></li>
                        </ul>
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