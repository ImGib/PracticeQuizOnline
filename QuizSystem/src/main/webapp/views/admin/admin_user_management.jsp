<%-- 
    Document   : admin_user_management
    Created on : Feb 18, 2023, 11:44:59 PM
    Author     : asus
--%>



<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>User Management</title>
        <!-- Favicon icon -->
        <link rel="icon" type="image/png" sizes="16x16" href="asset/images/favicon.png">
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
                overflow:hidden;
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
                            <form action="admin" method="get" id="formSearch">
                                <input name="txt" oninput="SearchAccount(this)" type="search" id="searchAccount" class="form-control" placeholder="Search Dashboard" value="${txt.contains("Search_Role_")?"":txt}">
                                <input type="text" hidden="" name="check" value="${check}" id="searchCheck">
                                <input type="text" hidden="" name="role" value="${role}" id="searchRole">
                                <button hidden="">submit</button>
                            </form>

                            <div class="drop-down animated flipInX d-md-none">
                                <form action="#">
                                    <input type="text" class="form-control" placeholder="Search">
                                </form>
                            </div>
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
                                            <c:if test="${sessionScope.account != null}">
                                                <li>
                                                    <a href="admin-profile"><i class="icon-user"></i>
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
            <!--**********************************
                Header end ti-comment-alt
            ***********************************-->

            <!--**********************************
                Sidebar start
            ***********************************-->
            <div class="nk-sidebar">
                <div class="nk-nav-scroll">
                    <ul class="metismenu" id="menu">
                        <li class="nav-label">Dashboard</li>
                        <li>
                            <a href="index.html" aria-expanded="false">
                                <i class="icon-speedometer menu-icon"></i><span class="nav-text">Dashboard</span>
                            </a>
                        </li>
                        <li>
                            <a href="/QuizSystem/Admin"><i class="icon-user"></i> <span class="nav-text">User Management</span></a>
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

                <div class="container-xl">
                    <div class="table-responsive">
                        <div class="table-wrapper">
                            <div class="table-title">
                                <div class="row">
                                    <div class="col-sm-5">
                                        <h2>User <b>Management</b></h2>
                                    </div>
                                    <div class="col-sm-7">
                                        <form action="admin" id="formCheck" method="get">
                                            Hide Banned Account:  <input type="checkbox"  id="check" onclick="changeCheck()" ${check==1?"checked":""} >
                                            <input type="text" value="3" name="check" hidden="">
                                        </form>
                                        <a href="admin-addaccount" class="btn btn-secondary"><i class="material-icons">&#xE147;</i>
                                            <span>Add New User</span></a>
                                        <a href="#" class="btn btn-secondary"><i class="material-icons">&#xE24D;</i>
                                            <span>  <form action="admin" method="get" id="form">
                                                    <select id="choseRole" name="txt" onchange="nextWeb(this)">
                                                        <option value="-1" >All Role</option>
                                                        <option value="0" ${role==0?"selected":""}>Admin</option>
                                                        <option value="1" ${role==1?"selected":""}>Student</option>
                                                        <option value="2" ${role==2?"selected":""}>Expert</option>
                                                        <option value="3" ${role==3?"selected":""}>Marketing</option>

                                                    </select></form>
                                            </span></a>
                                    </div>
                                </div>
                            </div>
                            <table class="table table-striped table-hover">
                                <thead>
                                    <tr>

                                        <th>Name</th>
                                        <th>Email</th>
                                        <th>Role</th>
                                        <th>Status</th>
                                        <th>Action</th>
                                    </tr>
                                </thead>
                                <tbody id="content">
                                    <c:set value="0" var="index"></c:set>
                                    <c:forEach items="${ListAccount}" var="o">
                                        <tr onclick="openPopup(${index})">
                                            <td>${o.getUserName()}</td> 
                                            <td>${o.getGmail()}</td>
                                            <c:if test="${o.getRole() == 0}"><td>Admin</td></c:if>
                                            <c:if test="${o.getRole() == 1}"><td>Student</td></c:if>
                                            <c:if test="${o.getRole() == 2}"><td>Expert</td></c:if>
                                            <c:if test="${o.getRole() == 3}"><td>Marketing</td></c:if>
                                            <c:if test="${o.getRole() == 4}"><td>Sale</td></c:if>

                                                <td><span class="status text-${o.isIsActive()?"success":"danger"}">&bull;</span> ${o.isIsActive()?"Active":"Ban"}</td>
                                            <c:if test="${!(o.getRole() == 0)}">
                                                <td>
                                                    <a href="admin-changerole?user=${o.getUserName()}" class="settings" title="Edit" data-toggle="tooltip">
                                                    
                                                           <i class="material-icons"><c:if test="${o.isIsActive()}">&#xE8B8;</c:if></i></a>
                                                    
                                                    <a href="admin-deleteaccount?user=${o.getUserName()}&&isActive=${o.isIsActive()}" class="delete" title="${o.isIsActive()?"Ban":"UnBan"}" data-toggle="tooltip"><i
                                                            class="material-icons">&#xE5C9;</i></a>
                                                </td>
                                            </c:if>


                                        <input type="text" id="firstname${index}" hidden="" value="${o.getFirstName()}">
                                        <input type="text" id="lastname${index}" hidden="" value="${o.getLastName()}">
                                        <input type="text" id="phone${index}" hidden="" value="${o.getPhone()}">
                                        <input type="text" id="email${index}" hidden="" value="${o.getGmail()}">
                                        <input type="text" id="location${index}" hidden="" value="${o.getAddress()}">

                                        <c:set value="${index + 1}" var="index"></c:set>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                            <div class="clearfix">
                                <ul class="pagination" id="pag">
                                    <c:if test="${pageIndex!=1}">
                                        <li class="page-item disabled"><a href="admin?txt=${txt}&pageIndex=${pageIndex-1}">Previous</a></li>
                                        </c:if>
                                        <c:forEach  begin="1" end="${totalPage}" var="i" >
                                        <li class="page-item ${i==pageIndex?"active":""}"><a href="admin?txt=${txt}&pageIndex=${i}" class="page-link">${i}</a></li>
                                        </c:forEach>
                                        <c:if test="${pageIndex!=totalPage}">
                                        <li class="page-item"><a href="admin?txt=${txt}&pageIndex=${pageIndex+1}" class="page-link">Next</a></li>
                                        </c:if>
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
            <div class="footer">
                <div class="copyright">
                </div>
            </div>
            <!--**********************************
                Footer end
            ***********************************-->
        </div>
        <!--**********************************
            Main wrapper end
        ***********************************-->
        <div class="card-body popup" id="popup">
            <div>

                <div class="row gx-3 mb-3">
                    <!-- Form Group (first name)-->
                    <div class="col-md-6">
                        <label class="small mb-1">First name</label>
                        <input class="form-control" id="FirstName" type="text"
                               placeholder="First name" value="" disabled="">
                    </div>
                    <!-- Form Group (last name)-->
                    <div class="col-md-6">
                        <label class="small mb-1" >Last name</label>
                        <input class="form-control" id="LastName" type="text"
                               placeholder="Last name" value="" disabled="">
                    </div>
                </div>

                <div class="row gx-3 mb-3">
                    <div class="col-md-6">
                        <label class="small mb-1">Phone number</label>
                        <input class="form-control" id="Phone" type="tel"
                               placeholder="Phone number" value="" disabled="">
                    </div>
                    <div class="col-md-6">
                        <label class="small mb-1" >Email address</label>
                        <input class="form-control" id="EmailAddress" type="email"
                               placeholder="Email address" value="" disabled="">
                    </div>
                </div>

                <div class="md-3">
                    <label class="small mb-1">Location</label>
                    <input class="form-control" id="Location" type="text"
                           placeholder="Location" value="${sessionScope.account.address}" disabled="">
                </div>
                <button class="btn btn-primary" onclick="closePopup()" type="submit" style="margin-top: 15px">Back</button>
            </div>
        </div>

        <style>
            .popup {
                top:0;
                width: 500px;
                background: #2dcbb5f2;
                border-radius: 6px;
                position: absolute;
                left: 40% ;
                text-align: center;
                padding: 20px 30px 30px;
                color: #333;
                visibility: hidden;
                transform: translate( - 50% , - 50% ) scale(0.1);
                transition: transform 0.4s, top 0.4s;
            }
            .open-popup{
                visibility: visible;
                top: 270px;
                transform: translate( - 50% , - 50% ) scale(1);
            }
            .popup label{
                color: white;
                font-size: 12px;
            }
        </style>

        <script>
            let popup = document.getElementById("popup");
            function openPopup(index) {
                popup.classList.add("open-popup");
                $("html, body").animate({scrollTop: 0}, "slow");

                document.getElementById("FirstName").value = document.getElementById("firstname" + index).value;
                document.getElementById("LastName").value = document.getElementById("lastname" + index).value;
                document.getElementById("Phone").value = document.getElementById("phone" + index).value;
                document.getElementById("EmailAddress").value = document.getElementById("email" + index).value;
                document.getElementById("Location").value = document.getElementById("location" + index).value;
            }
            function closePopup() {
                popup.classList.remove("open-popup");
            }

            $(document).ready(function () {
                $('[data-toggle="tooltip"]').tooltip();
            });


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
        <script>

            function nextWeb(input) {

                document.getElementById("searchRole").value = document.getElementById("choseRole").value;
                document.getElementById("formSearch").submit();
            }
            function changeCheck() {
                var search = document.getElementById("formSearch").value;
                var cbox = document.getElementById("form").value;
                document.getElementById("searchCheck").value = 3;
                document.getElementById("formSearch").submit();
            }


        </script>
    </body>

</html>
