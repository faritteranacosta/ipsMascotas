/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipsmascotas.persistencia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class AtencionAlCliente extends Usuario {
    private List<AtencionPQR> atenciones;

    public AtencionAlCliente(int id, String nombre, String apellido, String correo, String contrasena, boolean confirmacion) {
        super(nombre, apellido, correo, contrasena);
        this.atenciones = new ArrayList<>();
    }
}