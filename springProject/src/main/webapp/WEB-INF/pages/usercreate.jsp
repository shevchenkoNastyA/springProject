<%--
  Created by IntelliJ IDEA.
  User: Nastya
  Date: 17.11.2014
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<h1>Create user</h1>
<c:url var="saveUrl" value="/user/save.htm" />
<form:form modelAttribute="userAttribute" method="POST" action="${saveUrl}">
    User:
    <form:input path="name"></form:input>
    <input type="submit" value="Save" />
</form:form>
</body>
</html>
