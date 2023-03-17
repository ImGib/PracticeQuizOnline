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
                            <form action="marketing-editslide" method="post" class="">
                                <h1 class="h3 mb-5 " style="text-align: center; font-weight: 800px; font-size: 40">Edit Slide ID: ${id}</h1>
                                <p class="text-danger">${wrongText}</p>
                                <p class="text-success">${successText}</p>
                                <input type="text" value="${id}" name="id" hidden="">

                                <div class="mb-4"style="display: flex">
                                    <h3 class="mr-4">Link Img: </h3 ><input type="text" value="${img}" name="img" style="width: 60%">
                                </div>
                                <div class="mb-4" style="display: flex">
                                    <h3 class="mr-4">Link Hiperlink: </h3>
                                    <input type="text" value="${hlink}" name="hlink" style="width: 46%">
                                </div> 

                                <button class="btn btn-primary btn-block mt-3 mb-3" type="submit" ><i class="fas fa-user-plus"></i> Edit</button>
                                <a href="marketing-slide" ><i class="fas fa-angle-left"></i> Back</a>
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