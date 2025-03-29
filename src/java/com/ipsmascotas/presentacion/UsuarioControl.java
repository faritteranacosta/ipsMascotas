/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipsmascotas.presentacion;

import com.ipsmascotas.persistencia.Usuario;
import com.ipsmascotas.servicio.UsuarioServicio;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
    
/**
 *
 * @author ESTUDIANTE
 */
public class UsuarioControl extends HttpServlet{
    private UsuarioServicio us = new UsuarioServicio();
    
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UsuarioServicio us = new UsuarioServicio();

        try {
            Usuario usuario = new Usuario(
                request.getParameter("nombre"),
                request.getParameter("apellido"),
                request.getParameter("correo"),
                request.getParameter("contrasena")
            );

            us.registerUsuario(usuario); // Guarda el usuario

            request.setAttribute("Mensaje", "El usuario se creó correctamente");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("Error", "Hubo un problema al crear el usuario");
            request.getRequestDispatcher("/registro.jsp").forward(request, response);
        }
    }
}
