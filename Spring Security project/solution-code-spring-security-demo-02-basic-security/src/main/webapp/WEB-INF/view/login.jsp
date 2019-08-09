<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login title here</title>


</head>
<body>
<c:if test="${param.error !=null }">
  wrong userid password
  </c:if>
  
  <form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="post">
 
username <input type="text" name="username" /><br>
password <input type="password" name="password" /><br>
       <input type="submit" value="login">
</form:form>
</body>
</html>