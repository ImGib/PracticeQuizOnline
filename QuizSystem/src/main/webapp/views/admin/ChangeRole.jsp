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
        <title>Edit Role</title>
    </head>
    <body>
        <div id="logreg-forms">

<<<<<<< Updated upstream:QuizSystem/src/main/webapp/views/admin/ChangeRole.jsp
            <form action="admin-changerole" method="post" class="">
                <h1 class="h3 mb-3 font-weight-normal" style="text-align: center">Edit Role</h1>
                <p class="text-danger">${wrongText}</p>
                <p class="text-success">${successText}</p>
                <input type="text" value="${user}" name="user" hidden="">
                <label >Student</label><input name="role" type="radio" value="1" ${role==1?"checked":""}>
                <label >Expert</label><input name="role" type="radio" value="2" ${role==2?"checked":""}>
                <label >Market</label><input name="role" type="radio" value="3" ${role==3?"checked":""}>
                <label >Sale</label><input name="role" type="radio" value="4" ${role==4?"checked":""}>
                
                
                <button class="btn btn-primary btn-block" type="submit"><i class="fas fa-user-plus"></i> Edit</button>
                <a href="admin?txt=" ><i class="fas fa-angle-left"></i> Back</a>
=======
            <form action="ChangeRole" method="post" class="">
                <h1 class="h3 mt-4 mb-5 font-weight-normal" style="text-align: center; font-size: 45px">Edit Role</h1>
                <p class="text-danger">${wrongText}</p>
                <p class="text-success">${successText}</p>
                <input type="text" value="${user}" name="user" hidden="">
                <div class="mb-3">
                    <label class="ml-3">Student</label><input class="ml-2" name="role" type="radio" value="1" ${role==1?"checked":""}>
                    <label class="ml-4">Expert</label><input class="ml-2" name="role" type="radio" value="2" ${role==2?"checked":""}>
                    <label class="ml-4">Market</label><input class="ml-2" name="role" type="radio" value="3" ${role==3?"checked":""}>
                    <label class="ml-4">Sale</label><input class="ml-2" name="role" type="radio" value="4" ${role==4?"checked":""}>
                </div>



                <button class="btn btn-primary btn-block mb-3" type="submit"><i class="fas fa-user-plus"></i> Edit</button>
                <a href="Admin?txt=" ><i class="fas fa-angle-left"></i> Back</a>
>>>>>>> Stashed changes:QuizSystem/src/main/webapp/views/ChangeRole.jsp
            </form>
            <br>

        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="asset/js/bootstrap.bundle.min.js"></script>

    </body>
</html>