<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta</title>
</head>
<body>

	<h2>Registro</h2>

	<form:form action="altaUsuario" method="post" modelAttribute="usuario">
		<form:label path="nombre">Nombre*</form:label>
		<form:input path="nombre" id="nombre" name="nombre" maxlength="50" />
		<form:label path="password">Contraseña*</form:label>
		<form:password id="password" path="password" name="password" maxlength="8" />
		<form:button>Alta usuario</form:button>
	</form:form>
</body>
</html>