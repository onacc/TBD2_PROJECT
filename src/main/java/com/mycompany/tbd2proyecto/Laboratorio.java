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
public class Laboratorio {
    int id;
    String direccion ,contact,nombre;

    public Laboratorio(int id, String direccion, String contact, String nombre) {
        this.id = id;
        this.direccion = direccion;
        this.contact = contact;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Laboratorio(int id, String direccion, String contact, String nombre, ArrayList<Producto> productos) {
        this.id = id;
        this.direccion = direccion;
        this.contact = contact;
        this.nombre = nombre;
        this.productos = productos;
    }
    ArrayList<Producto> productos;

    public Laboratorio(int id, String direccion, String contact) {
        this.id = id;
        this.direccion = direccion;
        this.contact = contact;
    }

    public Laboratorio(int id, String direccion, String contact, ArrayList<Producto> productos) {
        this.id = id;
        this.direccion = direccion;
        this.contact = contact;
        this.productos = productos;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    
}
