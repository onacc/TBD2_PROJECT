/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tbd2proyecto;;

/**
 *
 * @author gcano
 */
public class Propietario {
    int id;
    String nombre;

    public Propietario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Propietario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
