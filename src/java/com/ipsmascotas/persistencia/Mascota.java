/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipsmascotas.persistencia;

import com.ipsmascotas.persistencia.Dueño;

/**
 *
 * @author ESTUDIANTE
 */
public class Mascota {
    private int id;
    private String nombre;
    private String raza;
    private float peso;
    private int edad;
    private String color;
    private TipoMascota tipoMascota;
    private Dueño dueño;

    public Mascota(int id, String nombre, String raza, float peso, int edad, String color, TipoMascota tipoMascota, Dueño dueno) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
        this.color = color;
        this.tipoMascota = tipoMascota;
        this.dueño = dueño;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the tipoMascota
     */
    public TipoMascota getTipoMascota() {
        return tipoMascota;
    }

    /**
     * @return the dueño
     */
    public Dueño getDueño() {
        return dueño;
    }
    
        
}