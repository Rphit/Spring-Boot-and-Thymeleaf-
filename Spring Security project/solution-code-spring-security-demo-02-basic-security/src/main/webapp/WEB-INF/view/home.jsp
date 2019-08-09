 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>

<head>
	<title>luv2code Company Home Page</title>
</head>

<body>
	<h2>luv2code Company Home Page</h2>
	<hr>
	<p> in java class login ID and password is given </p>
	Welcome to the luv2code company home page!


<form:form action="${pageContext.request.contextPath}/logout" method="post">

  <input type="submit" value="logout">
</form:form>
</body>

</html>