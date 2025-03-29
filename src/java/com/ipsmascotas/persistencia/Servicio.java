/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipsmascotas.persistencia;

import java.util.Date;

/**
 *
 * @author ESTUDIANTE
 */
class Servicio {
    private int id;
    private String nombre;
    private String descripcion;
    private float costo;
    private Date fechaInicio;
    private Date fechaFin;
    private String ubicacion;
    private String estado;
    private Prestador prestador;
    
    public Servicio(int id, String nombre, String descripcion, float costo, Date fechaInicio, Date fechaFin, String ubicacion, String estado, Prestador prestador) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.prestador = prestador;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the costo
     */
    public float getCosto() {
        return costo;
    }

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @return the prestador
     */
    public Prestador getPrestador() {
        return prestador;
    }
    
    
}
