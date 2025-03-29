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
public class Dueño extends Cliente {
    private List<Mascota> mascotas;
    private List<Pago> pagos;
    private List<Reseña> resenas;

    public Dueño(int id, String nombre, String apellido, String correo, String contrasena, boolean confirmacion, Date fechaRegistro) {
        super(id, nombre, apellido, correo, contrasena, confirmacion, fechaRegistro);
        this.mascotas = new ArrayList<>();
        this.pagos = new ArrayList<>();
        this.resenas = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota) {
        this.getMascotas().add(mascota);
    }

    public void agregarPago(Pago pago) {
        this.getPagos().add(pago);
    }

    public void agregarResena(Reseña resena) {
        this.getResenas().add(resena);
    }

    /**
     * @return the mascotas
     */
    public List<Mascota> getMascotas() {
        return mascotas;
    }

    /**
     * @return the pagos
     */
    public List<Pago> getPagos() {
        return pagos;
    }

    /**
     * @return the resenas
     */
    public List<Reseña> getResenas() {
        return resenas;
    }
    
    
}