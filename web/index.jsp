<%-- 
    Document   : index
    Created on : 25 Mar, 2016, 5:38:42 PM
    Author     : Rashmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MVC</title>
    </head>
    <body>
        <form action="control.jsp">
            <label>Name</label> <input type="text" name="name"><br>
            <label>Email id</label><input type="email" name="email"><br>
            <label>Contact</label> <input type="text" name="contact"><br>
            <label>Password</label><input type="password" name="pass"><br>
            <label>Confirm Password</label><input type="password" name="cpass"><br>
            <input type="submit" value="submit"><br>
            <input type="reset" value="reset"><br>
        </form>
    </body>
</html>
