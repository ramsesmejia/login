<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
</head>
<body>

	<h2>Login</h2>
	
	<a href="alta">Alta de usuario</a>

	<form:form action="login" method="post" modelAttribute="usuario">
		<form:label path="nombre">Nombre*</form:label>
		<form:input path="nombre" name="nombre" id="nombre" maxlength="50" />
		<form:label path="password">Contraseña*</form:label>
		<form:password id="password" name="password" path="password" maxlength="8" />
		<form:button>Login</form:button>
	</form:form>


</body>
</html>