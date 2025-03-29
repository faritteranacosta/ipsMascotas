/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipsmascotas.servicio;

import com.ipsmascotas.persistencia.Administrador;
import com.ipsmascotas.repositorio.UsuarioRepositorio;

/**
 *
 * @author ESTUDIANTE
 */
public class AdministradorServicio {
    private UsuarioRepositorio usr;

    public AdministradorServicio() {
        usr = new UsuarioRepositorio();
    }

    
    
    public void registerUsuario(Administrador admin) {
        if(admin != null && admin.getNombre() != null){
            usr.registrarAdministrador(admin);
        }else{
            throw new IllegalArgumentException("Los datos del usuario no son válidos");
        }
    }
    
}
