<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<hr>
	<div class="container" align="center">
		<h1>Login</h1>
		<form action="login.do" method="post">
			<span>
				<label for="username">UserName </label>
				<input type="email" class="col-sm-2 col-form-label" name="email" ><br><br>
			</span>
			<span>
				<label for="password">Password</label> 
				<input type="password" class="col-sm-2 col-form-label" name="password"><br><br>
			</span>
			<span>
				<input type="submit" class="btn btn-primary" value="login">
					<a href="displayRegistration.do" class="btn btn-primary">signup</a><br><br>
				
				</span>
				<a href="forgotPassword.do" class="btn btn-link">Forgot Your Password?</a>
		</form>	
	</div>
	<div  class ="container-fluid text-center copyright" style="bottom: 0;position:fixed;">
        <p> &copy; 2022 Ruchi. All Rights Reserved </p>
      </div>
</body>
</html>