<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Administracion de Roles</title>
</head>
<body>
	<div align="center">
		<h1>Lista de Roles</h1>
		<h5>Volver a la Pagina Principal <a href="principal">Aquí</a></h5>
		<table border="1">

			<th>ID</th>
			<th>Nombre</th>
			<th>Estatus</th>
                        <th>Opcion</th>

			<c:forEach var="rol" items="${listRol}">
				<tr>

					<td>${rol.id}</td>
					<td>${rol.nombre}</td>
					<td>${rol.estatus}</td>
					<td><a href="editRol?id=${rol.id}">Editar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteRol?id=${rol.id}">Borrar</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			Registrar Nuevo Rol <a href="newRol">Aquí</a>
		</h4>
	</div>
</body>
</html>