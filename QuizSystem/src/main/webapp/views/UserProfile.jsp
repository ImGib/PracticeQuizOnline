<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>Profile</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
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

            .img-account-profile {
                height: 10rem;
            }

            .rounded-circle {
                border-radius: 50% !important;
            }

            .card {
                box-shadow: 0 0.15rem 1.75rem 0 rgb(33 40 50 / 15%);
            }

            .card .card-header {
                font-weight: 500;
            }

            .card-header:first-child {
                border-radius: 0.35rem 0.35rem 0 0;
            }

            .card-header {
                padding: 1rem 1.35rem;
                margin-bottom: 0;
                background-color: rgba(33, 40, 50, 0.03);
                border-bottom: 1px solid rgba(33, 40, 50, 0.125);
            }

            .form-control,
            .dataTable-input {
                display: block;
                width: 100%;
                padding: 0.875rem 1.125rem;
                font-size: 0.875rem;
                font-weight: 400;
                line-height: 1;
                color: #69707a;
                background-color: #fff;
                background-clip: padding-box;
                border: 1px solid #c5ccd6;
                -webkit-appearance: none;
                -moz-appearance: none;
                appearance: none;
                border-radius: 0.35rem;
                transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
            }

            .nav-borders .nav-link.active {
                color: #0061f2;
                border-bottom-color: #0061f2;
            }

            .nav-borders .nav-link {
                color: #69707a;
                border-bottom-width: 0.125rem;
                border-bottom-style: solid;
                border-bottom-color: transparent;
                padding-top: 0.5rem;
                padding-bottom: 0.5rem;
                padding-left: 0;
                padding-right: 0;
                margin-left: 1rem;
                margin-right: 1rem;
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
            <%@include file="student/header-user.jsp" %>
            <!--**********************************
                Header end ti-comment-alt
            ***********************************-->

            <!--**********************************
                Sidebar start
            ***********************************-->
            <c:choose>
                <c:when test="${sessionScope.account.role == 2}">
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


                            </ul>
                        </div>
                    </div>
                </c:when>
                <c:when test="${sessionScope.account.role == 0}">
                    <div class="nk-sidebar">
                        <div class="nk-nav-scroll">
                            <ul class="metismenu" id="menu">
                                <li class="nav-label">Dashboard</li>
                                <li>
                                    <a href="admin-home" aria-expanded="false">
                                        <i class="icon-speedometer menu-icon"></i><span class="nav-text">Dashboard</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="/QuizSystem/admin"><i class="icon-user"></i> <span class="nav-text">User Management</span></a>
                                </li>

                            </ul>
                        </div>
                    </div>
                </c:when>
                <c:when test="${sessionScope.account.role == 3}">
                    <div class="nk-sidebar">           
                        <div class="nk-nav-scroll">
                            <ul class="metismenu" id="menu">
                                <li class="nav-label">Maketting Manager</li>
                                <li>
                                    <a href="Maketting_ManagePost_App.html">
                                        <i class="icon-speedometer menu-icon"></i><span class="nav-text">Dash Board</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="marketing-post">
                                        <i class="icon-user"></i> <span class="nav-text">Manage Post</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="marketing-slide">
                                        <i class="icon-user"></i> <span class="nav-text">Manage Slider</span>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </c:when>
                <c:otherwise>
                    <%@include file="student/user-sidebar.jsp" %>
                </c:otherwise>
            </c:choose>

            <!--**********************************
                Sidebar end
            ***********************************-->

            <!--**********************************
                Content body start
            ***********************************-->
            <div class="content-body">
                <div class="container-xl px-4 mt-4">
                    <nav class="nav nav-borders">
                        <a class="nav-link ${sessionScope.crPage == 'Profile' ? "ms-0 active" : ""}" href="profile"
                           >Profile</a>
                        <a class="nav-link ${sessionScope.crPage == 'Security' ? "ms-0 active" : ""}" href="security"
                           >Security</a>
                    </nav>
                    <hr class="mt-0 mb-4">
                    <div class="row">
                        <div class="col-xl-4">
                            <div class="card mb-4 mb-xl-0">
                                <div class="card-header">Profile Picture</div>
                                <div class="card-body text-center">

                                    <img class="img-account-profile rounded-circle mb-2"
                                         src="${sessionScope.account.img}" alt="">

                                    <!--<div class="small font-italic text-muted mb-4">JPG or PNG no larger than 5 MB</div>-->
                                    <form action="profile" method="post" enctype="multipart/form-data">
                                        <input name="inputImg" type="file" style="width: 250" placeholder="Select Image">
                                        <input class="btn btn-primary" type="submit" value="Upload Image">
                                    </form>
                                    <!--<button class="btn btn-primary" type="button">Upload new image</button>-->
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-8">
                            <!-- Account details card-->
                            <div class="card mb-4">
                                <div class="card-header">Account Details</div>
                                <div class="card-body">
                                    <form action="profile" method="post" enctype="multipart/form-data">
                                        <!-- Form Group (username)-->
                                        <div class="row gx-3 mb-3">
                                            <div class="col-md-6">
                                                <label class="small mb-1" for="inputUsername">Username </label>
                                                <p class="form-control">${sessionScope.account.userName}</p>
                                            </div>
                                            <div class="col-md-6">
                                                <label class="small mb-1" for="inputPhone">Phone number</label>
                                                <input class="form-control" name="inputPhone" type="tel"
                                                       placeholder="Enter your phone number" value="${sessionScope.account.phone}" pattern="[0-9]{10,11}">
                                            </div>
                                        </div>
                                        <!-- Form Row-->
                                        <div class="row gx-3 mb-3">
                                            <!-- Form Group (first name)-->
                                            <div class="col-md-6">
                                                <label class="small mb-1" for="inputFirstName">First name</label>
                                                <input class="form-control" name="inputFirstName" type="text"
                                                       placeholder="Enter your first name" value="${sessionScope.account.firstName}">
                                            </div>
                                            <!-- Form Group (last name)-->
                                            <div class="col-md-6">
                                                <label class="small mb-1" for="inputLastName">Last name</label>
                                                <input class="form-control" name="inputLastName" type="text"
                                                       placeholder="Enter your last name" value="${sessionScope.account.lastName}">
                                            </div>
                                        </div>
                                        <!-- Form Row        -->

                                        <!-- Form Group (location)-->
                                        <div class="md-3">
                                            <label class="small mb-1" for="inputLocation">Location</label>
                                            <input class="form-control" name="inputLocation" type="text"
                                                   placeholder="Enter your location" value="${sessionScope.account.address}">
                                        </div>
                                        <!-- Form Group (email address)-->
                                        <div class="mb-3">
                                            <label class="small mb-1" for="inputEmailAddress">Email address</label>
                                            <input class="form-control" name="inputEmailAddress" type="email"
                                                   placeholder="Enter your email address" value="${sessionScope.account.gmail}">
                                        </div>
                                        <!-- Form Row-->

                                        <!-- Save changes button-->
                                        <button class="btn btn-primary" type="submit">Save changes</button>
                                    </form>
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