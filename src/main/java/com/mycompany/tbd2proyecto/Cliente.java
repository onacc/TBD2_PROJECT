/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tbd2proyecto;

import java.util.ArrayList;

/**
 *
 * @author gcano
 */
public class Cliente {
    String nombre;
    int id;
    ArrayList<Producto> inventario;

    public Cliente() {
    }

    public Cliente(String nombre, int id, ArrayList<Producto> inventario) {
        this.nombre = nombre;
        this.id = id;
        this.inventario = inventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Producto> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Producto> inventario) {
        this.inventario = inventario;
    }
}
