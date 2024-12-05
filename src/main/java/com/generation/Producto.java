package com.generation;

public class Producto {

    //Atributos
    private String nombre;
    private double precio;
    private int stock;

    //Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    //Método que reduce el stock de un producto, dependiendo de la cantidad de unidades que se pidan
    public void disminuirStock(int cantidad) {
        if (cantidad > stock) {
            throw new IllegalArgumentException("Stock Insuficiente");
        }
        this.stock -= cantidad;
    }
}
