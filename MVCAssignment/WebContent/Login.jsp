<%@page import="com.dto.User"%>
<%@page import="com.service.UserServiceImplementation"%>
<%@page import="com.service.UserService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" >
<title>Login here</title>
</head>
<body>
<h5 style="color: red;font-size: 15;text-align: center;" >
	<%=(request.getParameter("errorMessage")!=null)? request.getParameter("errorMessage"):" " %>
</h5>	
<form action="Validate.jsp" method="post">

  <div class="form-group">
    <label for="exampleInputEmail1">Username</label>
    <input type="text" name="userName" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" name="userPassword" class="form-control" id="exampleInputPassword1">
  </div>
  <button type="submit" class="btn btn-primary">Login</button> 
  <a href="RegistrationForm.jsp" class="btn btn-secondary">Register</a>
  
</form>


</body>
</html>