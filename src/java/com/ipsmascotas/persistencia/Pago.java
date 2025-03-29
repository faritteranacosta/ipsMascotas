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
public class Pago {
    private int id;
    private float monto;
    private Date fechaPago;
    private String metodoPago;
    private String estado;

    public Pago(int id, float monto, Date fechaPago, String metodoPago, String estado) {
        this.id = id;
        this.monto = monto;
        this.fechaPago = fechaPago;
        this.metodoPago = metodoPago;
        this.estado = estado;
    }
    
    
}