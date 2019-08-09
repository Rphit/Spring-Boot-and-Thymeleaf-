<%@page import="comm.example.springdemo.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Student Details</h2>

	<table border="1">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Country</th>
			<th>Favorite Language</th>
			<th>Operating System</th>
			<th colspan="2">Operations</th>
		</tr>
		<c:forEach var="std" items="${list}">
			<tr>
				<td>${std.id}</td>
				<td>${std.firstName}</td>
				<td>${std.lastName}</td>
				<td>${std.country}</td>
				<td>${std.favoriteLanguage}</td>
				<td>${std.operating}</td>

				<td><a href="delete/${std.id}">Delete</a></td>
				<td><a href="update/${std.id}">Update</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>