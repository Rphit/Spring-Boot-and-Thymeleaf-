<%@page import="comm.example.springdemo.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello: ${student.firstName} ${student.lastName}<br/>
Country: ${student.country}<br/>
Favorite language:${student.favoriteLanguage}
<br/>
Operating Systems:
<c:forEach var="temp" items="${student.operatingSystems}">
${temp }
</c:forEach>



</body>
</html>