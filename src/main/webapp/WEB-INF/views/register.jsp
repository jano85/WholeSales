<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Register</title>
	<jsp:include page="header.jsp"/>
</head>
<body class="bg-theme bg-theme1">

<jsp:include page="loader.jsp"/>

<!-- Start wrapper-->
 <div id="wrapper">

	<div class="card card-authentication1 mx-auto my-4">
		<div class="card-body">
		 <div class="card-content p-2">
		 	<div class="text-center">
		 		<img src="assets/images/logo-icon.png" alt="logo icon">
		 	</div>
		  <div class="card-title text-uppercase text-center py-3">Sign Up</div>

				<form:form action="registerUser" method="post" modelAttribute="user">
			  <div class="form-group">
			  <label for="exampleInputName" class="sr-only">Name</label>
			   <div class="position-relative has-icon-right">
				   <form:input  path="name" id="exampleInputName" class="form-control input-shadow" placeholder="Enter Your Name"/>
				  <div class="form-control-position">
					  <i class="icon-user"></i>
				  </div>
			   </div>
			  </div>
			  <div class="form-group">
			  <label for="exampleInputEmailId" class="sr-only">Email ID</label>
			   <div class="position-relative has-icon-right">
				  <form:input path="email" id="exampleInputEmailId" class="form-control input-shadow" placeholder="Enter Your Email ID"/>
				  <div class="form-control-position">
					  <i class="icon-envelope-open"></i>
				  </div>
			   </div>
			  </div>
			  <div class="form-group">
			   <label for="exampleInputPassword" class="sr-only">Password</label>
			   <div class="position-relative has-icon-right">
				  <form:input  path="password" id="exampleInputPassword" class="form-control input-shadow" placeholder="Choose Password"/>
				  <div class="form-control-position">
					  <i class="icon-lock"></i>
				  </div>
			   </div>
			  </div>

			   <div class="form-group">
			     <div class="icheck-material-white">
                   <form:checkbox path="agree" id="user-checkbox" checked="" />
                   <label for="user-checkbox">I Agree With Terms & Conditions</label>
			     </div>
			    </div>

			 <form:button class="btn btn-light btn-block waves-effect waves-light">Register</form:button>

			 </form:form>
		   </div>
		  </div>
		  <div class="card-footer text-center py-3">
		    <p class="text-warning mb-0">Already have an account? <a href="/login"> Login here</a></p>
		  </div>
	     </div>

	</div><!--wrapper-->

<jsp:include page="footScript.jsp"/>
  <!-- Custom scripts -->
  <script src="assets/js/app-script.js"></script>

</body>
</html>
