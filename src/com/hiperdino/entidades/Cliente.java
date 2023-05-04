package com.hiperdino.entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private final String nombre;
    private final List<String> cestaCompra;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.cestaCompra = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }


    public void agregarProducto(String producto) {
        cestaCompra.add(producto);
    }


    public int getTotalProductos() {
        return cestaCompra.size();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===================================\n");
        sb.append("* Nombre: ").append(nombre).append("\n");
        sb.append("* Total de productos: ").append(getTotalProductos()).append("\n");
        sb.append("* Lista de artículos en la cesta:\n");
        for (String producto : cestaCompra) {
            sb.append(producto).append("\n");
        }
        return sb.toString();
    }

}
