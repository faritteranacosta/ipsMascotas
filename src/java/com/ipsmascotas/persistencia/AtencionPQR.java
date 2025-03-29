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
class AtencionPQR {
    private int id;
    private PQR pqr;
    private String respuesta;
    private Date fechaAtencion;
    private String estado;
    
    public AtencionPQR(int id, PQR pqr, String respuesta, Date fechaAtencion, String estado) {
        this.id = id;
        this.pqr = pqr;
        this.respuesta = respuesta;
        this.fechaAtencion = fechaAtencion;
        this.estado = estado;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the pqr
     */
    public PQR getPqr() {
        return pqr;
    }

    /**
     * @return the respuesta
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * @return the fechaAtencion
     */
    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }
    
    
}