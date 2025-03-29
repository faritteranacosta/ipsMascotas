/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipsmascotas.persistencia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private boolean confirmacion;
    private List<Telefono> telefonos;

    public Usuario(String nombre, String apellido, String correo, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.telefonos = telefonos;
        this.telefonos = new ArrayList<>();
    }

    
    
    public Usuario(String nombre, String apellido, String correo, String contrasena, boolean confirmacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.confirmacion = confirmacion;
    }

    public void agregarTelefono(Telefono telefono) {
        this.telefonos.add(telefono);
    }
   
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @return the confirmacion
     */
    public boolean isConfirmacion() {
        return confirmacion;
    }

    /**
     * @return the telefonos
     */
    public List<Telefono> getTelefonos() {
        return telefonos;
    }
    
    
}
