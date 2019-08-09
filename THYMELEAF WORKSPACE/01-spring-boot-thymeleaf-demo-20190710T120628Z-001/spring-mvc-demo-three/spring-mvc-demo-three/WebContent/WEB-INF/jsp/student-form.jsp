<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
class{
	.error={color='red'}
}
</style>
</head>
<body>
<h2>student form</h2>
<form:form action="save" method="post" modelAttribute="student">
First name:<form:input path="firstName" />

<br/>
Last name:<form:input path="lastName" /><br/>
Country:
<form:select path="country">
<form:options items="${student.countries}"/>
</form:select><br/>
Favorite language:
<form:radiobutton path="favoriteLanguage" value="C#" label="C#"/>
<form:radiobutton path="favoriteLanguage" value="Ruby" label="Ruby"/>
<form:radiobutton path="favoriteLanguage" value="Python" label="Python"/>
<form:radiobutton path="favoriteLanguage" value="Java" label="Java"/><br/>
Operating systems:
<form:checkbox path="operatingSystems" label="Windows" value="Windows" />
<form:checkbox path="operatingSystems" label="Linux" value="Linux"/>
<form:checkbox path="operatingSystems" label="Mac OS" value="Mac OS"/>
<form:checkbox path="operatingSystems" label="Android" value="Android"/>
<input type="submit">
</form:form>

</body>
</html>