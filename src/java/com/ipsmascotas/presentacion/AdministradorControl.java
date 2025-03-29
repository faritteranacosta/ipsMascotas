/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipsmascotas.presentacion;

import com.ipsmascotas.persistencia.Administrador;
import com.ipsmascotas.repositorio.UsuarioRepositorio;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ESTUDIANTE
 */
public class AdministradorControl extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String correo = request.getParameter("correo");
        String contrasena = request.getParameter("contrasena");
        String cargo = request.getParameter("cargo");

        Administrador admin = new Administrador(nombre, apellido, correo, contrasena, cargo);
        UsuarioRepositorio ur = new UsuarioRepositorio();

        boolean exito = ur.registrarAdministrador(admin);

        if (exito) {
            request.setAttribute("Mensaje", "El administrador se registró correctamente");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } else {
            request.setAttribute("Mensaje", "Error en el registro");
            request.getRequestDispatcher("/registrarAdmin.jsp").forward(request, response);
        }
    }
}
