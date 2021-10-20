<%-- 
    Document   : register
    Created on : Oct 19, 2021, 9:57:56 PM
    Author     : mevrthisbang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Register</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" >
        <script
            src="https://kit.fontawesome.com/64d58efce2.js"
        crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div class="register-box">
            <img src="img/avatar.png" class="avatar">
            <h1>REGISTER</h1>
            <div>
                <form action="MainController" method="POST">
                    Fullname<input type="input" class="normal" placeholder="Full Name" name="txtFullname" value="${param.txtFullname}"/><br>
                    <font color="red">${requestScope.INVALID.fullNameError}</font><br>
                    Email<input type="input" class="normal" placeholder="Enter Email" name="txtEmail" value="${param.txtEmail}"/><br>
                    <font color="red">${requestScope.INVALID.emailError}</font><br>
                    Phone<input type="input" class="normal" placeholder="Enter Phone" name="txtPhone" value="${param.txtPhone}"/><br>
                    <font color="red">${requestScope.INVALID.phoneError}</font><br>
                    Address<input type="input" class="normal" placeholder="Enter Address" name="txtAddress" value="${param.txtAddress}"/><br>
                    <font color="red">${requestScope.INVALID.addressError}</font><br>
                    Password<input type="password" class="normal" placeholder="Enter Password" name="txtPassword" value=""/><br>
                    <font color="red">${requestScope.INVALID.passwordError}</font><br>
                    Confirm Password<input type="password" class="normal" placeholder="Re-enter Password" name="txtConfirm" value=""/><br>
                    <font color="red">${requestScope.INVALID.confirmError}</font><br>
                    <input type="submit" class="btn" value="Register" name="action"/><br><br>
                        Already have account? <a href="loginFrom.jsp">Login</a>
                </form>
            </div>
        </div>

    </body>
</html>
