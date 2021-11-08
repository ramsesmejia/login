<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Renovar Contraseņa</title>
</head>
<body>
	
	<h2>Renovar contraseņa</h2>
	
	<form:form action="renovarContrasena" method="post" modelAttribute="usuario">
		<form:label path="password">Nueva Contraseņa*</form:label>
		<form:password id="password" path="password" name="password"
			maxlength="8" />
		<form:button>Renovar</form:button>
	</form:form>

</body>
</html>