/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipsmascotas.repositorio;

import com.ipsmascotas.accesodatos.Bd;
import com.ipsmascotas.persistencia.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class UsuarioRepositorio {
    
    static final String DB_URL = "jdbc:postgresql://localhost:5432/ipsmascotas";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "farit_4";

    public UsuarioRepositorio() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    
        public void saveUsuario(Usuario usuario){
        String sql = "INSERT INTO usuarios(nombre, apellido, correo, contrasena)VALUES (?, ?, ?, ?)";
        
        try {
            Bd condb = new Bd(DB_URL, DB_USER, DB_PASSWORD);
            Connection conn = condb.getConn();
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getApellido());
            stmt.setString(3, usuario.getCorreo());
            stmt.setString(4, usuario.getContrasena());
            int filasAfectadas = stmt.executeUpdate();
            if(filasAfectadas > 0){
                System.out.println("Usuario registrado");
            }
            
            
            stmt.close();
            conn.close();   
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println(" "+e.getMessage());
        }
    }
    
    public List<Usuario> findAllUsers() {
        List<Usuario> lista=new LinkedList<>();
        String sql = "SELECT * FROM usuarios ";
         try{
            Bd conbd=new Bd(DB_URL, DB_USER, DB_PASSWORD);
            Connection conn=conbd.getConn();
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String nombre= rs.getString("nombre");
                String apellido= rs.getString("apellido");
                String mail=rs.getString("correo");
                String contraseña= rs.getString("contrasena");
                Usuario us = new Usuario(nombre, apellido, mail, contraseña);
                lista.add(us);
            }
            st.close();
            rs.close();
            conn.close();
            
         }catch (Exception e) {
            e.printStackTrace();
            System.out.println(" "+e.getMessage());
        }
         return lista;
    }
    
    public Usuario autenticarUsuario(String correo, String contrasena) {
    String sql = "SELECT * FROM usuarios WHERE correo = ? AND contrasena = ?";
    Usuario usuario = null;
    
    try {
        Bd condb = new Bd(DB_URL, DB_USER, DB_PASSWORD);
        Connection conn = condb.getConn();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, correo);
        stmt.setString(2, contrasena);
        ResultSet rs = stmt.executeQuery();
        
        if (rs.next()) {
            usuario = new Usuario(
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("correo"),
                rs.getString("contrasena")
            );
        }
        
        rs.close();
        stmt.close();
        conn.close();
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    return usuario;
}

    
}