<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<head>
    <title>Login Page</title>
</head>
<body>

<div class="container">
    <h2>Customer Login Page</h2>
    <f:form class="form-inline" action="/user/add" method="post" modelAttribute="userDetails">
        <div class="form-group">
            <label for="username">Username:</label>
            <input type="username" class="form-control" id="username" placeholder="Enter username name" name="username">
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" class="form-control" id="password" placeholder="Enter the password" name="password">
        </div>

        <div class="form-group">
            <label for="conformpassword">Conform Password:</label>
            <input type="conformpassword" class="form-control" id="conformpassword" placeholder="Enter the password" name="conformpassword">
        </div>

        <button type="submit" class="btn btn-default">Submit</button>
    </f:form>
</div>

</body>
</html>

