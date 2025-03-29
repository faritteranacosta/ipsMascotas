/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipsmascotas.persistencia;

/**
 *
 * @author ESTUDIANTE
 */
class Direccion {
    private int id;
    private String ciudad;
    private String codigoPostal;
    
    public Direccion(int id, String ciudad, String codigoPostal) {
        this.id = id;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @return the codigoPostal
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }
    
    
}