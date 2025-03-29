<%-- 
    Document   : registrarAdmin
    Created on : 29/03/2025, 10:19:31 a. m.
    Author     : ESTUDIANTE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<form action="registrarAdministrador" method="post">
    <label>Nombre:</label>
    <input type="text" name="nombre" required>

    <label>Apellido:</label>
    <input type="text" name="apellido" required>

    <label>Correo:</label>
    <input type="email" name="correo" required>

    <label>Contraseña:</label>
    <input type="password" name="contrasena" required>

    <label>Cargo:</label>
    <input type="text" name="cargo" required>

    <button type="submit">Registrar Administrador</button>
</form>
