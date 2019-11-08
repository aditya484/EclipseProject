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

<a href="demo">Click here to get the Application Details</a>
 <c:choose>
<c:when test="${not empty appOwner}">

<table>
<tr>
<td>Servlet Owner:</td><td>${servletOwner}</td>
</tr>
<tr>
<td>Application Owner:</td><td>${appOwner}</td>
</tr>

</table>

</c:when>
</c:choose>

</body>
</html>