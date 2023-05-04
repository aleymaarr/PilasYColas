import com.hiperdino.entidades.Cajero;
import com.hiperdino.entidades.Cliente;
import com.hiperdino.utilidades.GeneradorAleatorio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cajero cajero = new Cajero();
        Cliente cliente;
        GeneradorAleatorio generadorAleatorio = new GeneradorAleatorio();
        Scanner scanner = new Scanner(System.in);

        String opcion = "";
        while (!opcion.equals("f")) {
            System.out.println("Seleccione una opción:");
            System.out.println("a - Abrir caja");
            System.out.println("b - Añadir un nuevo cliente a la cola");
            System.out.println("c - Atender un cliente");
            System.out.println("d - Ver clientes pendientes");
            System.out.println("e - Ver detalles de caja");
            System.out.println("f - Cerrar supermercado");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "a":
                    cajero.abrirCaja();
                    break;
                case "b":
                    if (cajero.estadoCaja()) {
                        cliente = new Cliente(generadorAleatorio.getNombre());
                        int veces = generadorAleatorio.veces();
                        for (int i = 0; i < veces; i++) {
                            cliente.agregarProducto(generadorAleatorio.getProducto());
                        }
                        cajero.agregarClienteACola(cliente);
                        System.out.println("Añadido un nuevo cliente a la cola.\n");
                    } else {
                        System.out.println("La caja está cerrada. No se puede añadir un cliente a la cola.\n");
                    }
                    break;
                case "c":
                    if (cajero.estadoCaja()) {
                        Cliente clienteAtendido = cajero.atenderCliente();
                        if (clienteAtendido != null) {
                            System.out.println("Cliente " + clienteAtendido.getNombre() + " atendido.\n");
                        } else {
                            System.out.println("No hay clientes para atender.\n");
                        }
                    } else {
                        System.out.println("La caja está cerrada. No se puede atender al cliente.\n");
                    }
                    break;
                case "d":
                    if (cajero.estadoCaja()) {
                        cajero.mostrarClientesPendientes();
                    } else {
                        System.out.println("La caja está cerrada. No se pueden mostrar los clientes pendientes.\n");
                    }
                    break;
                case "e":
                    System.out.println(cajero);
                    break;
                case "f":
                    cajero.cerrarCaja();
                    System.out.println("Supermercado cerrado");
                    break;
                default:
                    System.out.println("Opción no válida, por favor seleccione una opción válida.");
                    break;
            }
        }
    }
}
