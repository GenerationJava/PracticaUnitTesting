package com.generation;

import java.util.HashMap;
import java.util.Map;

public class Compra {

    //Lista no ordenada de productos con su cantidad
    private Map<Producto, Integer> cantidadProductos = new HashMap<>();

    //Método para agregar producto a la compra
    public void agregarProducto(Producto producto, int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }
        cantidadProductos.put(producto, cantidadProductos.getOrDefault(producto, 0) + cantidad);
    }
    
    public Map<Producto, Integer> getCantidadProductos() {
        return cantidadProductos;
    }
}
