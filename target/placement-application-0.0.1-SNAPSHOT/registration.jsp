<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<hr>
<div class="container">
            <form class="form-horizontal" role="form" action="register.do" method="post">
                <h2>Registration</h2>
                <div class="form-group">
                    <label for="Name" class="col-sm-2 control-label">Name</label>
                    <div class="col-sm-9">
                        <input type="text" id="name" placeholder="Name" class="form-control" autofocus="autofocus" name="name">
                    </div>
                </div>
               
      
                <div class="form-group">
                    <label for="email" class="col-sm-2 control-label">Email</label>
                    <div class="col-sm-9">
                        <input type="email" id="email" placeholder="Email" class="form-control" name= "email">
                    </div>
                </div>
               
                <div class="form-group">
                    <label for="phoneNumber" class="col-sm-2 control-label">Phone number </label>
                    <div class="col-sm-9">
                        <input type="phoneNumber" id="phoneNumber" placeholder="Phone number" class="form-control" name="phonenumber">
                      
                    </div>
                </div>
              
                <div class="form-group">
                    <label class="control-label col-sm-2">Gender</label>
                    <div class="col-sm-6">
                        <div class="row">
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" id="femaleRadio" value="Female" name="female">Female
                                </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" id="maleRadio" value="Male" name="male">Male
                                </label>
                            </div>
                        </div>
                    </div>
                
                <button type="submit" class="btn btn-primary btn-block">Register</button>
            </form> <!-- /form -->
        </div> 
	<div  align="center" class ="container-fluid text-center copyright" style="bottom: 0;position:fixed;">
        <p> &copy; 2022 Ruchi. All Rights Reserved </p>
      </div>
</body>
</html>