<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot-Password</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<form class="form-horizontal" action="forgotPasswordSubmit.do" method="post">
	<div class="container d-flex flex-column">
		<div class="row align-items-center justify-content-center g-0 min-vh-100">
			<div class="col-lg-5 col-md-8 py-8 py-xl-0">
				<!-- Card -->
				<div class="card shadow">
					<!-- Card body -->
					<div class="card-body p-6">
						<div class="mb-4">
							
							<h1 class="mb-1 fw-bold">Forgot Password</h1>
							
						</div>
							<!-- Form -->
						<form>
								<!-- Email -->
							<div class="mb-3">
								<label for="email" class="form-label">Email</label>
								<input type="email" id="email" class="form-control" name="email" placeholder="Enter Your Email "
									required />
							</div>
								<!-- Button -->
							<div class="mb-3 d-grid">
								<button type="submit" class="btn btn-primary">
									Submit
								</button>
							</div>
							<span>Return to <a href="welcome.jsp">sign in</a></span>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	</form>
</body>
</html>