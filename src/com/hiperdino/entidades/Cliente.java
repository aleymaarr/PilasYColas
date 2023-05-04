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

    public String getNombre() {
        return nombre;
    }

    public void agregarProducto(String producto) {
        cestaCompra.add(producto);
    }

    public int getTotalProductos() {
        return cestaCompra.size();
    }


}
