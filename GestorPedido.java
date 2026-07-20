package Gestores;
import Clases.*;
import java.util.ArrayList;
import java.util.Scanner;
public class GestorPedido {
    private Scanner scanner;
    private ArrayList<Almuerzo> almuerzos;
    private ArrayList<Pedido> pedidos;
    private Carrito carrito;
    private Usuario usuarioActual;
    private int contadorPedidos;
    public GestorPedido(ArrayList<Almuerzo> almuerzos,
                        ArrayList<Pedido> pedidos,
                        Usuario usuarioActual) {
        scanner = new Scanner(System.in);
        this.almuerzos = almuerzos;
        this.pedidos = pedidos;
        this.usuarioActual = usuarioActual;
        carrito = new Carrito();
        contadorPedidos = pedidos.size() + 1;
    }
    public void mostrarAlmuerzos() {
        if(almuerzos.isEmpty()) {
            System.out.println("No existen almuerzos registrados.");
        } else {
            System.out.println("\nALMUERZOS");
            for(Almuerzo almuerzo : almuerzos) {
                System.out.println(almuerzo);
            }
        }
    }
    public void agregarAlCarrito() {
        mostrarAlmuerzos();
        try {
            System.out.print("Ingrese codigo del almuerzo: ");
            int codigo = Integer.parseInt(scanner.nextLine());
            Almuerzo seleccionado = null;
            for(Almuerzo almuerzo : almuerzos) {
                if(almuerzo.getCodigo() == codigo) {
                    seleccionado = almuerzo;
                    break;
                }
            }
            if(seleccionado == null) {
                System.out.println("El almuerzo no existe.");
            } else {
                System.out.print("Ingrese cantidad: ");
                int cantidad = Integer.parseInt(scanner.nextLine());
                if(cantidad <= 0) {
                    System.out.println("La cantidad debe ser mayor a cero.");
                } else {
                    DetallePedido detalle = new DetallePedido(seleccionado, cantidad);
                    carrito.agregarAlmuerzo(detalle);
                    System.out.println("Producto agregado correctamente.");
                }
            }
        } catch(NumberFormatException e) {
            System.out.println("Ingrese datos numericos validos.");
        }
    }
    public void eliminarDelCarrito() {
        if(carrito.estaVacio()) {
            System.out.println("El carrito esta vacio.");
        } else {
            carrito.mostrarCarrito();
            try {
                System.out.print("Ingrese posicion del producto: ");
                int posicion = Integer.parseInt(scanner.nextLine());
                if(carrito.eliminarAlmuerzo(posicion)) {
                    System.out.println("Producto eliminado.");
                } else {
                    System.out.println("Posicion invalida.");
                }
            } catch(NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
            }
        }
    }
    public void mostrarCarrito() {
        carrito.mostrarCarrito();
    }
    public void confirmarPedido() {
        if(carrito.estaVacio()) {
            System.out.println("No puede realizar un pedido vacio.");
        } else {
            ArrayList<DetallePedido> detalles = new ArrayList<>(carrito.getDetalles());
            String codigo = "P" + contadorPedidos;
            contadorPedidos++;
            Pedido pedido = new Pedido(codigo,usuarioActual,detalles);
            pedidos.add(pedido);
            carrito.vaciarCarrito();
            System.out.println("Pedido realizado correctamente.");
            System.out.println("Codigo del pedido: " + codigo);
        }
    }
    public void mostrarMisPedidos() {
        boolean encontrado = false;
        for(Pedido pedido : pedidos) {
            if(pedido.getUsuario().getNombre().equals(usuarioActual.getNombre())) {
                System.out.println(pedido);
                encontrado = true;
            }
        }
        if(encontrado == false) {
            System.out.println("No tiene pedidos registrados.");
        }
    }
    public void mostrarPedidos() {
        if(pedidos.isEmpty()) {
            System.out.println("No existen pedidos.");
        } else {
            for(Pedido pedido : pedidos) {
                System.out.println(pedido);
            }
        }
    }
    public void cambiarEstadoPedido() {
        if(pedidos.isEmpty()) {
            System.out.println("No existen pedidos.");
        } else {
            System.out.print("Codigo del pedido: ");
            String codigo = scanner.nextLine();
            boolean encontrado = false;
            for(Pedido pedido : pedidos) {
                if(pedido.getCodigoPedido().equalsIgnoreCase(codigo)) {
                    encontrado = true;
                    System.out.println("1. Pendiente");
                    System.out.println("2. En preparacion");
                    System.out.println("3. Entregado");
                    try {
                        System.out.print("Nuevo estado: ");
                        int opcion =
                                Integer.parseInt(scanner.nextLine());
                        boolean cambiado = false;
                        switch(opcion) {
                            case 1:
                                pedido.setEstado("Pendiente");
                                cambiado = true;
                                break;
                            case 2:
                                pedido.setEstado("En preparacion");
                                cambiado = true;
                                break;
                            case 3:
                                pedido.setEstado("Entregado");
                                cambiado = true;
                                break;
                            default:
                                System.out.println("Opcion invalida.");
                                break;
                        }
                        if(cambiado == true) {
                            System.out.println("Estado actualizado.");
                        }
                    } catch(NumberFormatException e) {
                        System.out.println("Ingrese un numero valido.");
                    }
                }
            }
            if(encontrado == false) {
                System.out.println("Pedido no encontrado.");
            }
        }
    }
}