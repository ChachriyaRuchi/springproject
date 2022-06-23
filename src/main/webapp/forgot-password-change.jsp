<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ForgotPasswordSuccess</title>
</head>
<body>
<h1>Change Password</h1>
<div class="container">
	<div class="row">
		<div class="col-sm-4">
		
		   <form action="changeForgotPassword.do" method="post"> 
		  
		       <label>New Password</label>
            <div class="form-group pass_show"> 
                <input type="password" name="newpassword" id="txtPassword" class="form-control" placeholder="New Password"> 
            </div> 
		       <label>Confirm Password</label>
            <div class="form-group pass_show"> 
                <input type="password" name="confirmpassword" id="txtConfirmPassword" class="form-control" placeholder="Confirm Password"><br> 
            </div> 
        		<div>
				<input type="submit" class="btn btn-primary" value="reset">
				</div>
            </form>
		</div>  
	</div>
</div>
</body>
</html>