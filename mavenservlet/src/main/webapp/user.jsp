<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo Page</title>
</head>
<body>

<h1> Hello World..!!</h1>

<table>
<tr>
<td><a href="demo">Click here to get the Application Details</a></td>

<c:choose>
<c:when test="${not empty appOwner}">

<td>Servlet Owner:</td><td>${servletOwner}</td>
<td>Application Owner:</td><td>${appOwner}</td>
</tr>

<tr><td><a href="addUser">Click to register</a></td></tr>
<tr><td><a href="listUsers">List all Registered Users</a></td></tr>

</table>

</c:when>
</c:choose>

</body>
</html>