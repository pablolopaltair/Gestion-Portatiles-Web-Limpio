<%@ include file="/vistas/cabecera.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Portatil</title>
</head>
<body>
<h1>Inserci�n de un nuevo Portatil</h1>
<hr>
    <form:form method="POST" 
          action="guardarPortatil" modelAttribute="ordenadorInsertado">
             <table>
                <tr>
                    <td><form:label path="marca">Marca</form:label></td>
                    <td><form:input path="marca"/></td>
                </tr>
                <tr>
                    <td><form:label path="modelo">Modelo</form:label></td>
                    <td><form:input path="modelo"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Guardar"/></td>
                </tr>
            </table>
        </form:form> 
        <p>Mensaje del controlador: <c:out value="${miModelo.mensaje}"/></p>  

</body>
</html>