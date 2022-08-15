<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Hola Mundo </p>
	
	<!-- Esto, lo que hace es tomar la clave o variable saludo desde el modelo de Spring que utilizamos en cada
	uno de los métodos del controlador.  -->
	<c:out value="${saludo}" />
</body>
