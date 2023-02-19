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
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
        <title>Edit Account</title>
    </head>
    <body>
        <div id="logreg-forms">

            <form action="EditAccount" method="post" class="">
                <h1 class="h3 mb-3 font-weight-normal" style="text-align: center">Edit Account</h1>
                <p class="text-danger">${wrongText}</p>
                <p class="text-success">${successText}</p>
                <div>User Name</div>
                <input name="user" type="text" class="form-control" placeholder="User name" required="" value="${user}">
                <div>Pass</div>
                <input name="pass" type="password" class="form-control" placeholder="Password" required="" value="${pass}">
                <div>First Name</div>
                <input name="fname" type="text" class="form-control" placeholder="First name" required="" value="${fname}">
                <div>Last Name</div>
                <input name="lname" type="text" class="form-control" placeholder="Last name" required="" value="${lname}">
                <div>Email</div>
                <input name="email" type="email" class="form-control" placeholder="Gmail" value="${email}">
                <div>Add</div>
                <input name="add" type="txt" class="form-control" placeholder="Address" required="" value="${add}">
                <div>Phone</div>
                <input name="phone" type="tel" class="form-control" placeholder="Phone Numbers (10 or 11 numbers)"pattern="[0-9]{10,11}" value="${phone}">
                <label >Member</label><input name="role" type="radio" value="1" ${role==1?"checked":""}>
                <label >Expert</label><input name="role" type="radio" value="2" ${role==2?"checked":""}>
                <label >Market</label><input name="role" type="radio" value="3" ${role==3?"checked":""}>
                <label >Sale</label><input name="role" type="radio" value="4" ${role==4?"checked":""}>
                <button class="btn btn-primary btn-block" type="submit"><i class="fas fa-user-plus"></i> Edit</button>
                <a href="LoadAdmin" ><i class="fas fa-angle-left"></i> Back</a>
            </form>
            <br>

        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="js/bootstrap.bundle.min.js"></script>

    </body>
</html>