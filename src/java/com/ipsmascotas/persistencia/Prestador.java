/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipsmascotas.persistencia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class Prestador extends Cliente {
    private String tipo;
    private String nit;
    private String descripcion;
    private List<Servicio> servicios;

    public Prestador(int id, String nombre, String apellido, String correo, String contrasena, boolean confirmacion, Date fechaRegistro, String tipo, String nit, String descripcion) {
        super(id, nombre, apellido, correo, contrasena, confirmacion, fechaRegistro);
        this.tipo = tipo;
        this.nit = nit;
        this.descripcion = descripcion;
        this.servicios = new ArrayList<>();
    }
    
    public void agregarServicio(Servicio servicio) {
        this.servicios.add(servicio);
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the servicios
     */
    public List<Servicio> getServicios() {
        return servicios;
    }
    
    
}