<%-- 
    Document   : AdminHome.jsp
    Created on : Feb 16, 2023, 11:18:21 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>Quixlab - Bootstrap Admin Dashboard Template by Themefisher.com</title>
        <!-- Favicon icon -->
        <link rel="icon" type="admin/image/png" sizes="16x16" href="admin/images/favicon.png">
        <!-- Pignose Calender -->
        <link href="admin/plugins/pg-calendar/css/pignose.calendar.min.css" rel="stylesheet">
        <!-- Chartist -->
        <link rel="stylesheet" href="admin/plugins/chartist/css/chartist.min.css">
        <link rel="stylesheet" href="admin/plugins/chartist-plugin-tooltips/css/chartist-plugin-tooltip.css">
        <!-- Custom Stylesheet -->
        <link href="admin/css/style.css" rel="stylesheet">

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
                    <a href="index.html">
                        <b class="logo-abbr"><img src="images/logo.png" alt=""> </b>
                        <span class="logo-compact"><img src="./images/logo-compact.png" alt=""></span>
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
                Header start
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
                                <span class="input-group-text bg-transparent border-0 pr-2 pr-sm-3" id="basic-addon1"><i class="mdi mdi-magnify"></i></span>
                            </div>
                            <input type="search" class="form-control" placeholder="Search Dashboard" aria-label="Search Dashboard">
                            <div class="drop-down animated flipInX d-md-none">
                                <form action="#">
                                    <input type="text" class="form-control" placeholder="Search">
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="header-right">
                        <ul class="clearfix">
                            <li class="icons dropdown"><a href="https://www.facebook.com/">
                                    <i class="mdi mdi-email-outline"></i>
                                    <span class="badge badge-pill gradient-1">3</span>
                                </a>
                            </li>
                            <li class="icons dropdown">
                                <div class="user-img c-pointer position-relative"   data-toggle="dropdown">
                                    <span class="activity active"></span>
                                    <img src="images/user/1.png" height="40" width="40" alt="">
                                </div>
                                <div class="drop-down dropdown-profile animated fadeIn dropdown-menu">
                                    <div class="dropdown-content-body">
                                        <ul>
                                            <li>
                                                <a href="app-profile.html"><i class="icon-user"></i> <span>Profile</span></a>
                                            </li>


                                            <li><a href="page-login.html"><i class="icon-key"></i> <span>Logout</span></a></li>
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
                            <a href="index.html">
                                <i class="icon-speedometer menu-icon"></i><span class="nav-text">Dashboard</span>
                            </a>
                        </li>
                        <li>
                            <a href="admin_user_management.html">
                                <i class="icon-user"></i> <span class="nav-text">User Management</span>
                            </a>
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

                <div class="container-fluid mt-3">
                    <div class="row">
                        <div class="col-lg-3 col-sm-6">
                            <div class="card gradient-1">
                                <div class="card-body">
                                    <h3 class="card-title text-white">Products Sold</h3>
                                    <div class="d-inline-block">
                                        <h2 class="text-white">4565</h2>
                                        <p class="text-white mb-0">Jan - March 2019</p>
                                    </div>
                                    <span class="float-right display-5 opacity-5"><i class="fa fa-shopping-cart"></i></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <div class="card gradient-2">
                                <div class="card-body">
                                    <h3 class="card-title text-white">Net Profit</h3>
                                    <div class="d-inline-block">
                                        <h2 class="text-white">$ 8541</h2>
                                        <p class="text-white mb-0">Jan - March 2019</p>
                                    </div>
                                    <span class="float-right display-5 opacity-5"><i class="fa fa-money"></i></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <div class="card gradient-3">
                                <div class="card-body">
                                    <h3 class="card-title text-white">New Customers</h3>
                                    <div class="d-inline-block">
                                        <h2 class="text-white">4565</h2>
                                        <p class="text-white mb-0">Jan - March 2019</p>
                                    </div>
                                    <span class="float-right display-5 opacity-5"><i class="fa fa-users"></i></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <div class="card gradient-4">
                                <div class="card-body">
                                    <h3 class="card-title text-white">Customer Satisfaction</h3>
                                    <div class="d-inline-block">
                                        <h2 class="text-white">99%</h2>
                                        <p class="text-white mb-0">Jan - March 2019</p>
                                    </div>
                                    <span class="float-right display-5 opacity-5"><i class="fa fa-heart"></i></span>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-lg-12">
                            <div class="row">
                                <div class="col-12">
                                    <div class="card">
                                        <div class="card-body pb-0 d-flex justify-content-between">
                                            <div>
                                                <h4 class="mb-1">Product Sales</h4>
                                                <p>Total Earnings of the Month</p>
                                                <h3 class="m-0">$ 12,555</h3>
                                            </div>
                                            <div>
                                                <ul>
                                                    <li class="d-inline-block mr-3"><a class="text-dark" href="#">Day</a></li>
                                                    <li class="d-inline-block mr-3"><a class="text-dark" href="#">Week</a></li>
                                                    <li class="d-inline-block"><a class="text-dark" href="#">Month</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                        <div class="chart-wrapper">
                                            <canvas id="chart_widget_2"></canvas>
                                        </div>
                                        <div class="card-body">
                                            <div class="d-flex justify-content-between">
                                                <div class="w-100 mr-2">
                                                    <h6>Pixel 2</h6>
                                                    <div class="progress" style="height: 6px">
                                                        <div class="progress-bar bg-danger" style="width: 40%"></div>
                                                    </div>
                                                </div>
                                                <div class="ml-2 w-100">
                                                    <h6>iPhone X</h6>
                                                    <div class="progress" style="height: 6px">
                                                        <div class="progress-bar bg-primary" style="width: 80%"></div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>



                    <div class="row">
                        <div class="col-lg-6 col-md-12">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title">Order Summary</h4>
                                    <div id="morris-bar-chart"></div>
                                </div>
                            </div>

                        </div>    
                        <div class="col-lg-3 col-md-6">
                            <div class="card card-widget">
                                <div class="card-body">
                                    <h5 class="text-muted">Order Overview </h5>
                                    <h2 class="mt-4">5680</h2>
                                    <span>Total Revenue</span>
                                    <div class="mt-4">
                                        <h4>30</h4>
                                        <h6>Online Order <span class="pull-right">30%</span></h6>
                                        <div class="progress mb-3" style="height: 7px">
                                            <div class="progress-bar bg-primary" style="width: 30%;" role="progressbar"><span class="sr-only">30% Order</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="mt-4">
                                        <h4>50</h4>
                                        <h6 class="m-t-10 text-muted">Offline Order <span class="pull-right">50%</span></h6>
                                        <div class="progress mb-3" style="height: 7px">
                                            <div class="progress-bar bg-success" style="width: 50%;" role="progressbar"><span class="sr-only">50% Order</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="mt-4">
                                        <h4>20</h4>
                                        <h6 class="m-t-10 text-muted">Cash On Develery <span class="pull-right">20%</span></h6>
                                        <div class="progress mb-3" style="height: 7px">
                                            <div class="progress-bar bg-warning" style="width: 20%;" role="progressbar"><span class="sr-only">20% Order</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                        <div class="col-lg-3 col-md-6">
                            <div class="card">
                                <div class="card-body px-0">
                                    <h4 class="card-title px-4 mb-3">Todo</h4>
                                    <div class="todo-list">
                                        <div class="tdl-holder">
                                            <div class="tdl-content">
                                                <ul id="todo_list">
                                                    <li><label><input type="checkbox"><i></i><span>Get up</span><a href='#' class="ti-trash"></a></label></li>
                                                    <li><label><input type="checkbox" checked><i></i><span>Stand up</span><a href='#' class="ti-trash"></a></label></li>
                                                    <li><label><input type="checkbox"><i></i><span>Don't give up the fight.</span><a href='#' class="ti-trash"></a></label></li>
                                                    <li><label><input type="checkbox" checked><i></i><span>Do something else</span><a href='#' class="ti-trash"></a></label></li>
                                                </ul>
                                            </div>
                                            <div class="px-4">
                                                <input type="text" class="tdl-new form-control" placeholder="Write new item and hit 'Enter'...">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-lg-3 col-sm-6">
                            <div class="card">
                                <div class="card-body">
                                    <div class="text-center">
                                        <img src="./images/users/8.jpg" class="rounded-circle" alt="">
                                        <h5 class="mt-3 mb-1">Ana Liem</h5>
                                        <p class="m-0">Senior Manager</p>
                                        <!-- <a href="javascript:void()" class="btn btn-sm btn-warning">Send Message</a> -->
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <div class="card">
                                <div class="card-body">
                                    <div class="text-center">
                                        <img src="./images/users/5.jpg" class="rounded-circle" alt="">
                                        <h5 class="mt-3 mb-1">John Abraham</h5>
                                        <p class="m-0">Store Manager</p>
                                        <!-- <a href="javascript:void()" class="btn btn-sm btn-warning">Send Message</a> -->
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <div class="card">
                                <div class="card-body">
                                    <div class="text-center">
                                        <img src="./images/users/7.jpg" class="rounded-circle" alt="">
                                        <h5 class="mt-3 mb-1">John Doe</h5>
                                        <p class="m-0">Sales Man</p>
                                        <!-- <a href="javascript:void()" class="btn btn-sm btn-warning">Send Message</a> -->
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <div class="card">
                                <div class="card-body">
                                    <div class="text-center">
                                        <img src="./images/users/1.jpg" class="rounded-circle" alt="">
                                        <h5 class="mt-3 mb-1">Mehedi Titas</h5>
                                        <p class="m-0">Online Marketer</p>
                                        <!-- <a href="javascript:void()" class="btn btn-sm btn-warning">Send Message</a> -->
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>

                    <div class="row">
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="card-body">
                                    <div class="active-member">
                                        <div class="table-responsive">
                                            <table class="table table-xs mb-0">
                                                <thead>
                                                    <tr>
                                                        <th>Customers</th>
                                                        <th>Product</th>
                                                        <th>Country</th>
                                                        <th>Status</th>
                                                        <th>Payment Method</th>
                                                        <th>Activity</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr>
                                                        <td><img src="./images/avatar/1.jpg" class=" rounded-circle mr-3" alt="">Sarah Smith</td>
                                                        <td>iPhone X</td>
                                                        <td>
                                                            <span>United States</span>
                                                        </td>
                                                        <td>
                                                            <div>
                                                                <div class="progress" style="height: 6px">
                                                                    <div class="progress-bar bg-success" style="width: 50%"></div>
                                                                </div>
                                                            </div>
                                                        </td>
                                                        <td><i class="fa fa-circle-o text-success  mr-2"></i> Paid</td>
                                                        <td>
                                                            <span>Last Login</span>
                                                            <span class="m-0 pl-3">10 sec ago</span>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td><img src="./images/avatar/2.jpg" class=" rounded-circle mr-3" alt="">Walter R.</td>
                                                        <td>Pixel 2</td>
                                                        <td><span>Canada</span></td>
                                                        <td>
                                                            <div>
                                                                <div class="progress" style="height: 6px">
                                                                    <div class="progress-bar bg-success" style="width: 50%"></div>
                                                                </div>
                                                            </div>
                                                        </td>
                                                        <td><i class="fa fa-circle-o text-success  mr-2"></i> Paid</td>
                                                        <td>
                                                            <span>Last Login</span>
                                                            <span class="m-0 pl-3">50 sec ago</span>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td><img src="./images/avatar/3.jpg" class=" rounded-circle mr-3" alt="">Andrew D.</td>
                                                        <td>OnePlus</td>
                                                        <td><span>Germany</span></td>
                                                        <td>
                                                            <div>
                                                                <div class="progress" style="height: 6px">
                                                                    <div class="progress-bar bg-warning" style="width: 50%"></div>
                                                                </div>
                                                            </div>
                                                        </td>
                                                        <td><i class="fa fa-circle-o text-warning  mr-2"></i> Pending</td>
                                                        <td>
                                                            <span>Last Login</span>
                                                            <span class="m-0 pl-3">10 sec ago</span>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td><img src="./images/avatar/6.jpg" class=" rounded-circle mr-3" alt=""> Megan S.</td>
                                                        <td>Galaxy</td>
                                                        <td><span>Japan</span></td>
                                                        <td>
                                                            <div>
                                                                <div class="progress" style="height: 6px">
                                                                    <div class="progress-bar bg-success" style="width: 50%"></div>
                                                                </div>
                                                            </div>
                                                        </td>
                                                        <td><i class="fa fa-circle-o text-success  mr-2"></i> Paid</td>
                                                        <td>
                                                            <span>Last Login</span>
                                                            <span class="m-0 pl-3">10 sec ago</span>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td><img src="./images/avatar/4.jpg" class=" rounded-circle mr-3" alt=""> Doris R.</td>
                                                        <td>Moto Z2</td>
                                                        <td><span>England</span></td>
                                                        <td>
                                                            <div>
                                                                <div class="progress" style="height: 6px">
                                                                    <div class="progress-bar bg-success" style="width: 50%"></div>
                                                                </div>
                                                            </div>
                                                        </td>
                                                        <td><i class="fa fa-circle-o text-success  mr-2"></i> Paid</td>
                                                        <td>
                                                            <span>Last Login</span>
                                                            <span class="m-0 pl-3">10 sec ago</span>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td><img src="./images/avatar/5.jpg" class=" rounded-circle mr-3" alt="">Elizabeth W.</td>
                                                        <td>Notebook Asus</td>
                                                        <td><span>China</span></td>
                                                        <td>
                                                            <div>
                                                                <div class="progress" style="height: 6px">
                                                                    <div class="progress-bar bg-warning" style="width: 50%"></div>
                                                                </div>
                                                            </div>
                                                        </td>
                                                        <td><i class="fa fa-circle-o text-warning  mr-2"></i> Pending</td>
                                                        <td>
                                                            <span>Last Login</span>
                                                            <span class="m-0 pl-3">10 sec ago</span>
                                                        </td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>                        
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-xl-3 col-lg-6 col-sm-6 col-xxl-6">

                            <div class="card">
                                <div class="chart-wrapper mb-4">
                                    <div class="px-4 pt-4 d-flex justify-content-between">
                                        <div>
                                            <h4>Sales Activities</h4>
                                            <p>Last 6 Month</p>
                                        </div>
                                        <div>
                                            <span><i class="fa fa-caret-up text-success"></i></span>
                                            <h4 class="d-inline-block text-success">720</h4>
                                            <p class=" text-danger">+120.5(5.0%)</p>
                                        </div>
                                    </div>
                                    <div>
                                        <canvas id="chart_widget_3"></canvas>
                                    </div>
                                </div>
                                <div class="card-body border-top pt-4">
                                    <div class="row">
                                        <div class="col-sm-6">
                                            <ul>
                                                <li>5% Negative Feedback</li>
                                                <li>95% Positive Feedback</li>
                                            </ul>
                                            <div>
                                                <h5>Customer Feedback</h5>
                                                <h3>385749</h3>
                                            </div>
                                        </div>
                                        <div class="col-sm-6">
                                            <div id="chart_widget_3_1"></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-3 col-lg-6 col-sm-6 col-xxl-6">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title">Activity</h4>
                                    <div id="activity">
                                        <div class="media border-bottom-1 pt-3 pb-3">
                                            <img width="35" src="./images/avatar/1.jpg" class="mr-3 rounded-circle">
                                            <div class="media-body">
                                                <h5>Received New Order</h5>
                                                <p class="mb-0">I shared this on my fb wall a few months back,</p>
                                            </div><span class="text-muted ">April 24, 2018</span>
                                        </div>
                                        <div class="media border-bottom-1 pt-3 pb-3">
                                            <img width="35" src="./images/avatar/2.jpg" class="mr-3 rounded-circle">
                                            <div class="media-body">
                                                <h5>iPhone develered</h5>
                                                <p class="mb-0">I shared this on my fb wall a few months back,</p>
                                            </div><span class="text-muted ">April 24, 2018</span>
                                        </div>
                                        <div class="media border-bottom-1 pt-3 pb-3">
                                            <img width="35" src="./images/avatar/2.jpg" class="mr-3 rounded-circle">
                                            <div class="media-body">
                                                <h5>3 Order Pending</h5>
                                                <p class="mb-0">I shared this on my fb wall a few months back,</p>
                                            </div><span class="text-muted ">April 24, 2018</span>
                                        </div>
                                        <div class="media border-bottom-1 pt-3 pb-3">
                                            <img width="35" src="./images/avatar/2.jpg" class="mr-3 rounded-circle">
                                            <div class="media-body">
                                                <h5>Join new Manager</h5>
                                                <p class="mb-0">I shared this on my fb wall a few months back,</p>
                                            </div><span class="text-muted ">April 24, 2018</span>
                                        </div>
                                        <div class="media border-bottom-1 pt-3 pb-3">
                                            <img width="35" src="./images/avatar/2.jpg" class="mr-3 rounded-circle">
                                            <div class="media-body">
                                                <h5>Branch open 5 min Late</h5>
                                                <p class="mb-0">I shared this on my fb wall a few months back,</p>
                                            </div><span class="text-muted ">April 24, 2018</span>
                                        </div>
                                        <div class="media border-bottom-1 pt-3 pb-3">
                                            <img width="35" src="./images/avatar/2.jpg" class="mr-3 rounded-circle">
                                            <div class="media-body">
                                                <h5>New support ticket received</h5>
                                                <p class="mb-0">I shared this on my fb wall a few months back,</p>
                                            </div><span class="text-muted ">April 24, 2018</span>
                                        </div>
                                        <div class="media pt-3 pb-3">
                                            <img width="35" src="./images/avatar/3.jpg" class="mr-3 rounded-circle">
                                            <div class="media-body">
                                                <h5>Facebook Post 30 Comments</h5>
                                                <p class="mb-0">I shared this on my fb wall a few months back,</p>
                                            </div><span class="text-muted ">April 24, 2018</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-6 col-lg-12 col-sm-12 col-xxl-12">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title mb-0">Store Location</h4>
                                    <div id="world-map" style="height: 470px;"></div>
                                </div>        
                            </div>
                        </div>
                    </div>



                    <div class="row">
                        <div class="col-lg-3 col-sm-6">
                            <div class="card">
                                <div class="social-graph-wrapper widget-facebook">
                                    <span class="s-icon"><i class="fa fa-facebook"></i></span>
                                </div>
                                <div class="row">
                                    <div class="col-6 border-right">
                                        <div class="pt-3 pb-3 pl-0 pr-0 text-center">
                                            <h4 class="m-1">89k</h4>
                                            <p class="m-0">Friends</p>
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="pt-3 pb-3 pl-0 pr-0 text-center">
                                            <h4 class="m-1">119k</h4>
                                            <p class="m-0">Followers</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <div class="card">
                                <div class="social-graph-wrapper widget-linkedin">
                                    <span class="s-icon"><i class="fa fa-linkedin"></i></span>
                                </div>
                                <div class="row">
                                    <div class="col-6 border-right">
                                        <div class="pt-3 pb-3 pl-0 pr-0 text-center">
                                            <h4 class="m-1">89k</h4>
                                            <p class="m-0">Friends</p>
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="pt-3 pb-3 pl-0 pr-0 text-center">
                                            <h4 class="m-1">119k</h4>
                                            <p class="m-0">Followers</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <div class="card">
                                <div class="social-graph-wrapper widget-googleplus">
                                    <span class="s-icon"><i class="fa fa-google-plus"></i></span>
                                </div>
                                <div class="row">
                                    <div class="col-6 border-right">
                                        <div class="pt-3 pb-3 pl-0 pr-0 text-center">
                                            <h4 class="m-1">89k</h4>
                                            <p class="m-0">Friends</p>
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="pt-3 pb-3 pl-0 pr-0 text-center">
                                            <h4 class="m-1">119k</h4>
                                            <p class="m-0">Followers</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <div class="card">
                                <div class="social-graph-wrapper widget-twitter">
                                    <span class="s-icon"><i class="fa fa-twitter"></i></span>
                                </div>
                                <div class="row">
                                    <div class="col-6 border-right">
                                        <div class="pt-3 pb-3 pl-0 pr-0 text-center">
                                            <h4 class="m-1">89k</h4>
                                            <p class="m-0">Friends</p>
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="pt-3 pb-3 pl-0 pr-0 text-center">
                                            <h4 class="m-1">119k</h4>
                                            <p class="m-0">Followers</p>
                                        </div>
                                    </div>
                                </div>
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
                    <p>Copyright &copy; Designed & Developed by <a href="https://themeforest.net/user/quixlab">Quixlab</a> 2018</p>
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
        <script src="admin/plugins/common/common.min.js"></script>
        <script src="admin/js/custom.min.js"></script>
        <script src="admin/js/settings.js"></script>
        <script src="admin/js/gleek.js"></script>
        <script src="admin/js/styleSwitcher.js"></script>

        <!-- Chartjs -->
        <script src="admin/plugins/chart.js/Chart.bundle.min.js"></script>
        <!-- Circle progress -->
        <script src="admin/plugins/circle-progress/circle-progress.min.js"></script>
        <!-- Datamap -->
        <script src="admin/plugins/d3v3/index.js"></script>
        <script src="admin/plugins/topojson/topojson.min.js"></script>
        <script src="admin/plugins/datamaps/datamaps.world.min.js"></script>
        <!-- Morrisjs -->
        <script src="admin/plugins/raphael/raphael.min.js"></script>
        <script src="admin/plugins/morris/morris.min.js"></script>
        <!-- Pignose Calender -->
        <script src="admin/plugins/moment/moment.min.js"></script>
        <script src="admin/plugins/pg-calendar/js/pignose.calendar.min.js"></script>
        <!-- ChartistJS -->
        <script src="admin/plugins/chartist/js/chartist.min.js"></script>
        <script src="admin/plugins/chartist-plugin-tooltips/js/chartist-plugin-tooltip.min.js"></script>



        <script src="./js/dashboard/dashboard-1.js"></script>

    </body>

</html>