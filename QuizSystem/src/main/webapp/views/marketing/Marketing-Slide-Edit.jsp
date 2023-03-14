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

            <form action="marketing-editslide" method="post" class="">
                <h1 class="h3 mb-3 font-weight-normal" style="text-align: center">Edit Slide ID: ${id}</h1>
                <p class="text-danger">${wrongText}</p>
                <p class="text-success">${successText}</p>
                <input type="text" value="${id}" name="id" hidden="">
                <input type="text" value="${img}" name="img">
                <input type="text" value="${hlink}" name="hlink">
                
                <button class="btn btn-primary btn-block" type="submit"><i class="fas fa-user-plus"></i> Edit</button>
                <a href="marketing-slide" ><i class="fas fa-angle-left"></i> Back</a>
            </form>
            <br>

        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="asset/js/bootstrap.bundle.min.js"></script>

    </body>
</html>