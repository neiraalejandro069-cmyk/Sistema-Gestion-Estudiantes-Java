package Clases;
import java.util.ArrayList;
public class Carrito {
    private ArrayList<DetallePedido> detalles;
    public Carrito() {
        detalles = new ArrayList<>();
    }
    public void agregarAlmuerzo(DetallePedido detalle) {
        detalles.add(detalle);
    }
    public boolean eliminarAlmuerzo(int posicion) {
        if(posicion >= 0 && posicion < detalles.size()) {
            detalles.remove(posicion);
            return true;
        }
        return false;
    }
    public double calcularTotal() {
        double total = 0;
        for(int i = 0; i < detalles.size(); i++) {
            total += detalles.get(i).calcularSubtotal();
        }
        return total;
    }
    public void mostrarCarrito() {
        if(detalles.isEmpty()) {
            System.out.println("El carrito esta vacio.");
        } else {
            for(int i = 0; i < detalles.size(); i++) {
                System.out.println(i + ". " + detalles.get(i));
            }
            System.out.println("Total: S/ " + calcularTotal());
        }
    }
    public boolean estaVacio() {
        return detalles.isEmpty();
    }
    public ArrayList<DetallePedido> getDetalles() {
        return detalles;
    }
    public void vaciarCarrito() {
        detalles.clear();
    }
}