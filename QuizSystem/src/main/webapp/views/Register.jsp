<%-- 
    Document   : Register
    Created on : Feb 15, 2023, 1:49:13 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login V1</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="assets-login/images/icons/favicon.ico"/>
        <link rel="stylesheet" type="text/css" href="assets-login/css/util.css">
        <link rel="stylesheet" type="text/css" href="assets-login/css/main.css">
        <!--===============================================================================================-->
    </head>
    <body>

        <div class="limiter">
            <div class="container-login100">
                <div class="wrap-login100">
                    <div class="login100-pic js-tilt" data-tilt>
                        <img src="assets-login/images/img-01.png" alt="IMG">
                    </div>

                    <form class="login100-form validate-form" action="signup" method="post">
                        <span class="login100-form-title">
                            Register
                        </span>
                        
                        <span class="login100-form-title" style="color: red">
                            ${requestScope.mess}
                        </span>

                        <div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
                            <input class="input100" type="email" name="email" placeholder="Email" required>
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class="fa fa-envelope" aria-hidden="true"></i>
                            </span>
                        </div>
                        
                        <div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
                            <input class="input100" type="text" name="user" placeholder="User Name" required pattern="[0-9a-zA-Z_.]+">
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class="fa fa-envelope" aria-hidden="true"></i>
                            </span>
                        </div>

                        <div class="wrap-input100 validate-input" data-validate = "Password is required">
                            <input class="input100" type="password" name="pass" placeholder="Password" required>
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class="fa fa-lock" aria-hidden="true"></i>
                            </span>
                        </div>
                        
                        <div class="wrap-input100 validate-input" data-validate = "Password is required">
                            <input class="input100" type="password" name="repass" placeholder="Re-Password" required>
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class="fa fa-lock" aria-hidden="true"></i>
                            </span>
                        </div>

                        <div class="container-login100-form-btn">
                            <button class="login100-form-btn" type="submit">
                                Register
                            </button>
                        </div>

                        <div class="text-center p-t-80">
                            <a class="txt2" href="login">
                                Continuous login
                                <i class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
                            </a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
                        
                        
        <script >
            $('.js-tilt').tilt({
                scale: 1.1
            })
        </script>
        <!--===============================================================================================-->
        <script src="assets/js/main.js"></script>

    </body>
</html>

