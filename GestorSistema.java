package Gestores;
import Clases.*;
import java.util.ArrayList;
import java.util.Scanner;
public class GestorSistema {
    private Scanner scanner;
    private Administrador administrador;
    private ArrayList<Almuerzo> almuerzos;
    private ArrayList<Pedido> pedidos;
    private Usuario usuarioActual;
    public GestorSistema() {
        scanner = new Scanner(System.in);
        administrador = new Administrador("admin","1234");
        almuerzos = new ArrayList<>();
        pedidos = new ArrayList<>();
        cargarAlmuerzos();
    }
    private void cargarAlmuerzos() {
        almuerzos.add(new Almuerzo(
                1,
                "Lomo Saltado",
                "Carne con arroz y papas",
                18.00
        ));
        almuerzos.add(new Almuerzo(
                2,
                "Arroz con Pollo",
                "Arroz verde con pollo",
                16.00
        ));
        almuerzos.add(new Almuerzo(
                3,
                "Aji de Gallina",
                "Gallina con crema y arroz",
                17.00
        ));
    }
    public void iniciarSistema() {
        int opcion = 0;
        do {
            System.out.println("1. Administrador");
            System.out.println("2. Cliente");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = leerOpcion();
            switch(opcion) {
                case 1:
                    iniciarSesionAdministrador();
                    break;
                case 2:
                    ingresarCliente();
                    break;
                case 3:
                    System.out.println("Gracias por usar nuestro aplicativo.");
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }
        } while(opcion != 3);
    }
    private int leerOpcion() {
        int opcion = 0;
        while(opcion == 0) {
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
                opcion = 0;
            }
        }
        return opcion;
    }
    private void iniciarSesionAdministrador() {
        System.out.print("Usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Contraseña: ");
        String clave = scanner.nextLine();
        if(administrador.getNombre().equals(nombre)
                &&
           administrador.validarContraseña(clave)) {
            System.out.println("Inicio de sesion correcto.");
            GestorPedido gestorPedido = new GestorPedido(almuerzos,pedidos,administrador);
            menuAdministrador(gestorPedido);
        } else {
            System.out.println("Datos incorrectos.");
        }
    }
    private void ingresarCliente() {
        boolean valido = false;
        while(valido == false) {
            System.out.print("Ingrese su nombre: ");
            String nombre =scanner.nextLine().trim();
            if(nombre.isEmpty()) {
                System.out.println("El nombre no puede estar vacio.");
            } else if(!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                System.out.println("El nombre solo debe contener letras.");
            } else {
                usuarioActual = new Usuario(nombre);
                System.out.println("Bienvenido " + usuarioActual.getNombre());
                GestorPedido gestorPedido = new GestorPedido(almuerzos,pedidos,usuarioActual);
                menuCliente(gestorPedido);
                valido = true;
            }
        }
    }
    private void menuCliente(
            GestorPedido gestorPedido
    ) {
        int opcion = 0;
        do {
            System.out.println("\nCLIENTE");
            System.out.println("1. Ver almuerzos");
            System.out.println("2. Agregar al carrito");
            System.out.println("3. Eliminar del carrito");
            System.out.println("4. Ver carrito");
            System.out.println("5. Confirmar pedido");
            System.out.println("6. Mis pedidos");
            System.out.println("7. Salir");
            System.out.print("Seleccione: ");
            opcion = leerOpcion();
            switch(opcion) {
                case 1:
                    gestorPedido.mostrarAlmuerzos();
                    break;
                case 2:
                    gestorPedido.agregarAlCarrito();
                    break;
                case 3:
                    gestorPedido.eliminarDelCarrito();
                    break;
                case 4:
                    gestorPedido.mostrarCarrito();
                    break;
                case 5:
                    gestorPedido.confirmarPedido();
                    break;
                case 6:
                    gestorPedido.mostrarMisPedidos();
                    break;
                case 7:
                    System.out.println("Sesion finalizada.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while(opcion != 7);
    }
    private void menuAdministrador(
            GestorPedido gestorPedido
    ) {
        int opcion = 0;
        do {
            System.out.println("\nADMINISTRADOR");
            System.out.println("1. Ver almuerzos");
            System.out.println("2. Ver pedidos");
            System.out.println("3. Cambiar estado pedido");
            System.out.println("4. Salir");
            System.out.print("Seleccione: ");
            opcion = leerOpcion();
            switch(opcion) {
                case 1:
                    gestorPedido.mostrarAlmuerzos();
                    break;
                case 2:
                    gestorPedido.mostrarPedidos();
                    break;
                case 3:
                    gestorPedido.cambiarEstadoPedido();
                    break;
                case 4:
                    System.out.println("Sesion cerrada.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while(opcion != 4);
    }
}