package com.generation;

import java.util.Map;

public class CompraService {

    public double calcularTotalCompra(Compra compra) {
        double total = 0;

        for (Map.Entry<Producto, Integer> entry : compra.getCantidadProductos().entrySet()) {
            Producto product = entry.getKey();
            int cantidad = entry.getValue();
            if (cantidad > product.getStock()) {
                throw new IllegalStateException("El producto: " + product.getNombre() + " no cuenta con suficiente stock");
            }
            total += product.getPrecio() * cantidad;
        }
        return total;
    }

    public void procesarCompra(Compra compra) {
        for (Map.Entry<Producto, Integer> entry : compra.getCantidadProductos().entrySet()) {
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();
            producto.disminuirStock(cantidad);
        }
    }
}
