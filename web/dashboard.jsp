<%-- 
    Document   : home
    Created on : 28/03/2025, 4:06:11 p. m.
    Author     : ESTUDIANTE
--%>

<%@page import="com.ipsmascotas.persistencia.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Usuario usuario = (Usuario) session.getAttribute("usuario");
    if (usuario == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Bienvenido</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 50px;
        }
        .logout {
            background: red;
            color: white;
            padding: 10px;
            text-decoration: none;
            border-radius: 5px;
        }
        .logout:hover {
            background: darkred;
        }
    </style>
</head>
<body>
    <h2>Bienvenido, <%= usuario.getNombre() %>!</h2>
    <p>Has iniciado sesión correctamente.</p>
    <a href="logout" class="logout">Cerrar Sesión</a>
</body>
</html>
