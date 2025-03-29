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
class PQR {
    private int id;
    private String asunto;
    private String descripcion;
    private Date fechaEnvio;
    private String estado;
    private Cliente cliente;
    
    public PQR(int id, String asunto, String descripcion, Date fechaEnvio, String estado, Cliente cliente) {
        this.id = id;
        this.asunto = asunto;
        this.descripcion = descripcion;
        this.fechaEnvio = fechaEnvio;
        this.estado = estado;
        this.cliente = cliente;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the asunto
     */
    public String getAsunto() {
        return asunto;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the fechaEnvio
     */
    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }
    
    
}