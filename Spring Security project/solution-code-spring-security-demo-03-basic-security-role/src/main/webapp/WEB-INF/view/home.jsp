 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<html>

<head>
	<title>luv2code Company Home Page</title>
</head>

<body>
	<h2>luv2code Company Home Page</h2>
	<hr>
	<p> well come </p>
	Welcome to the luv2code company home page!<br><b></b>
	
	user: <security:authentication property="principal.username"/><br><b>
	role: <security:authentication property="principal.authorities"/><br><b>
	
<a href="${pageContext.request.contextPath}/systems">Admins list</a><br><b>
<a href="${pageContext.request.contextPath}/managers">Managers list</a><br><b>

<form:form action="${pageContext.request.contextPath}/logout" method="post">

  <input type="submit" value="logout">
</form:form>
</body>

</html>