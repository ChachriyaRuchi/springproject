<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>loginsucess</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
    function Validate() {
        var password = document.getElementById("txtPassword").value;
        var confirmPassword = document.getElementById("txtConfirmPassword").value;
        if (password != confirmPassword) {
            alert("Passwords do not match.");
            return false;
        }
        return true;
    }
</script>
</head>
<body>
<h1>Your Login is SuccessFul...</h1>

<div class="container">
	<div class="row">
		<div class="col-sm-4">
		<h2>If you want to change your password?</h2>
		   <form action="passwordChange.do" method="post"> 
		    <label>Current Password</label>
		    <div class="form-group pass_show"> 
                <input type="password" name="password" class="form-control" placeholder="Current Password"> 
            </div> 
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