/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipsmascotas.persistencia;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class Cliente extends Usuario {
    private Date fechaRegistro;
    private List<Direccion> direcciones;
    private List<PQR> pqrs;

    public Cliente(int id, String nombre, String apellido, String correo, String contrasena, boolean confirmacion, Date fechaRegistro) {
        super(nombre, apellido, correo, contrasena);
        this.fechaRegistro = fechaRegistro;
        this.direcciones = new ArrayList<>();
        this.pqrs = new ArrayList<>();
    }

    public void agregarPQR(PQR pqr){
        this.pqrs.add(pqr);
    }
    
    public void agregarDireccion(Direccion direccion) {
        this.direcciones.add(direccion);
    }   

    /**
     * @return the fechaRegistro
     */
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @return the direcciones
     */
    public List<Direccion> getDirecciones() {
        return direcciones;
    }
    
    
}