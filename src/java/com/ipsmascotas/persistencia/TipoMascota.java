/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipsmascotas.persistencia;

/**
 *
 * @author ESTUDIANTE
 */
class TipoMascota {
    private int id;
    private String nombreTipo;
    private String descripcion;
    
    public TipoMascota(int id, String nombreTipo, String descripcion) {
        this.id = id;
        this.nombreTipo = nombreTipo;
        this.descripcion = descripcion;
    }
}