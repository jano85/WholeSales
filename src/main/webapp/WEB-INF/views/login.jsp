<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

    <title>Wholesale</title>
    <jsp:include page="header.jsp"/>
</head>

<body class="bg-theme bg-theme1">

<jsp:include page="loader.jsp"/>

<!-- Start wrapper-->
<div id="wrapper">

    <div class="loader-wrapper">
        <div class="lds-ring">
            <div></div>
            <div></div>
            <div></div>
            <div></div>
        </div>
    </div>
    <div class="card card-authentication1 mx-auto my-5">
        <div class="card-body">
            <div class="card-content p-2">
                <div class="text-center">
                    <img src="assets/images/logo-icon.png" alt="logo icon"/>
                </div>
                <div class="card-title text-uppercase text-center py-3">Login</div>
                <form:form action="signIn" method="post" modelAttribute="user">
                    <div class="form-group">
                        <form:label path="username" class="sr-only"> Username </form:label>
                        <div class="position-relative has-icon-right">
                            <form:input path="username" id="exampleInputUsername" class="form-control input-shadow"
                                        placeholder="Enter Username"/>
                            <div class="form-control-position">
                                <i class="icon-user"></i>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">

                        <form:label path="password" class="sr-only"> Password </form:label>
                        <div class="position-relative has-icon-right">
                            <form:input path="password" id="exampleInputPassword" class="form-control input-shadow"
                                        placeholder="Enter Password"/>
                            <div class="form-control-position">
                                <i class="icon-lock"></i>
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-6">
                            <div class="icheck-material-white">
                                <form:checkbox path="remember" id="user-checkbox"/>
                                <form:label path="remember" class="sr-only"> Remember me </form:label>
                            </div>
                        </div>
                        <div class="form-group col-6 text-right">
                            <a href="/resetPassword">Reset Password</a>
                        </div>
                    </div>
                    <form:button class="btn btn-light btn-block">Sign In</form:button>


                </form:form>
            </div>
        </div>
        <div class="card-footer text-center py-3">
            <p class="text-warning mb-0">Do not have an account? <a href="/register"> Sign Up here</a></p>
        </div>
    </div>

    <!--Start Back To Top Button-->
    <a href="#" class="back-to-top"><i class="fa fa-angle-double-up"></i> </a>
    <!--End Back To Top Button-->


</div><!--wrapper-->

<jsp:include page="footScript.jsp"/>

</body>
</html>
