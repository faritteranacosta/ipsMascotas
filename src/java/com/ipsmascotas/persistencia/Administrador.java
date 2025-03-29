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
public class Administrador extends Usuario {
    private String cargo;
    private List<CategoriaDeServicio> categorias;

    public Administrador(int id, String nombre, String apellido, String correo, String contrasena, boolean confirmacion, String cargo) {
        super(nombre, apellido, correo, contrasena);
        this.cargo = cargo;
        this.categorias = new ArrayList<>();
    }

    public void agregarCategoria(CategoriaDeServicio categoria) {
        this.getCategorias().add(categoria);
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @return the categorias
     */
    public List<CategoriaDeServicio> getCategorias() {
        return categorias;
    }
    
    
}


