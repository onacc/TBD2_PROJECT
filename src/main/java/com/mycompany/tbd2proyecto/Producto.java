/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tbd2proyecto;;

/**
 *
 * @author gcano
 */
public class Producto {
    int id, unidades;
    double precio, coste;
    String nombre, fabricante, familia;

    public Producto(int id, int unidades, double coste, String nombre, String familia) {
        this.id = id;
        this.unidades = unidades;
        this.coste = coste;
        this.nombre = nombre;
        this.familia = familia;
    }

    public Producto(int id, int unidades, double precio, double coste, String nombre, String fabricante, String familia) {
        this.id = id;
        this.unidades = unidades;
        this.precio = precio;
        this.coste = coste;
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.familia = familia;
    }

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    @Override
    public String toString() {
        return "id=" + id + ", unidades=" + unidades + ", precio=" + precio + ", coste=" + coste + ", nombre=" + nombre + ", fabricante=" + fabricante + ", familia=" + familia ; 
    }
    
}
