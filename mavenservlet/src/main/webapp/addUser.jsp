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

<form action="user" method="post">

<input type="hidden" name="source" value="addUser"/>

<table>
<tr>
<td>Username</td><td><input type = "text" name="userName"/></td>
</tr>

<tr>
<td>Email Address</td><td><input type = "text" name="emailAddress"/></td>
</tr>

<tr>
<td>Phone Number</td><td><input type = "text" name="phoneNumber"/></td>
</tr>

<tr>
<td>City</td><td><input type = "text" name="city"/></td>
</tr>

<tr>
<td>State</td><td><input type = "text" name="state"/></td>
</tr>

<tr>
<td>Country</td><td><input type = "text" name="country"/></td>
</tr>

<tr>
<td>Zip Code</td><td><input type = "text" name="zipcode"/></td>
</tr>

<tr>
<td colspan="2" align="center"><input type = "submit" value="Submit"/></td>
</tr>

</table>

</form> 

</body>
</html>