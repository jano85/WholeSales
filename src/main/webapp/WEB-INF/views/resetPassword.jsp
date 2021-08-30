<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Reset</title>
    <jsp:include page="header.jsp"/>
</head>
<body class="bg-theme bg-theme1">

<jsp:include page="loader.jsp"/>


<!-- Start wrapper-->
<div id="wrapper">

    <div class="height-100v d-flex align-items-center justify-content-center">
        <div class="card card-authentication1 mb-0">
            <div class="card-body">
                <div class="card-content p-2">
                    <div class="card-title text-uppercase pb-2">Reset Password</div>
                    <p class="pb-2">Please enter your email address. You will receive a link to create a new password
                        via email.</p>
                    <form:form action="resetPass" method="post" modelAttribute="user">
                        <div class="form-group">
                            <label for="exampleInputEmailAddress" class="">Email Address</label>
                            <div class="position-relative has-icon-right">
                                <form:input path="email" id="exampleInputEmailAddress" class="form-control input-shadow"
                                            placeholder="Email Address"/>
                                <div class="form-control-position">
                                    <i class="icon-envelope-open"></i>
                                </div>
                            </div>
                        </div>

                        <form:button class="btn btn-light btn-block mt-3">Reset Password</form:button>
                    </form:form>
                </div>
            </div>
            <div class="card-footer text-center py-3">
                <p class="text-warning mb-0">Return to the <a href="login"> Sign In</a></p>
            </div>
        </div>
    </div>


</div><!--wrapper-->

<jsp:include page="footScript.jsp"/>

</body>
</html>
