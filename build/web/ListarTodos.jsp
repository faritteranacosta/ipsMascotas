<%-- 
    Document   : listarTodos
    Created on : 28/03/2025, 4:49:28 p. m.
    Author     : ESTUDIANTE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listar todos</h1>
        <%
            String mensaje = (String) request.getAttribute("mensaje");
            if (mensaje != null) {
        %>
            <div class="message"><%= mensaje %></div>
        <%
            }
        %>
        
        
        <form action="Demo" method="POST">
            <input type="submit" value="listar">
            <input type="hidden" value="listar" id="ContUser" name="ContUser">
        </form>
    </body>
</html>