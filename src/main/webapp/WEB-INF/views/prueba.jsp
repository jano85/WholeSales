<%--
  Created by IntelliJ IDEA.
  User: jano1985
  Date: 04-12-20
  Time: 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>TEST</title>
</head>
<body>
prueba!
<br/>

<form:form  action="p2" method="post" modelAttribute="user">

    <form:label path="name" >Full name</form:label>
    <form:input path="name"/>
    <br/>


    <form:label path="email" > Email </form:label>
    <form:input path="email"/>
    <form:button>Registrar</form:button>
</form:form>
</body>
</html>
