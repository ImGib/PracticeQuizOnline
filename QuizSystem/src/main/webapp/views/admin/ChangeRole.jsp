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
        <div id="logreg-forms" class="mt-5" style="margin-left: 35%">
            <div class="col-xl-6">
                <div class="form-input-content">
                    <div class="card login-form mb-0">
                        <div class="card-body pt-5">
                            <form action="admin-changerole" method="post" class="">
                                <h1 class="h3 mt-4 mb-5 font-weight-normal" style="text-align: center; font-size: 45px">Edit Role</h1>
                                <p class="text-danger">${wrongText}</p>
                                <p class="text-success">${successText}</p>
                                <input type="text" value="${user}" name="user" hidden="">
                                <div class="mb-3" style="justify-content: space-between">
                                    <label class="ml-5">Student</label><input class="ml-3" name="role" type="radio" value="1" ${role==1?"checked":""}>
                                    <label class="ml-5">Expert</label><input class="ml-3" name="role" type="radio" value="2" ${role==2?"checked":""}>
                                    <label class="ml-5">Market</label><input class="ml-3" name="role" type="radio" value="3" ${role==3?"checked":""}>          
                                </div>
                                <button class="btn btn-primary btn-block mb-3" type="submit"><i class="fas fa-user-plus"></i> Edit</button>
                                <a href="admin?txt=" ><i class="fas fa-angle-left"></i> Back</a>

                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <br>

        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="asset/js/bootstrap.bundle.min.js"></script>

    </body>
</html>