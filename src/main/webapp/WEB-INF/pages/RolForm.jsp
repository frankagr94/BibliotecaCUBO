<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Agregar/Editar Roles</title>
</head>
<body>
    <div align="center">
        <h1>Agregar/Editar Rol</h1>
        <h5>Volver a la Pagina Principal <a href="principal">Aquí</a></h5>
        <form:form action="saveRol" method="post" modelAttribute="rol">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>Nombre:</td>
                <td><form:input path="nombre" /></td>
            </tr>
            <tr>
                <td>Estatus:</td>
                <td><form:input path="estatus" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Guardar"></td>
            </tr>
        </table>
        </form:form>
        <h4>
            Regresar a Lista de Roles <a href="rol">Aquí</a>
        </h4>
    </div>
</body>
</html>