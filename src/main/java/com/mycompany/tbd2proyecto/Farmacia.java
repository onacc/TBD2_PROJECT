/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tbd2proyecto;;

import java.util.ArrayList;

/**
 *
 * @author gcano
 */
public class Farmacia {
    String nombre;
    int id;
    String direccion;
    ArrayList<Integer> Propietarios;
    ArrayList<Integer> Farmaceuticos;
    ArrayList<Producto> inventario;

    public Farmacia(String nombre, int id, String direccion, ArrayList<Integer> Propietarios, ArrayList<Integer> Farmaceuticos, ArrayList<Producto> inventario) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.Propietarios = Propietarios;
        this.Farmaceuticos = Farmaceuticos;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Integer> getPropietarios() {
        return Propietarios;
    }

    public void setPropietarios(ArrayList<Integer> Propietarios) {
        this.Propietarios = Propietarios;
    }

    public ArrayList<Integer> getFarmaceuticos() {
        return Farmaceuticos;
    }

    public void setFarmaceuticos(ArrayList<Integer> Farmaceuticos) {
        this.Farmaceuticos = Farmaceuticos;
    }

    public ArrayList<Producto> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Producto> inventario) {
        this.inventario = inventario;
    }

    
}
