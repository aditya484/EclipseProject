<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${title}</title>
</head>
<body>

<h2>${headerMessage}</h2>

<a href="/Benefits/">Home Page</a>

<table>
<tr><td>Employee Number:</td><td>${user.empNum}</td></tr>
<tr><td>First Name  :</td><td>${user.firstName}</td></tr>
<tr><td>Last Name  :</td><td>${user.lastName}</td></tr>
<tr><td>Date of Birth:</td><td>${user.dob}</td></tr>
<tr><td>Sex:</td><td>${user.sex}</td></tr>
<tr><td>National Identifier:</td><td>${user.nationalIdentifier}</td></tr>
<tr><td>Email Address:</td><td>${user.email}</td></tr>
<tr><td>Business Group:</td><td>${user.bgId}</td></tr>
</table>

</body>
</html>