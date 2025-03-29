/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipsmascotas.persistencia;

/**
 *
 * @author ESTUDIANTE
 */
public class Telefono {
    private String numero;
    private String tipoTelefono;

    public Telefono(String numero, String tipoTelefono) {
        this.numero = numero;
        this.tipoTelefono = tipoTelefono;
    }

  
     /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @return the tipoTelefono
     */
    public String getTipoTelefono() {
        return tipoTelefono;
    }
   
}
