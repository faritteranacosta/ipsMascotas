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
public class ServicioPrestado {
    private int id;
    private Servicio servicio;
    private Pago pago; // Composición: el pago es parte integral de ServicioPrestado
    private Mascota mascota;
    private Date fechaInicio;
    private Date fechaFinal;
    private String estado;
    private List<Reseña> resenas;

    public ServicioPrestado(int id, Servicio servicio, Mascota mascota, Date fechaInicio, Date fechaFinal, String estado) {
        this.id = id;
        this.servicio = servicio;
        this.mascota = mascota;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
        this.resenas = new ArrayList<>();
        this.pago = null; // Inicialmente sin pago
    }

    public void agregarResena(Reseña resena) {
        this.resenas.add(resena);
    }

    public void agregarPago(float monto, String metodoPago) {
        //
    }
}
