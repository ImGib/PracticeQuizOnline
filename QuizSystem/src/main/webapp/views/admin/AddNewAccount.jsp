<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="asset/css/login.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="asset/css/bootstrap.min.css"/>
        <title>Admin Create Account</title>
    </head>
    <body>
        <div id="logreg-forms">

            <form action="admin-addaccount" method="post" style="margin: 30 auto">
                <h1 class="h3 mb-5 mt-3 font-weight-normal" style="text-align: center">Add New Account</h1>
                <p class="text-danger">${wrongText}</p>
                <p class="text-success">${successText}</p>
                <input name="user" type="text" class="form-control mb-3" placeholder="User name" required="" value="${user}" pattern="[a-zA-Z0-9_.]+">
                <input name="pass" type="password" class="form-control mb-3" placeholder="Password" required="" value="${pass}">
                <input name="email" type="email" class="form-control mb-3" placeholder="Gmail" value="${email}" required="">
                <input name="add" type="txt" class="form-control mb-3" placeholder="Address"  value="${add}">
                <input name="phone" type="tel" class="form-control mb-3" placeholder="Phone Numbers (10 or 11 numbers)" pattern="[0-9]{10,11}" value="${phone}">
                <div class="mt-5 mb-3" style="justify-content: space-around; display: flex">
                    <div><label class="mr-2" >Student</label><input name="role" type="radio" value="1" checked="" ${role==1?"checked":""}></div>
                    <div><label class="mr-2">Expert</label><input name="role" type="radio" value="2" ${role==2?"checked":""}></div>
                    <div><label class="mr-2">Market</label><input name="role" type="radio" value="3" ${role==3?"checked":""}></div>
                    <div><label class="mr-2">Sale</label><input name="role" type="radio" value="4" ${role==4?"checked":""}></div>
                </div>

                <button class="btn btn-primary btn-block" type="submit"><i class="fas fa-user-plus"></i> Add</button>
                <a href="admin?txt=" ><i class="fas fa-angle-left"></i> Back</a>
            </form>

        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="asset/js/bootstrap.bundle.min.js"></script>

    </body>
</html>