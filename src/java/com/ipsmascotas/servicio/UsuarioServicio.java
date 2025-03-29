/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipsmascotas.servicio;

import com.ipsmascotas.persistencia.Usuario;
import com.ipsmascotas.repositorio.UsuarioRepositorio;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class UsuarioServicio {
    private UsuarioRepositorio usr;

    public UsuarioServicio() {
        usr = new UsuarioRepositorio();
    }
    
    public void registerUsuario(Usuario usuario) {
        if(usuario != null && usuario.getNombre() != null){
            usr.saveUsuario(usuario);
        }else{
            throw new IllegalArgumentException("Los datos del usuario no son válidos");
        }
    }
    
    public List<Usuario> getAllUsers() {
        return usr.findAllUsers();
    }
    
}
