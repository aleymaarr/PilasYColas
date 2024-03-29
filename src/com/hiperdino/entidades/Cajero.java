package com.hiperdino.entidades;

import java.util.LinkedList;
import java.util.Queue;

public class Cajero {

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


    public void abrirCaja() {
        cajaAbierta = true;
        System.out.println("Caja abierta.");
    }


    public void cerrarCaja() {
        cajaAbierta = false;
        filaClientes.clear();
        System.out.println("Caja cerrada y cola de clientes vaciada.");
    }


    public boolean estadoCaja() {
        return cajaAbierta;
    }

    public void agregarClienteACola(Cliente cliente) {
        filaClientes.add(cliente);
    }



    public Cliente atenderCliente() {
        return filaClientes.poll();
    }

    public int getTotalClientes() {
        return filaClientes.size();
    }

    public void mostrarClientesPendientes() {
        if (!filaClientes.isEmpty()) {
            System.out.println("Clientes pendientes en la cola:");
            for (Cliente cliente : filaClientes) {
                System.out.println(cliente.getNombre());
            }
        } else {
            System.out.println("No hay clientes pendientes en la cola.");
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cajero\n");
        sb.append("===================================\n");
        sb.append("* Número de caja: ").append(numeroCaja).append("\n");
        sb.append("* Total de clientes: ").append(getTotalClientes()).append("\n");
        sb.append("* Clientes en la fila:\n");
        for (Cliente cliente : filaClientes) {
            sb.append(cliente.toString()).append("\n");
        }
        sb.append("===================================\n");
        return sb.toString();
    }

}
