package com.hiperdino.entidades;

import java.util.LinkedList;
import java.util.Queue;

public class Cajero {

    private static int contadorCajas = 0;
    private final int numeroCaja;
    private final Queue<Cliente> filaClientes;
    private boolean cajaAbierta;

    private static int contadorCajas = 0;
    private final int numeroCaja;
    private final Queue<Cliente> filaClientes;
    private boolean cajaAbierta;

    public Cajero() {
        contadorCajas++;
        this.numeroCaja = contadorCajas;
        this.filaClientes = new LinkedList<>();
        this.cajaAbierta = false;
    }

    public Cajero() {
        contadorCajas++;
        this.numeroCaja = contadorCajas;
        this.filaClientes = new LinkedList<>();
        this.cajaAbierta = false;
    }


}
