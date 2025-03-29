<%-- 
    Document   : register
    Created on : 28/03/2025, 4:05:58 p. m.
    Author     : ESTUDIANTE
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registrar Usuario</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f7f6;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .form-container {
            background-color: #ffffff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 20px;
            width: 100%;
            max-width: 400px;
            text-align: center;
        }
        h2 {
            color: #333;
        }
        label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
            color: #555;
            text-align: left;
        }
        input[type="text"],
        input[type="email"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-size: 16px;
        }
        input[type="submit"], .btn {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            text-decoration: none;
            display: inline-block;
            margin-top: 10px;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        .btn {
            background-color: #007BFF;
        }
        .btn:hover {
            background-color: #0056b3;
        }
        .mensaje {
            text-align: center;
            font-weight: bold;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Registrar Usuario</h2>
        
        <!-- Mostrar mensaje si existe -->
        <% String mensaje = request.getParameter("Mensaje"); %>
        <% if (mensaje != null) { %>
            <p class="mensaje" style="color: green;"><%= mensaje %></p>
        <% } %>

        <form action="Demo" method="post">
            <input type="hidden" value="registrar" id="ContUser" name="ContUser">
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre" required>
            
            <label for="apellido">Apellido:</label>
            <input type="text" id="apellido" name="apellido" required>

            <label for="correo">Correo:</label>
            <input type="email" id="correo" name="correo" required>
            
            <label for="contrasena">Contraseña:</label>
            <input type="password" id="contrasena" name="contrasena" required>
            
            <input type="submit" value="Registrarse">
        </form>
       
        <a href="login.jsp" class="btn">Ir a iniciar sesión</a>
        <a href="registrarAdmin.jsp" class="btn" style="background-color: #dc3545;">Registrar Administrador</a>
    </div>
</body>
</html>
