package com.hiperdino.utilidades;

import java.util.Random;

public class GeneradorAleatorio {

    public String getNombre() {
        return generarNombre();
    }
    public String getProducto() {
        return generarProducto();
    }
    private static final String[] productos = {"Leche", "Pan", "Huevos", "Arroz", "Fideos", "Carne", "Pollo", "Pescado", "Manzanas", "Plátanos", "Naranjas", "Lechuga"};
    private static final Random random = new Random();

    public static String generarProducto() {
        return productos[random.nextInt(productos.length)];
    }

    private static final String[] nombres = {"Ana", "Juan", "María", "Pedro", "Lucía", "Carlos", "Elena", "Pablo", "Carmen", "Jorge", "Luisa", "José", "Isabel", "David", "Laura", "Marta", "Fernando", "Miguel", "Raquel", "Sara"};


    public static String generarNombre() {
        return nombres[random.nextInt(nombres.length)];
    }

    public int veces() {
            return random.nextInt(12) + 1;
    }
}
